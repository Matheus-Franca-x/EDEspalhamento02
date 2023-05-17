package model;

import java.util.Objects;

public class Morador {

	
	private int numApart;
	private String nome;
	private Carro carro;
	
	public Morador(int numApart, String nome, Carro carro) 
	{
		this.numApart = numApart;
		this.nome = nome;
		this.carro = carro;
	}

	public int getNumApart() {
		return numApart;
	}

	public String getNome() {
		return nome;
	}

	public Carro getCarro() {
		return carro;
	}

	@Override
	public int hashCode() 
	{
		int posicao = (this.numApart / 100) - 1;
		return posicao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Morador other = (Morador) obj;
		return Objects.equals(carro, other.carro) && Objects.equals(nome, other.nome) && numApart == other.numApart;
	}

	@Override
	public String toString() {
		return "Morador [numApart=" + numApart + ", nome=" + nome + ", carro=" + carro.toString() + "]";
	}
	
	
	

}
