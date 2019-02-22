package br.com.farmacia.domain;

public class Fornecedores {

	private Long codigo;
	private String descricao;
	
	public Fornecedores() {
		
	}
	
	public Fornecedores(Long codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	

	public Long getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Fornecedores [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
	
	
	
}
