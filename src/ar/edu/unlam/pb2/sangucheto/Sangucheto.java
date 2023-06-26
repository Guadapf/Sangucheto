package ar.edu.unlam.pb2.sangucheto;

import java.util.ArrayList;

public class Sangucheto {
	
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	public Boolean agregarIngredientes(Ingrediente ingrediente) {
		
		if(ingrediente.getCantidad() > 0) {
			ingredientes.add(ingrediente);
			ingrediente.descontarCantidad(1);
			return true;
		}
		return false;
	}
	
	public void cancelarSangucheto() {
		ingredientes.clear();
	}
	
	
	public Double getPrecioSangucheto() {
		Double precio = 0.0;
		
		for(Ingrediente ingrediente : ingredientes) {
			precio += ingrediente.getPrecio();
		}
		return precio;
		
	}
	
	public ArrayList<Ingrediente> getSangucheto(){
		return ingredientes;
	}
	

}
