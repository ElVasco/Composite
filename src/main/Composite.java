package main;

import java.util.ArrayList;
import java.util.List;

//elemento que puede contener otros elementos
public class Composite extends Component{

	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	List<Component> elementos = new ArrayList<Component>();

	@Override
	public void agregar(Component component) {
		elementos.add(component);
	}

	@Override
	public void eliminar(Component component) {
		elementos.remove(component);
		
	}

	@Override
	public void mostrar() {
		System.out.println("Composite: " + name);
		System.out.println("elementos en el composite: " + elementos.size());
		for (Component component : elementos) {
			component.mostrar();
		}
	}

	
}
