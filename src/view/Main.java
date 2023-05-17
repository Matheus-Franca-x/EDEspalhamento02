package view;

import controller.AcessoCarro;
import model.Carro;
import model.Morador;

public class Main 
{
	
	public static void main(String[] args)
	{
		
		Carro c1 = new Carro("Corolla", "Branco", "JU317EU");
		Morador m1 = new Morador(101, "Luis", c1);
		
		Carro c2 = new Carro("Corolla", "Preto", "21FUD3U");
		Morador m2 = new Morador(501, "Matheus", c2);
		
		Carro c3 = new Carro("Corolla", "Rosa", "3UVWXU7");
		Morador m3 = new Morador(702, "David", c3);
		
		Carro c4 = new Carro("Corolla", "Azul", "SP20133");
		Morador m4 = new Morador(301, "Debora", c4);
		
		AcessoCarro controll = new AcessoCarro();
		
		controll.cadastrar(m1);
		controll.cadastrar(m2);
		controll.cadastrar(m3);
		controll.cadastrar(m4);
		
		Morador consulta = new Morador(501, null, null);
		
		try {
			consulta = controll.consultar(consulta);
			System.out.println(consulta.toString());
		} catch (Exception e) {
			System.err.println(e);
		}
		
		try {
			controll.excluir(consulta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		consulta = new Morador(501, null, null);
		
		try {
			consulta = controll.consultar(consulta);
			System.out.println(consulta.toString());
		} catch (Exception e) {
			System.err.println(e);
		}
		
		try {
			controll.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
