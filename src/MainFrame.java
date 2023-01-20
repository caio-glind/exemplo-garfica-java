import javax.swing.JFrame;
//import javax.swing.JTextField;
import javax.swing.*;//geral do ari frame importa todos os mestodo 
import java.awt.*;//para fazer a tela diuminuir 
public class MainFrame extends JFrame {

    public void initialize(){
        setTitle("Teste de swing");//titulo do programa
        setSize(1000,600);//tamanho da tela
        setMinimumSize(new Dimension(500,400));//fala que tamanho vai ficar atela quando pedir pra ficar pequna 
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//fala oq ue acontece quando apertar no X
        setVisible(true);//fala se a janeal avai ficar visivel ou não 
         //***********paenel************************ */
         JPanel p= new JPanel();
         JLabel l= new JLabel("digite o seu nome:");//texto que aparece n atela quando o sistema abre
         p.add(l);//metodo que ta adicionaando no painel
         JTextField t=new JTextField(10);//matodo que adiciona o canpoo de estrecrever no painel
         p.add(t);//adiciono no painel
         JButton b = new JButton("ok");//metodo que craia o botão
         BotaoAction action=new BotaoAction(t);
         b.addActionListener(action);
         p.add(b);//metodo que adciona o botão no painel
         add(p);//metodo que adicional o pinel no frame 
    }
}
