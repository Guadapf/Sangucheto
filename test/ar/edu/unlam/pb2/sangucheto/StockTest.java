package ar.edu.unlam.pb2.sangucheto;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class StockTest {

	@Test
	public void queSePuedaDarDeAltaUnIngrediente() {
		Ingrediente in1 = new Ingrediente("tomate", 20.0);
		Stock s1 = new Stock();
		
		
		assertTrue(s1.darDeAlta(in1));
	}
	
	@Test
	public void queAlDarDeAltaUnIngredienteSuCantidadSeaCero() { //4
		Ingrediente in1 = new Ingrediente("tomate", 20.0);
		Stock s1 = new Stock();
		

		Integer valorObtenido = in1.getCantidad();
		Integer valorEsperado = 0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queAlAgregarStockAUnIngredienteEsteSeIncremente() { //5
		Ingrediente in1 = new Ingrediente("tomate", 20.0);
		Stock s1 = new Stock();
		
		s1.darDeAlta(in1);
		s1.agregarStock(in1, 5);
		s1.agregarStock(in1, 5);
		
		Integer valorObtenido = in1.getCantidad();
		Integer valorEsperado = 10;
	
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queSeElimineElStockDeUnIngrediente() { //9
		Ingrediente in1 = new Ingrediente("tomate", 20.0);
		Stock s1 = new Stock();
		
		s1.darDeAlta(in1);
		s1.agregarStock(in1, 5);
		s1.eliminarStock(in1);
		
		Integer valorObtenido = in1.getCantidad();
		Integer valorEsperado = 0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queSeElimineUnIngredientePorCompleto() { //10
		Ingrediente in1 = new Ingrediente("tomate", 20.0);
		Stock s1 = new Stock();
		
		s1.darDeAlta(in1);
		s1.agregarStock(in1, 5);
		
		assertTrue(s1.eliminarIngrediente(in1));
	}
	
	@Test
	public void queSePuedanVerTodosLosIngredientesDisponibles() { //2
		Ingrediente in1 = new Ingrediente("Tomate", 20.0);
		Ingrediente in2 = new Ingrediente("Carne", 20.0);
		Stock s1 = new Stock();
		HashSet<Ingrediente> ingredientes = new HashSet<Ingrediente>();
		
		s1.darDeAlta(in1);
		s1.darDeAlta(in2);
		s1.agregarStock(in1, 5);
		s1.agregarStock(in2, 5);
		
		ingredientes.add(in1);
		ingredientes.add(in2);
		
		assertEquals(ingredientes, s1.getIngredientes());	
	}
	
	@Test
	public void queSeMuestreSiExisteUnIngrediente() { //7
		Ingrediente in1 = new Ingrediente("Tomate", 20.0);
		Stock s1 = new Stock();
		
		assertFalse(s1.existeElIngrediente(in1));
	}
	
	@Test
	public void queSePuedaVerElStockDisponibleDeUnIngrediente() { //6
		Ingrediente in1 = new Ingrediente("Tomate", 20.0);
		Ingrediente in2 = new Ingrediente("Carne", 20.0);
		Stock s1 = new Stock();
		
		s1.darDeAlta(in1);
		s1.darDeAlta(in2);
		s1.agregarStock(in1, 10);
		s1.agregarStock(in2, 5);
		
		Integer valorObtenido = s1.getStockDeIngrediente(in1);
		Integer valorEsperado = 10;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queAlComprarUnIngredienteSeDescuenteLaCantidadIndicada() { //8
		Ingrediente in1 = new Ingrediente("Tomate", 20.0);
		Stock s1 = new Stock();
		
		s1.darDeAlta(in1);
		s1.agregarStock(in1, 10);
		s1.comprarIngrediente(in1, 2);
		
		Integer valorObtenido = s1.getStockDeIngrediente(in1);
		Integer valorEsperado = 8;
		
		assertEquals(valorEsperado, valorObtenido,0.01);

	}

}
