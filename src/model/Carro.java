package model;

import java.util.Objects;

public class Carro {

	private String modelo;
	private String cor;
	private String placa;
	
	

	public Carro(String modelo, String cor, String placa) 
	{
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}

	public String getModeloCarro() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public String getPlaca() {
		return placa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, modelo, placa);
	}

	@Override
	public String toString() {
		return "[modelo=" + modelo+ ", cor=" + cor + ", placa=" + placa + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(placa, other.placa);
	}
	
	

}
