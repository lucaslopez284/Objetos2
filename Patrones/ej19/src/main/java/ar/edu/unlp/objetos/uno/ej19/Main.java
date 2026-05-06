package ar.edu.unlp.objetos.uno.ej19;

public class Main {

	public static void main(String[] args) {
		Archivo ejemplo1 = new ExtensionDecorator(new FileOO2("Lucas", ".py", "284 MB", "Lectura"));
		Archivo ejemplo2 = new ExtensionDecorator(new CreacionDecorator(new FileOO2("Lucas", ".py", "284 MB", "Lectura")));
		Archivo ejemplo3 = new ExtensionDecorator(new PermisosDecorator(new EspacioDecorator(new FileOO2("Lucas", ".py", "284 MB", "Lectura"))));
		System.out.println(ejemplo1.prettyPrint());
		System.out.println(ejemplo2.prettyPrint());
		System.out.println(ejemplo3.prettyPrint());
	}

}
