package ar.edu.unlam.pb2.sangucheto;

import java.util.HashSet;

public class Stock {
	
	private HashSet<Ingrediente> ingredientes = new HashSet<Ingrediente>();
	
	
	public Boolean darDeAlta(Ingrediente ingrediente) {
		return ingredientes.add(ingrediente);
	}
	
	public Boolean existeElIngrediente(Ingrediente ingrediente) {
		if(ingredientes.contains(ingrediente)) {
			return true;
		}
		return false;
	}
	
	public Boolean agregarStock(Ingrediente ingrediente, Integer cantidad) {
		if(existeElIngrediente(ingrediente)) {
			ingrediente.setCantidad(cantidad);
			return true;
		}
		return false;
	}
	
	public Integer getStockDeIngrediente(Ingrediente ingrediente) {
		if(existeElIngrediente(ingrediente)) {
			return ingrediente.getCantidad();
		}
		return null;
	}
	
	public Boolean eliminarStock(Ingrediente ingrediente) {
		if(existeElIngrediente(ingrediente)) {
			ingrediente.removerCantidad();
			return true;
		}
		return false;
	}
	
	public Boolean eliminarIngrediente(Ingrediente ingrediente) {
		if(existeElIngrediente(ingrediente)) {
			ingredientes.remove(ingrediente);
			return true;
		}
		return false;
	}
	
	public void comprarIngrediente(Ingrediente ingrediente, Integer cantidad) {
		if(ingrediente.getCantidad() >= cantidad) {
			ingrediente.descontarCantidad(cantidad);
		}
	}
	
	
	public HashSet<Ingrediente> getIngredientes(){
		return this.ingredientes;
	}

}
