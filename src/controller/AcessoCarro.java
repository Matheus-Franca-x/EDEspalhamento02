package controller;

import matheus.ListaObject.ListaObject;
import model.Morador;

public class AcessoCarro 
{
	
	private ListaObject[] moradia;
	
	public AcessoCarro()
	{
		moradia = new ListaObject[10];
		iniciaMoradia();
	}
	
	private void iniciaMoradia()
	{
		int tamanho = moradia.length;
		
		for (int i = 0; i < tamanho; i++)
		{
			moradia[i] = new ListaObject();			
		}
	}
	
	public void cadastrar(Morador personagem)
	{
		int posicao = personagem.hashCode();
		moradia[posicao].addFirst(personagem);
	}
	
	public Morador consultar(Morador personagem) throws Exception
	{
		int posicao = personagem.hashCode();
		int tamanho = moradia[posicao].size();
		
		for (int i = 0; i < tamanho; i++)
		{
			Morador m = (Morador) moradia[posicao].get(i);
			
			if (personagem.getNumApart() == m.getNumApart())
			{
				personagem = m;
				break;
			}
		}
		if (personagem.getNome() == null)
		{
			throw new Exception("Nao ha morador nessa belissima moradia");
		}
		
		return personagem;
	}
	
	public void excluir(Morador personagem) throws Exception
	{
		int posicao = personagem.hashCode();
		int tamanho = moradia[posicao].size();
		
		for (int i = 0; i < tamanho; i++)
		{
			Morador m = (Morador) moradia[posicao].get(i);
			
			if (personagem.getNumApart() == m.getNumApart())
			{
				moradia[posicao].remove(i);
				break;
			}
		}
	}
	
	public void listar() throws Exception
	{
		int tamanho = moradia.length;
		
		for (int i = 0; i < tamanho; i++)
		{
			int tamanho1 = moradia[i].size();
			for (int j = 0; j < tamanho1; j++)
			{
				Morador m = (Morador) moradia[i].get(j);
				System.out.println(m.toString());
			}
		}
		
	}
	
}
