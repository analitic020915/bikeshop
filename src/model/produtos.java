package model;

public class produtos {
	
	private int id_produto;
	private String nome_produto;
	private int valor;
	private int quantidade;
	
	
	public produtos() {
		super();
	}


	public produtos(int id_produto, String nome_produto, int valor, int quantidade) {
		super();
		this.setId_produto(id_produto);
		this.nome_produto = nome_produto;
		this.valor = valor;
		this.quantidade = quantidade;
	}


	public String getNome_produto() {
		return nome_produto;
	}


	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public int getId_produto() {
		return id_produto;
	}


	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	
	
	
	
	

}
