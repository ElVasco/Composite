package main;

//Componente que no puede tener hijos
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void agregar(Component component) {
		System.out.println("un leaf no puede contener elementos");
	}

	@Override
	public void eliminar(Component component) {
		System.out.println("un leaf no tiene elementos que eliminar");
		
	}

	@Override
	public void mostrar() {
		System.out.println("leaf " + name);
		
	}

}
