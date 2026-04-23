package ar.edu.unlp.objetos.uno.ej08;

public class Paused implements ToDoItemState {
	
	public Paused() {
		super();
	}

	@Override
	public void start(ToDoItem contexto) {
	}

	@Override
	public void togglePause(ToDoItem contexto) {
		contexto.setState(new InProgress());
		
	}

	@Override
	public void finish(ToDoItem contexto) {
		contexto.setState(new Finish());
	}

}
