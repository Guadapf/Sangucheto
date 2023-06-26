package ar.edu.unlam.pb2.sangucheto;


public class Ingrediente {
	
	private String nombre;
	private Integer cantidad;
	private Double precio;
	
	public Ingrediente(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = 0;
	}
	
	
	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad += cantidad;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}
	
	public void removerCantidad() {
		this.cantidad = 0;
	}
	
	public void descontarCantidad(Integer cantidad) {
		this.cantidad -= cantidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
