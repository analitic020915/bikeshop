package controller;

import java.util.ArrayList;

import model.Cliente;

public class ControleCLiente {
	// controlar atraveis de ArrayList metodo privado

	private ArrayList <Cliente> cliente = new ArrayList<>();

	
//	metodos da classe salvar
	
	public boolean Salvar (Cliente c) {
		
		if (c != null) {
			cliente.add(c);
			return true;
		}else {
			return false;
		}
		
	}
	// metodo da classe retorno dos dados 
	public ArrayList <Cliente> retornarTodos (){
		return cliente;
	}
}
