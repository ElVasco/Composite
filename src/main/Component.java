package main;

public abstract class Component {

	protected String name;
	
	public Component(String name) {
		super();
		this.name = name;
	}
	
	public abstract void agregar(Component component);
	public abstract void eliminar(Component component);
	public abstract void mostrar();
	
}
