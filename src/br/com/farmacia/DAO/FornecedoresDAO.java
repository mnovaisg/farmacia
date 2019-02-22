package br.com.farmacia.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.factory.ConexaoFactory;

public class FornecedoresDAO {
	
	public void salvar(Fornecedores f) throws SQLException{
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO fornecedores ");
		sql.append("(descricao)");
		sql.append("VALUES(?)");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1,f.getDescricao());
		comando.executeUpdate();
	}
	
	public void excluir(Fornecedores f) throws SQLException{
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("DELETE FROM FORNECEDORES ");
		sql.append("WHERE codigo = ?");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1,f.getCodigo());
		comando.executeUpdate();
		
	}
	
	
}
