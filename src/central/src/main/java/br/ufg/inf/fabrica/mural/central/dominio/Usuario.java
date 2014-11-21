package br.ufg.inf.fabrica.mural.central.dominio;
public class Usuario {
	private long id;
	private String login;
	private String senha;
	private boolean apenasProdutor;
	
	public boolean isAdministrador() {
		return !apenasProdutor;
	}
}
