package ro.ase.csie.cts.g1087.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		
		TaskAsincron autoSave = new TaskToDo(new ModulAutosave(), "Autosave", 5);
		TaskAsincron autoUpdate = new TaskToDo(new ModulUpdateClient(), "Update v2", 20);

		//executie task-uri asincrone (manager)
		autoSave.executaTask();
		autoUpdate.executaTask();
		
	}
}
