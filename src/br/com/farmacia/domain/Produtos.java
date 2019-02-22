package br.com.farmacia.domain;

public class Produtos {
	
	private Long codigo;
	private String descri��o;
	private Long quantidade;
	private Double preco;
	private Fornecedores fornecedores;
	
	public Produtos() {
	}
	
	public Produtos(Long codigo, String descri��o) {
		this.codigo = codigo;
		this.descri��o = descri��o;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
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
		return "Produtos [codigo=" + codigo + ", descri��o=" + descri��o + ", quantidade=" + quantidade + ", preco="
				+ preco + ", fornecedores=" + fornecedores + "]";
	}

	
	
	

}
