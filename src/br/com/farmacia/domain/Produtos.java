package br.com.farmacia.domain;

public class Produtos {
	
	private Long codigo;
	private String descrição;
	private Long quantidade;
	private Double preco;
	private Fornecedores fornecedores;
	
	public Produtos() {
	}
	
	public Produtos(Long codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Fornecedores getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Fornecedores fornecedores) {
		this.fornecedores = fornecedores;
	}

	@Override
	public String toString() {
		return "Produtos [codigo=" + codigo + ", descrição=" + descrição + ", quantidade=" + quantidade + ", preco="
				+ preco + ", fornecedores=" + fornecedores + "]";
	}

	
	
	

}
