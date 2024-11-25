package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(1, "0915368540", "joaquin", "vallejo", "garzota", "0983443684", "jvallejo@hotmail.com");
		System.out.println(cliente.toString());
	}

}
