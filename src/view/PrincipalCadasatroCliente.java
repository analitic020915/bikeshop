package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.ControleCLiente;
import dao.Conexao;
import model.Cliente;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings({ "serial" })
public class PrincipalCadasatroCliente extends JFrame {
	
ControleCliente cc = new ControleCliente();
	


	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtcpf;
	private JTextField txtnome;
	private JTextField txtemail;
	private JTextField txttelefone;
	private JTextField txtendereco;
	private JButton btnsalvar;
	private JButton btnSalvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalCadasatroCliente frame = new PrincipalCadasatroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	

	/**
	 * Create the frame.
	 */
	public PrincipalCadasatroCliente() {
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Cadastro de Clientes");
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 516);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(86, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtid = new JTextField();
		txtid.setBounds(86, 47, 54, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpf.setBounds(86, 78, 46, 14);
		contentPane.add(lblCpf);
		
		txtcpf = new JTextField();
		txtcpf.setColumns(10);
		txtcpf.setBounds(86, 103, 341, 20);
		contentPane.add(txtcpf);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(86, 134, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtnome = new JTextField();
		txtnome.setColumns(10);
		txtnome.setBounds(86, 159, 341, 20);
		contentPane.add(txtnome);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(86, 190, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(86, 215, 341, 20);
		contentPane.add(txtemail);
		
		JLabel lblNewLabel_1_3 = new JLabel("Telefone");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setBounds(86, 246, 67, 14);
		contentPane.add(lblNewLabel_1_3);
		
		txttelefone = new JTextField();
		txttelefone.setColumns(10);
		txttelefone.setBounds(86, 271, 341, 20);
		contentPane.add(txttelefone);
		
		JLabel lblNewLabel_1_4 = new JLabel("Endereço");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setBounds(86, 302, 67, 14);
		contentPane.add(lblNewLabel_1_4);
		
		txtendereco = new JTextField();
		txtendereco.setColumns(10);
		txtendereco.setBounds(86, 327, 341, 20);
		contentPane.add(txtendereco);
		
		JButton btnsair = new JButton("Sair");
		btnsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // metodo para  sair 
			}
			
		});
		btnsair.setBounds(342, 415, 119, 51);
		contentPane.add(btnsair);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			//cadastro de cliente
			
			
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conexao = new Conexao().getConnection();
					String sql = "insert into clientes(nome,senha) values('"+usuario+"','"+senha+"');";// comando de insert dos dados no banco de dados.
					 
					PreparedStatement prepare = conexao.prepareStatement(sql);
					 prepare.execute();
					  
					 //mensagem pos cadastro
					 JOptionPane.showMessageDialog(btnNewButton, "Usuario cadastrado",sql, JOptionPane.INFORMATION_MESSAGE);
					 
					 conexao.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	

		btnSalvar.setBounds(62, 415, 124, 51);
		contentPane.add(btnSalvar);

}
	}
