package model;

public class CadastroLoguinUsuario {
	private int id;
	private String Usuario;
	private int senha;
	
	// metodo constructor 
	
	
	public CadastroLoguinUsuario(String usuario, int senha) {
		super();
		this.Usuario = usuario;
		this.senha = senha;
		
		
		
		// getters e setters
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
}
