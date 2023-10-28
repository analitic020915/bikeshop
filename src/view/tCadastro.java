package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CadastroUsuarioController;
import dao.Conexao;
import dao.UsuarioDao;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class tCadastro extends JFrame {
	
	// usando o controlador 
	private final CadastroUsuarioController controller;

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tCadastro frame = new tCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
// criando getrs e seters para acessar em outra classe

	

	/**
	 * Create the frame.
	 */
	public tCadastro() {
	
		controller = new CadastroUsuarioController(this);
		
		
		
		
		
		
		//dados design
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 414, 240);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(59, 37, 62, 22);
		panel.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(59, 94, 62, 22);
		panel.add(lblSenha);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(131, 38, 212, 20);
		panel.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		// dados para insertar no banco de dados e salvar para cadastro de usuario
		JButton btnNewButton = new JButton("Salvar");
						
			btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
			
					Jloguin loguin = new Jloguin();
					
					controller.salvarUsuario();	
				
				}
				
		});
			
			
		btnNewButton.setBounds(158, 152, 108, 40);
		panel.add(btnNewButton);
		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(131, 95, 212, 20);
		panel.add(passwordFieldSenha);
	}



	public JTextField getTextFieldUsuario() {
		return textFieldUsuario;
	}



	public void setTextFieldUsuario(JTextField textFieldUsuario) {
		this.textFieldUsuario = textFieldUsuario;
	}



	public JPasswordField getPasswordFieldSenha() {
		return passwordFieldSenha;
	}



	public void setPasswordFieldSenha(JPasswordField passwordFieldSenha) {
		this.passwordFieldSenha = passwordFieldSenha;
	}

}
