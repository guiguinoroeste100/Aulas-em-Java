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
	       } catch (ClassNotFoundException ex) {
	    	   System.err.println(ex);
	       } catch (InstantiationException ex) {
	    	   System.err.println(ex);
	       } catch (IllegalAccessException ex) {
	    	   System.err.println(ex);
	       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
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
		frame.getContentPane().setLayout(null);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener((ActionListener) new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Nome:  "+txtNome.getText());				
			}
	
		});
		btnMostrar.setBounds(160, 152, 89, 23);
		frame.getContentPane().add(btnMostrar);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(139, 102, 46, 14);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(139, 121, 164, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
	}
}
  
    	 
       



