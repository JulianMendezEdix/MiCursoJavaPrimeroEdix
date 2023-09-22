package testing;

import java.util.Scanner;

import modelo.dao.ImplList.OficinaDaoImplList;
import modelo.dao.*;
import modelo.javabean.Oficina;

public class TestBanco {

	private static Scanner leer;

	static {
		leer = new Scanner (System.in);
	}
	
	public static void main(String[] args) {
		
		OficinaDao miBanco = new OficinaDaoImplList("Banco Santander");
		
		/*
		 * Voy a recorreo el arraylist del buscarTodos con el for mejorado y con el for clasico
		 */
		
		for (Oficina ele: miBanco.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println("");
		
		for (int i=0; i<miBanco.buscarTodos().size();i++) {
			System.out.println(miBanco.buscarTodos().get(i));
		}
		
		System.out.println(" ");
		System.out.println(miBanco.altaOficina(new Oficina(9001, "jsalksj", "alskdjlaskd", "0938409348", "Madrid")));
		/* la 9001  no entra poruqe el ID 9001 ya existe, que es la oficina de MAdrid 1*/
		System.out.println(miBanco.altaOficina(new Oficina(9055, "Sevilla 1", "asdasdasdasd", "958232323", "Sevilla")));
		
		System.out.println(" ");
		for (Oficina ele: miBanco.buscarTodos()) 
			System.out.println(ele);
		/*Cuando hay una unica sentenci en el FOR no hacen falta las llaves, igula que en el if y el else*/
		
		System.out.println(" ");
		System.out.println(miBanco.eliminarOficina(miBanco.buscarTodos().get(0))); /*Uso el get para obtener un objeto
		oficina del arrayList, ya que no he creado variables para crear los objetos.*/
		
		for (Oficina ele: miBanco.buscarTodos())
			System.out.println(ele);
		
		System.out.println(" ");
		miBanco.modificarOficina(new Oficina(9001, null, null, null, null));
		for (Oficina ele: miBanco.buscarTodos())
			System.out.println(ele);
		
		System.out.println(" ");
		System.out.println(miBanco.buscarOficina(9055));
		
		System.out.println(" ");
		System.out.println(miBanco.buscarPorCiudad("Sevilla"));
		
		
		
		
		
		
		

	}

}
