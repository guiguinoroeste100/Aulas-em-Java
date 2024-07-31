package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewLogin2 {

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
	    	   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	    		   if ("Nimbus".equals(info.getName())) {
	    			   javax.swing.UIManager.setLookAndFeel(info.getClassName());
	    			   break;
	    		   }
	    	   }
	       } catch (ClassNotFoundException | InstantiationException | IllegalAccessException  | javax.swing.UnsupportedLookAndFeelException ex) {
	    	   System.err.println(ex);
	       }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewLogin2 window = new viewLogin2();
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
	public viewLogin2() {
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
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(117, 105, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(117, 120, 164, 31);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(117, 147, 46, 20);
		frame.getContentPane().add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(117, 162, 164, 31);
		frame.getContentPane().add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin1(txtLogin.getText(), new String(txtSenha.getPassword()))) {
	        		JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!");
	        	}else {
	        	    JOptionPane.showMessageDialog(null, "Dados invalidos!" , "Meu titulo", JOptionPane.ERROR_MESSAGE); }
			}
		});
		btnEntrar.setBounds(159, 204, 89, 23);
		frame.getContentPane().add(btnEntrar);
	}
	
	public boolean checkLogin1(String login, String senha) {
        return login.equals("usuario") && senha.equals("123");
	}
}