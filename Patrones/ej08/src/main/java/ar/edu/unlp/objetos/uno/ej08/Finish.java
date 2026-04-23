package ar.edu.unlp.objetos.uno.ej08;

public class Finish implements ToDoItemState {
	
	public Finish() {
		super();
	}

	@Override
	public void start(ToDoItem contexto) {
	}

	@Override
	public void togglePause(ToDoItem contexto) {
		throw new RuntimeException("No se puede pausar algo terminado");
	}

	@Override
	public void finish(ToDoItem contexto) {
	}

}
