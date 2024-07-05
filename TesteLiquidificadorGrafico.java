package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TesteLiquidificadorGrafico {

	private JFrame frame;
	private JTextField jTFEstado;
	private JTextField jTFVelocidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteLiquidificadorGrafico window = new TesteLiquidificadorGrafico();
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
	public TesteLiquidificadorGrafico() {
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
		
		JLabel jLBEstado = new JLabel("Estado");
		jLBEstado.setBounds(30, 24, 65, 20);
		frame.getContentPane().add(jLBEstado);
		
		jTFEstado = new JTextField();
		jTFEstado.setText("Desligado");
		jTFEstado.setEditable(false);
		jTFEstado.setBounds(21, 66, 86, 20);
		frame.getContentPane().add(jTFEstado);
		jTFEstado.setColumns(10);
		
		JLabel jLBVelocidade = new JLabel("Velocidade");
		jLBVelocidade.setBounds(30, 112, 65, 14);
		frame.getContentPane().add(jLBVelocidade);
		
		jTFVelocidade = new JTextField();
		jTFVelocidade.setEditable(false);
		jTFVelocidade.setText("0");
		jTFVelocidade.setBounds(21, 159, 86, 20);
		frame.getContentPane().add(jTFVelocidade);
		jTFVelocidade.setColumns(10);
		
		JButton jBMais = new JButton("+");
		jBMais.setBounds(143, 53, 89, 56);
		frame.getContentPane().add(jBMais);
		
		JButton jBMenos = new JButton("-");
		jBMenos.setBounds(143, 120, 89, 59);
		frame.getContentPane().add(jBMenos);
		
		JButton jBLigar = new JButton("Ligar");
		jBLigar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jBLigar.setBounds(143, 204, 89, 23);
		frame.getContentPane().add(jBLigar);
	}
}
