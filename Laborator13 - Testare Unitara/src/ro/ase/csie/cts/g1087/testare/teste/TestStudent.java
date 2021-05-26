package ro.ase.csie.cts.g1087.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1087.testare.exceptii.ExceptieNota;
import ro.ase.csie.cts.g1087.testare.exceptii.ExceptieNume;
import ro.ase.csie.cts.g1087.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.g1087.testare.modele.Student;

public class TestStudent {
	
	//TestFixture = datele de care te folosesti in Test case
	//definim referinta la nivelul clasei
	static Student student; //am acces la student din toate Unit Testele
	static ArrayList<Integer> note;
	
	static String numeInitial = "Gigel";
	static int varstaInitiala = 21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//se executa o singura clasa inainte de toate unit Testele
		note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(8);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//se executa o singura data la final 
		//destructor logic: inchizi accesul la resurse (conexiuni BD, fisiere...)
		note.clear();
		note = null;
	}

	@Before
	public void setUp() throws Exception {
		//se executa inainte de fiecare unit test
		student = new Student(numeInitial, varstaInitiala, note);
	}

	@After
	public void tearDown() throws Exception {
		//se executa dupa fiecare unit test
		student = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVarstaValoriNormaleRight() throws ExceptieVarsta {
		//int varstaNoua = 22;
		int varstaNoua = Student.MIN_VARSTA + 1;
		//int varstaNoua = Student.MAX_VARSTA - 1;
		student.setVarsta(varstaNoua);
		
		assertEquals("Testare cu valori ok", varstaNoua, student.getVarsta());
	}
	
	@Test
	public void testSetNumeRight() {
		
		String numeNou = "Ionel";
		try {
			
			student.setNume(numeNou);
			assertEquals("Test cu valori corecte", numeNou, student.getNume());
			
		} catch (ExceptieNume e) {
			fail("Am primit exceptie pentru valori normale");
		}	
	}
	
	@Test
	public void testSetVarstaErrorConditionsValoriNegative() {
		int varstaNoua = -100; //in afara intervalului
		try {
			
			student.setVarsta(varstaNoua);
			fail("Nu am primit exceptie pentru varsta cu valori negative");
			
		} catch (ExceptieVarsta e) {
			assertTrue(true); //inchide testul si-l marcheaza cu succes
		}
		
		
	}
	
	//cand vrei sa primesti exceptie, fara ca testul sa esueze
	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaErrorConditionsValoriMari() throws ExceptieVarsta {
		int varstaNoua = Student.MAX_VARSTA + 100;
		student.setVarsta(varstaNoua);
	}
	
	@Test
	public void testGetNotaMinimaOrderingSortateCrescator() throws ExceptieNota {
		int notaMinima = 4;
		ArrayList<Integer> noteSortate = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			noteSortate.add(notaMinima + i);
		}
		student.setNote(noteSortate);
		
		int notaDeterminata = student.getNotaMinima();
		assertEquals("Test cu note sortate crescator", notaMinima, notaDeterminata);
	}
	
	@Test
	public void testGetNotaMinimaCardinalityZero() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		
		int notaMinima = 0;
		int notaMinimaCalculata = student.getNotaMinima();
		
		assertEquals("Test fara note", notaMinima, notaMinimaCalculata);
	}
	
	@Test
	public void testGetNotaMinimaCardinalityUnu() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(Student.MAX_NOTA);
		student.setNote(note);
		
		int notaMinima = Student.MAX_NOTA;
		int notaMinimaCalculata = student.getNotaMinima();
		
		assertEquals("Test cu o singura nota", notaMinima, notaMinimaCalculata);
	}
	
	@Test
	public void testGetNotaMinimaExistenceReferintaNull() throws ExceptieNota {
		student.setNote(null);
		
		int notaMinima = 0;
		int notaMinimaCalculata = student.getNotaMinima();
		
		assertEquals("Test cu referinta null pentru note", notaMinima, notaMinimaCalculata);
	}
	
}
