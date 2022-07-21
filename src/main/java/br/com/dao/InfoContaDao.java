package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import be.com.conectar.Conectar;
import br.com.model.InfoConta;

public class InfoContaDao {
	private Connection conexao;
	PreparedStatement stmt = null;
	
	public void locarEspaco() {
		try {
			conexao = Conectar.obterConexao();
			stmt = conexao.prepareStatement("INSERT INTO infocontacasal" + "()"+"VALUES ()");
			stmt.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void gravarPrimeiro(InfoConta infoConta, int Id) {
		try {
			conexao = Conectar.obterConexao();
			stmt = conexao.prepareStatement("update infocontacasal set datacasamento = '"+infoConta.getDataCasamento()+"',enderecoacesso ='"+infoConta.getEnderecoAcesso()+"' where idinfoconta="+Id+"");
			stmt.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public InfoConta buscarPorId(int Id){
		InfoConta infoConta = null;
		try {
			conexao = Conectar.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM infocontacasal where idinfoconta=?");
			stmt.setInt(1, Id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			infoConta = new InfoConta(rs.getString("nomecasal"),rs.getString("datacasamento"), rs.getString("cidade"), rs.getString("estado"),rs.getString("enderecoacesso"), rs.getString("textodescritivo"));
			conexao.close();
			return infoConta;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void atualizarInfoConta(InfoConta infoConta, int Id) {
		try {
			conexao = Conectar.obterConexao();
			String nomeCasal = infoConta.getNomeCasal();
			String dataCasamento = infoConta.getDataCasamento();
			String cidade = infoConta.getCidade();
			String estado = infoConta.getEstado();
			String enderecoAcesso = infoConta.getEnderecoAcesso();
			String textoDescritivo = infoConta.getTextoDescritivo();
			stmt = conexao.prepareStatement("update infocontacasal set nomecasal = '"+nomeCasal+"',datacasamento ='"+dataCasamento+"', cidade='"+cidade+"', estado='"+estado+"', enderecoacesso='"+enderecoAcesso+"', textodescritivo='"+textoDescritivo+"' where idinfoconta="+Id+"");
			stmt.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
