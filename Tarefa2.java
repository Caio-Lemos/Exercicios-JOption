package telapc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newlogin {

	private JFrame frame;
	private JTextArea intarea;
	private JTextArea intarea2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newlogin window = new newlogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public newlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(46, 59, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(46, 120, 45, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Mostrar os n\u00FAmeros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
						
					
int a = Integer.parseInt(intarea.getText());

int  b= Integer.parseInt(intarea2.getText());
String valor = "";

	for(int x = a; x <= b ; x++) {
		if(x>a && x < b) {
			valor = valor + "," +x; 
	}
	
		}
	
		JOptionPane.showMessageDialog(frame,"Valores entre"+ a + "e" + b +":" + valor);		

	

		


	
			}	
			}			
								
		);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(151, 178, 173, 39);
		frame.getContentPane().add(btnNewButton);
		
		intarea = new JTextArea();
		intarea.setBounds(165, 55, 140, 22);
		frame.getContentPane().add(intarea);
		
		intarea2 = new JTextArea();
		intarea2.setBounds(165, 124, 140, 22);
		frame.getContentPane().add(intarea2);
	

	
}
	}

