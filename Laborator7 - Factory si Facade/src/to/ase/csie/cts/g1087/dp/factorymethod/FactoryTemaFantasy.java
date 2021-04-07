package to.ase.csie.cts.g1087.dp.factorymethod;

import to.ase.csie.cts.g1087.dp.simplefactory.CaracterDCComics;
import to.ase.csie.cts.g1087.dp.simplefactory.CaracterDisney;
import to.ase.csie.cts.g1087.dp.simplefactory.CaracterMarvel;
import to.ase.csie.cts.g1087.dp.simplefactory.SuperErouAbstract;
import to.ase.csie.cts.g1087.dp.simplefactory.TipErou;


public class FactoryTemaFantasy extends FactoryAbstract{


	@Override
	public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		SuperErouAbstract superErou = null;
		switch(tip) {
		case DISNEY:
			superErou = new CaracterFantasyDisney(nume, 100);
			break;
		case MARVEL:
			superErou = new CaracterFantasyMarvel(nume, 500);
			break;
		case DC:
			superErou = new CaracterFantasyDCComics(nume, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return superErou;	
	}
	

}
