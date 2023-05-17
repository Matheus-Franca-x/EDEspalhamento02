package model;

import java.util.Objects;

public class Carro {

	private String modeloCarro;
	private String cor;
	private String placa;
	
	

	public Carro(String modeloCarro, String cor, String placa) 
	{
		this.modeloCarro = modeloCarro;
		this.cor = cor;
		this.placa = placa;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public String getCor() {
		return cor;
	}

	public String getPlaca() {
		return placa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, modeloCarro, placa);
	}

	@Override
	public String toString() {
		return "[modeloCarro=" + modeloCarro + ", cor=" + cor + ", placa=" + placa + "]";
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
		return Objects.equals(cor, other.cor) && Objects.equals(modeloCarro, other.modeloCarro)
				&& Objects.equals(placa, other.placa);
	}
	
	

}
