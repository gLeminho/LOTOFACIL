import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Tela extends JFrame {
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar letra de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    
    
    public Tela() {
        this.setTitle("**Lotofacil - interface gráfica");
        this.setSize(500, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 20));
        painel.setBackground(Color.white);
        
        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);
        add(painel);
        
        setLocationRelativeTo(null);
        setVisible(true);
        

        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }

                });

                jButtonAposta2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                  
                        aposta2();
                    }
                });
            jButtonAposta3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    aposta3();
                }
            });

            } 
    

    

    private void aposta1(){
        ImageIcon icon = new ImageIcon("Imagens/Captura de tela 2024-04-14 205835.png");
        Object numeroApostado = JOptionPane.showInputDialog
                (null, "Digite um número de 0 a 100: ",
                        "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
                        icon,null,"");
        int numeroApostadoInt = Integer.parseInt(numeroApostado.toString());
        Random random = new Random();
        int numeroSorteado = random.nextInt(101);
        if(numeroApostadoInt == numeroSorteado){
           JOptionPane.showMessageDialog(null, "Parabéns ganhou milzão",
                   "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
                   icon);
        }else{
            JOptionPane.showMessageDialog(null, "Você perdeu o número sorteado foi o: "+numeroSorteado,
                    "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
                    icon);
        }
    }
    private void aposta2(){
        ImageIcon icon = new ImageIcon("Imagens/Captura de tela 2024-04-14 205835.png");
        Object letra = JOptionPane.showInputDialog
        (null,"Digite uma letra", "Aposta 2",JOptionPane.INFORMATION_MESSAGE,icon,null,"" );
        
        char letraPremiada = 'G';
       
        if(letra == null){ return;}
        
        char letraApostada = (((String)letra).toUpperCase().charAt(0));
        
        if(Character.isLetter(letraApostada)){
          
          if(letraApostada == letraPremiada){
             JOptionPane.showMessageDialog(null,"Parabéns ganhou 500");
          }else{
            JOptionPane.showMessageDialog(null, "Que pena a letra sorteada foi "+letraPremiada);
          }
        }else{
            JOptionPane.showMessageDialog(null, "Digite uma letra");
        }
        
         
    }
    private void aposta3(){
        ImageIcon icon = new ImageIcon("Imagens/Captura de tela 2024-04-14 205835.png");
        Object numero = JOptionPane.showInputDialog
        (null, "Digite um número inteiro","Aposta 3",
        JOptionPane.INFORMATION_MESSAGE,icon ,null,"");
        
        int numeroInt = Integer.parseInt(numero.toString());
        
        if(numeroInt % 2 == 0){
            JOptionPane.showMessageDialog(null, "Parabéns ganhou 1000", "Aposta 3",JOptionPane.INFORMATION_MESSAGE,
            icon);

    }else{
        JOptionPane.showMessageDialog(null, "Que pena você escolheu um número ímpar os pares ganharam",
         "Aposta 3",JOptionPane.INFORMATION_MESSAGE,icon);
    }
    
    }


    public static void main(String[] args){

        new Tela();
    }
}



