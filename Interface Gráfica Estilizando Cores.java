package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewPrimeiraTela {

	private JFrame frame;
	private JLabel lblNome;
	private JTextField txtNome;

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
					ViewPrimeiraTela window = new ViewPrimeiraTela();
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
	public ViewPrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(147, 147, 92, 29);
		btnMostrar.addActionListener((ActionListener) new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Nome:  "+txtNome.getText());				
			}
	
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnMostrar);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(129, 95, 46, 14);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(120, 112, 156, 29);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
	}
}
  
    	 
       



