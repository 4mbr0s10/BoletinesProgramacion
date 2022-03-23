package boletin26;

import static java.awt.Color.YELLOW;

import javax.swing.*;




public class Componentes {

    private JFrame marco;
    private JPanel panel;
    private JButton boton1, boton2;
    private JTextField texto1, texto2;
    private JLabel etiqueta1, etiqueta2;
    private JTextArea textoArea;

    public void comp() {
        marco = new JFrame("BOLETIN 26");
        panel = new JPanel();
        panel.setLayout(null);
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        texto1 = new JTextField();
        texto2 = new JTextField();
        etiqueta1 = new JLabel("NOME");
        etiqueta2 = new JLabel("PASSWORD");
        textoArea = new JTextArea("AREA DE TEXTO.");
        panel.setSize(800, 600);
        marco.setSize(800, 600);
    }

    public void pecharVentana() {
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

   

  
     public void botones() {
        this.comp();
        boton1.setBounds(200, 480, 140, 40);
        boton2.setBounds(420, 480, 160, 40);
        boton1.setBackground(YELLOW);
        boton2.setBackground(YELLOW);
        panel.add(boton1);
        panel.add(boton2);
    }

    public void distribuicion() {
        this.comp();
        this.botones();
    
        etiqueta1.setBounds(200, 100, 50, 50);
        etiqueta2.setBounds(200, 160, 100, 50);
         texto1.setBounds(400, 100, 180, 40);
        texto2.setBounds(400, 160, 180, 40);
        textoArea.setBounds(200, 280, 400, 80);
      
        panel.add(texto1);
        panel.add(texto2);
        panel.add(textoArea);

        panel.add(etiqueta1);
        panel.add(etiqueta2);

        marco.add(panel);
        this.pecharVentana();

    }

}
