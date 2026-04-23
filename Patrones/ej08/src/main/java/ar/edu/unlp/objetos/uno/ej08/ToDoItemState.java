package ar.edu.unlp.objetos.uno.ej08;

public interface ToDoItemState {
	
	public abstract void start(ToDoItem contexto);
    public abstract void togglePause(ToDoItem contexto);
    public abstract void finish(ToDoItem contexto);
    
}
