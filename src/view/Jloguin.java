package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Jloguin extends JFrame {

	private JPanel contentPane;
	private JTextField textLoguin;
	private JPasswordField passwordFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jloguin frame = new Jloguin();
					frame.setLocationRelativeTo(null);//posiciona a tela no meio
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
	public Jloguin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 513, 393);
		panel_1.setForeground(new Color(230, 47, 47));
		panel_1.setBackground(new Color(204,207, 208));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(80, 117, 56, 14);
		panel_1.add(lblNewLabel);
		
		textLoguin = new JTextField();
		textLoguin.setBounds(146, 114, 248, 20);
		panel_1.add(textLoguin);
		textLoguin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(80, 160, 56, 14);
		panel_1.add(lblNewLabel_1);
		
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
						
				menu direciona_menu = new menu();
				
				//if(textLoguin.getText() =="admin"  && passwordFieldSenha.getText() == "admin"){
					//JOptionPane.showMessageDialog(btnNewButton, "informações validas!", "Seja bem Vindo",JOptionPane.INFORMATION_MESSAGE);
					//direciona.setVisible(true);
			//	} 
				if(textLoguin.getText()!=null && 
						!textLoguin.getText().isEmpty()&&    // a exclamação colocada esta negando meu codigo 
						passwordFieldSenha.getText()!= null &&
						!passwordFieldSenha.getText().isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton, "informações validas!", "Seja bem Vindo",JOptionPane.INFORMATION_MESSAGE);
					direciona_menu.setVisible(true);
					//direciona_menu.dispose();
					
				}else {
					JOptionPane.showMessageDialog(btnNewButton, "Verifique as informações.","aviso",JOptionPane.WARNING_MESSAGE);
				}	
			}
				
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(188, 247, 152, 50);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Seja bem vindo!");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(199, 62, 160, 20);
		panel_1.add(lblNewLabel_2);
		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(146, 158, 248, 20);
		panel_1.add(passwordFieldSenha);
		
		JLabel lblNewLabel_3 = new JLabel("imagem");
		lblNewLabel_3.setBounds(0, 0, 513, 393);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(Jloguin.class.getResource("/view_imagens/bike1.jpg")));
	}
}
