//package swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class BotaoAction  implements ActionListener{
   private JTextField t;
   public BotaoAction (JTextField t){
    this.t=t;
   }

    public void actionPerformed(ActionEvent e){
        
        String nome = t.getText();//capitura o texto da caixa de e trandforma em stringi
        System.out.printf("\n %s",nome);
      
        JOptionPane.showMessageDialog(null, "Bem-vindo "+nome);
        //System.out.printf("%s",this.t);
       
    }
}


