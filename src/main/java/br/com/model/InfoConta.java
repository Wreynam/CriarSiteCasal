package br.com.model;

public class InfoConta {
	private Integer id;
	private String nomeCasal;
	private String dataCasamento;
	private String cidade;
	private String estado;
	private String enderecoAcesso;
	private String textoDescritivo;
	private String nomeFotoCasal;
	
	public InfoConta(String DataCasamento, String EnderecoAcesso) {
		this.dataCasamento = DataCasamento;
		this.enderecoAcesso = EnderecoAcesso;
	}
	public InfoConta(String NomeCasal, String DataCasamento, String Cidade, String Estado, String EnderecoAcesso, String TextoDescritivo) {
		this.nomeCasal = NomeCasal;
		this.dataCasamento = DataCasamento;
		this.cidade = Cidade;
		this.estado = Estado;
		this.enderecoAcesso = EnderecoAcesso;
		this.textoDescritivo = TextoDescritivo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeCasal() {
		return nomeCasal;
	}
	public void setNomeCasal(String nomeCasal) {
		this.nomeCasal = nomeCasal;
	}
	public String getDataCasamento() {
		return dataCasamento;
	}
	public void setDataCasamento(String dataCasamento) {
		this.dataCasamento = dataCasamento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEnderecoAcesso() {
		return enderecoAcesso;
	}
	public void setEnderecoAcesso(String enderecoAcesso) {
		this.enderecoAcesso = enderecoAcesso;
	}
	public String getTextoDescritivo() {
		return textoDescritivo;
	}
	public void setTextoDescritivo(String textoDescritivo) {
		this.textoDescritivo = textoDescritivo;
	}
	public String getNomeFotoCasal() {
		return nomeFotoCasal;
	}
	public void setNomeFotoCasal(String nomeFotoCasal) {
		this.nomeFotoCasal = nomeFotoCasal;
	}
	
	
}
