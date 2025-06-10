import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame();

        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setBounds(50, 50, 100, 30);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(50, 80, 150, 30);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(50, 180, 150, 30);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(50, 150, 100, 30);

        JButton botao = new JButton("Login");
        botao.setBounds(50, 230, 150, 30);
        botao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String (campoSenha.getPassword());
                System.out.printf("Usuário: %s\nSenha: %s", usuario, senha);
            
            }

        });

        janela.add(botao);
        janela.add(labelUsuario);
        janela.add(campoUsuario);
        janela.add(campoSenha);
        janela.add(labelSenha);

        janela.setLayout(null);
        //Definir o tamnho da minha janela
        janela.setBounds(0, 0, 400, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
