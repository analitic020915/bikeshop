package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import model.CadastroLoguinUsuario;

//responsavel de todos imputs 
public class UsuarioDao {
	
	private final Connection connecte;

	public UsuarioDao(Connection connecte) {
		super();
		this.connecte = connecte;
	} 

	
	//função para insertar no banco de dados cadastro de usuario
	
	public void insert (CadastroLoguinUsuario usuario ) throws SQLException {
		
			String sql = "insert into clientes(nome,senha) values('"+usuario.getUsuario()+",'"+usuario.getSenha()+"');";// comando de insert dos dados no banco de dados.		 
			PreparedStatement prepare = connecte.prepareStatement(sql);
			 prepare.execute();			 
			 connecte.close();
				
	}
	// inserir no banco de dados cadastro de usuario
	
	
}
