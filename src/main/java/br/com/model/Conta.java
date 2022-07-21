package br.com.model;
public class Conta {
	private Integer id;
	private String email;
	private String senha;
	private String nome;
	private String nomeAmor;
	private String emailAmor;
	private String telefone;
	private String sobre;
	private String nomeFoto;
	
	public Conta( String Senha) {
		this.senha = Senha;
	}
	public Conta(String Email, String Senha) {
		this.email = Email;
		this.senha = Senha;
	}
	public Conta(String NomeAmor, String EmailAmor, Boolean t) {
		this.nomeAmor = NomeAmor;
		this.emailAmor = EmailAmor;
	}
	public Conta(int Id,String Nome, String Email, Boolean t) {
		this.id = Id;
		this.nome = Nome;
		this.email = Email;
	}
	public Conta(int ID, String Email, String Senha) {
		this.id = ID;
		this.email = Email;
		this.senha = Senha;
	}
	public Conta(String Nome, String Email, String Senha) {
		this.nome = Nome;
		this.email = Email;
		this.senha = Senha;
	}
	public Conta(String Nome, String Email,String Telefone, String Sobre) {
		this.nome = Nome;
		this.email = Email;
		this.telefone = Telefone;
		this.sobre = Sobre;
	}
	public Conta(Integer Id,String Nome, String Email,String Telefone, String Sobre, String NomeFoto) {
		this.id = Id;
		this.nome = Nome;
		this.email = Email;
		this.telefone = Telefone;
		this.sobre = Sobre;
		this.nomeFoto = NomeFoto;
	}
	public String getNomeAmor() {
		return nomeAmor;
	}
	public void setNomeAmor(String nomeAmor) {
		this.nomeAmor = nomeAmor;
	}
	public String getEmailAmor() {
		return emailAmor;
	}

	public void setEmailAmor(String emailAmor) {
		this.emailAmor = emailAmor;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSobre() {
		return sobre;
	}
	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	public String getNomeFoto() {
		return nomeFoto;
	}
	public void setNomeFoto(String nomeFoto) {
		this.nomeFoto = nomeFoto;
	}
	
	
}
