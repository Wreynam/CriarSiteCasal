package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import be.com.conectar.Conectar;
import br.com.model.Conta;


public class ContaDao {
	private Connection conexao;
	PreparedStatement stmt = null;
	
	public void gravar(Conta conta) {
		try {
			conexao = Conectar.obterConexao();
			stmt = conexao.prepareStatement("INSERT INTO conta" + "(nome,email,senha)"+"VALUES (?,?,?)");
			stmt.setString(1, conta.getNome());
			stmt.setString(2, conta.getEmail());
			stmt.setString(3, conta.getSenha());
			stmt.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void gravarPrimeiro(Conta conta, int Id) {
		try {
			conexao = Conectar.obterConexao();
			String nomeAmor = conta.getNomeAmor();
			String emailAmor = conta.getEmailAmor();
			stmt = conexao.prepareStatement("update conta set nomeamor = '"+nomeAmor+"',emailamor ='"+emailAmor+"' where idconta="+Id+"");
			stmt.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void atualizarConta(Conta conta, int Id) {
		try {
			conexao = Conectar.obterConexao();
			String nome = conta.getNome();
			String email = conta.getEmail();
			String telefone = conta.getTelefone();
			String sobre = conta.getSobre();
			stmt = conexao.prepareStatement("update conta set nome = '"+nome+"',email ='"+email+"', telefone='"+telefone+"', sobre='"+sobre+"' where idconta="+Id+"");
			stmt.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public Conta verificarLogin(Conta conta){
		try {
			conexao = Conectar.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM conta");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Conta contaLogada = new Conta(rs.getInt(1),rs.getString("email"), rs.getString("senha"));
				if(conta.getEmail().equals(contaLogada.getEmail())&& conta.getSenha().equals(contaLogada.getSenha())) {
					return contaLogada;
				}
			}
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Conta verificarExiste(Conta conta){
		try {
			conexao = Conectar.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM conta");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
				Conta contaExiste = new Conta(rs.getInt("idconta"),rs.getString("nome"),rs.getString("email"), true);
				if(conta.getNome().equals(contaExiste.getNome())&& conta.getEmail().equals(contaExiste.getEmail())) {
					return contaExiste;
				}
			}
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Conta buscarPorId(int Id){
		Conta conta = null;
		try {
			conexao = Conectar.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM conta where idconta=?");
			stmt.setInt(1, Id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			conta = new Conta(rs.getString("nome"),rs.getString("email"), rs.getString("telefone"), rs.getString("sobre"));
			conexao.close();
			return conta;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conta;
	}
	public Conta buscarPorIdSenha(int Id){
		Conta conta = null;
		try {
			conexao = Conectar.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM conta where idconta=?");
			stmt.setInt(1, Id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			conta = new Conta(rs.getString("senha"));
			conexao.close();
			return conta;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conta;
	}
	public void atualizarContaSenha(Conta conta, int Id) {
		try {
			conexao = Conectar.obterConexao();
			String senha = conta.getSenha();
			
			stmt = conexao.prepareStatement("update conta set senha = '"+senha+"' where idconta="+Id+"");
			stmt.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
