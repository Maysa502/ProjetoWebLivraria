package br.com.weblivraria.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A classe conexão estabelece a conexão com o banco de dados MYSQL.
 * Nesta classe, temos os seguintes metodos:(<br>) - Quebra de linha
 *
 * - AbrirConexão <br>
 * - FecharConexão  
 *  
 */
public abstract class Conexao {
	protected Connection con = null;
	protected PreparedStatement pst = null;
	protected ResultSet rs = null;
	
	public boolean abrirConexao() {

		boolean ab = true;
		// Vamos tentar abrir a conexão do banco de bados e caso de algum erro, iremos tratar com catch especifico para database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3784/livrariadb", "root", "senac@123");
		}
		catch(ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			ab = false;
			e.printStackTrace();
		}
		catch(SQLException se) {
			ab = false;
			se.printStackTrace();
		}
		catch(Exception ex) {
			ab = false;
			System.out.println("Erro Inesperado");
			ex.printStackTrace();
		}
		return ab;
	}
	
	public boolean fecharConexao() {
		boolean fc = true;
		try {
			con.close();
		}
		catch(SQLException se) {
			fc = false;
			se.printStackTrace();
		}
		catch(Exception ex) {
			fc = false;
			ex.printStackTrace();
		}
		return fc;
	}
}


