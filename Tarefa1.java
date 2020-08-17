package telapc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
public class ab extends JFrame {

	private JPanel contentPane;
	private JTextField txtlogin;
	private JPasswordField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ab frame = new ab();
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
	public ab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login :");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 51, 85, 26);
		contentPane.add(lblNewLabel);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(94, 47, 307, 32);
		contentPane.add(txtlogin);
		txtlogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha :");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 124, 51, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(checklogin(txtlogin.getText(),new String(txtsenha.getPassword()) )) {
					
					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema !");
					
				}else {
					JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
					
				}
			
			}
		});
		btnNewButton.setBounds(170, 188, 124, 46);
		contentPane.add(btnNewButton);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(94, 120, 307, 32);
		contentPane.add(txtsenha);
	}
	
	public boolean checklogin(String login, String senha) {
		return login.equals("admin") && senha.contentEquals("swordfish");
	}
}
