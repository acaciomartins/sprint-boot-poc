package com.poc.model;

public class CEPResponse {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getSiafi() {
		return siafi;
	}

	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("CEP: " + this.cep + ", ");
		str.append("logradouro: " + this.logradouro + ", ");
		str.append("complemento: " + this.complemento + ", ");
		str.append("bairro: " + this.bairro + ", ");
		str.append("localidade: " + this.localidade + ", ");
		str.append("ibge: " + this.ibge + ", ");
		str.append("gia: " + this.gia + ", ");
		str.append("ddd: " + this.ddd + ", ");
		str.append("siafi: " + this.siafi + ", ");
		str.append("uf: " + this.uf);

		return str.toString();
	}
}
