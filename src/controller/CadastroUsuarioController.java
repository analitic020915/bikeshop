package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Conexao;
import view.tCadastro;

public class CadastroUsuarioController {

	private  tCadastro view;

	public CadastroUsuarioController(tCadastro view) {
		this.view = view;
	}
	
	//solicita e salva o cadastro
	
	public void salvarUsuario() {

	String usuario = view.getTextFieldUsuario().getText();;	// para acessar o campo usuario
	String senha= view.getPasswordFieldSenha().getText();
	
	try {
		Connection conexao = new Conexao().getConnection();
		String sql = "insert into clientes(nome,senha) values('"+usuario+"','"+senha+"');";// comando de insert dos dados no banco de dados.
		 
		PreparedStatement prepare = conexao.prepareStatement(sql);
		 prepare.execute();  
		 //mensagem pos cadastro
		 JOptionPane.showMessageDialog(null, "Usuario cadastrado",sql, JOptionPane.INFORMATION_MESSAGE);
		 
		 conexao.close();
		 this.view.dispose(); // fecha e retorna a tela anterior
		
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}		
}
}	