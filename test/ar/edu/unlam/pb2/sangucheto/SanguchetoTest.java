package ar.edu.unlam.pb2.sangucheto;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SanguchetoTest {

	@Test
	public void queSePuedanAgregarIngredientesAlSangucheto() { //1
		Ingrediente in1 = new Ingrediente("Tomate", 20.0);
		Ingrediente in2 = new Ingrediente("Carne", 20.0);
		Ingrediente in3 = new Ingrediente("Lechuga", 20.0);
		Sangucheto san = new Sangucheto();
		Stock st = new Stock();
		
		st.darDeAlta(in1);
		st.darDeAlta(in2);
		st.darDeAlta(in3);
		st.agregarStock(in1, 5);
		st.agregarStock(in2, 5);
		st.agregarStock(in3, 5);
		
		assertTrue(san.agregarIngredientes(in1));
		assertTrue(san.agregarIngredientes(in2));
		assertTrue(san.agregarIngredientes(in3));
	}
	
	@Test
	public void queSePuedaVerElPrecioAMedidaQueSeArma() { //1
		Ingrediente in1 = new Ingrediente("Tomate", 20.0);
		Ingrediente in2 = new Ingrediente("Carne", 20.0);
		Sangucheto san = new Sangucheto();
		Stock st = new Stock();
		
		st.darDeAlta(in1);
		st.darDeAlta(in2);
		st.agregarStock(in1, 5);
		st.agregarStock(in2, 5);
		
		san.agregarIngredientes(in1);
		san.agregarIngredientes(in2);
		
		Double valorObtenido = san.getPrecioSangucheto();
		Double valorEsperado = 40.0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queSeMuestrenTodosLosIngredientesUtilizados() { //1
		Ingrediente in1 = new Ingrediente("Tomate", 20.0);
		Ingrediente in2 = new Ingrediente("Carne", 20.0);
		Sangucheto san = new Sangucheto();
		Stock st = new Stock();
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		
		st.darDeAlta(in1);
		st.darDeAlta(in2);
		st.agregarStock(in1, 5);
		st.agregarStock(in2, 5);
		
		san.agregarIngredientes(in1);
		san.agregarIngredientes(in2);
		
		ingredientes.add(in1);
		ingredientes.add(in2);
		
		
		assertEquals(ingredientes, san.getSangucheto());
	}
	
	@Test
	public void queEnMedioDelArmadoSeCancele() { //1
		Ingrediente in1 = new Ingrediente("Tomate", 20.0);
		Ingrediente in2 = new Ingrediente("Carne", 20.0);
		Sangucheto san = new Sangucheto();
		Stock st = new Stock();
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		
		st.darDeAlta(in1);
		st.darDeAlta(in2);
		st.agregarStock(in1, 5);
		st.agregarStock(in2, 5);
		
		san.agregarIngredientes(in1);
		san.agregarIngredientes(in2);
		san.cancelarSangucheto();
		
		assertEquals(ingredientes, san.getSangucheto());
	}

}
