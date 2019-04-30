package main;

public class Main {

	public static void main(String[] args) {
		Composite root = new Composite("Ventana principal");
		root.agregar(new Leaf("titulo"));
		
		Composite panel = new Composite("panel");
		panel.agregar(new Leaf("texto"));
		panel.agregar(new Leaf("boton"));
		
		root.agregar(panel);
		
		root.mostrar();
	}

}
