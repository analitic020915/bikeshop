package model;

public class Cliente {
	//criando as propriedades
	private String Id;
	private String cpf;
	private String nome;
	private String Email;
	private String Telefone;
	private String Endereco;
	
	// criando os construtores vazio  utilizando o comando ALt+S.
	public Cliente(String id, String cpf, String nome, String email, String telefone, String endereco) {
		super();
		this.Id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.Email = email;
		this.Telefone = telefone;
		this.Endereco = endereco;
	}
   // construtor vazio caso precise instanciar.
	public Cliente() {
		
	}
   //get e seters
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	
}