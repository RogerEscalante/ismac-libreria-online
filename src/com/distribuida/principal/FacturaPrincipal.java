package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(1, "0915368540", "joaquin", "vallejo", "garzota", "0983443684", "jvallejo@hotmail.com");
		Factura factura = new Factura();
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-001-001-0000001");
		factura.setFecha(new Date());
		factura.setTotalNeto(100.50);
		factura.setIva(15.30);
		factura.setTotal(116.20);
		factura.setCliente(cliente);
		System.out.println(factura.toString());
	}

}
