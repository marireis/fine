package model;

public class Ingrediente {
	
	private String nome;
	private double quantidade;
	private boolean adicionadoAoProduto;
	
	public Ingrediente(){
		this.nome = nome;
		this.quantidade = quantidade;
		this.adicionadoAoProduto = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isAdicionadoAoProduto() {
		return adicionadoAoProduto;
	}

	public void setAdicionadoAoProduto(boolean adicionadoAoProduto) {
		this.adicionadoAoProduto = adicionadoAoProduto;
	}

}
