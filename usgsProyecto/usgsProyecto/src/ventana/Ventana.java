package ventana;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana  extends JFrame{
    public JPanel panel;
    public Ventana(){
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("USGS init_Components Programa");
        setLocationRelativeTo(null);
        //getContentPane().setBackground(Color.CYAN);
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        //colocarCajaTexto();
        //colocarAreaTexto();
        colocarListaDesplegable();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel();
        JLabel etiqueta3 = new JLabel();
        
        
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Alinear en los parametros de etiqueta
        etiqueta.setText("Terremotos en el Mundo");
        etiqueta.setBounds(250,40,150,30);
        //etiqueta.setOpaque(true);
        //etiqueta.setForeground(Color.lightGray);//Color de Letra
        //etiqueta.setBackground(Color.WHITE);
        panel.add(etiqueta);
        
        
        ImageIcon imagen = new ImageIcon("earth_chan.png");
        //720, 1100
        etiqueta2.setBounds(220, 80, 180, 275);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
        
        etiqueta3.setText("Programa creado por Camila");
        etiqueta3.setBounds(240,400,200,30);
        panel.add(etiqueta3);
        
    }
    
    private void colocarBotones() {
        /*
        JButton boton1 = new JButton();
        boton1.setText("Iniciar");
        boton1.setBounds(150, 200, 80, 80);
        panel.add(boton1);
        */
        JButton boton2 = new JButton();
        ImageIcon imagen2 = new ImageIcon("lupa.png");
        boton2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(64,64, Image.SCALE_SMOOTH)));
        boton2.setBounds(150, 200, 80, 80);
        panel.add(boton2);
        
        //RadioButton
        /*
        JRadioButton radio1 = new JRadioButton("Opcion 1", false);
        radio1.setBounds(15, 20, 80, 80);
        //radio1.setEnable(true/false);
        //radio1.setText("RadioOpcion");
        panel.add(radio1);
        JRadioButton radio2 = new JRadioButton("Opcion 2", false);
        radio2.setBounds(15, 120, 80, 80);
        panel.add(radio2);
        ButtonGroup grupoRBot = new ButtonGroup();
        grupoRBot.add(radio1);
        grupoRBot.add(radio2);
        */
    }
    
    private void colocarCajaTexto() {
        //
        JTextField boxTexto = new JTextField();
        boxTexto.setBounds(50, 50, 100, 30);
        boxTexto.setText("Temporal");
        //System.out.println("Imprime el texto de caja\n"+boxTexto.getText());
        panel.add(boxTexto); 
    }

    private void colocarAreaTexto() {
       //
       JTextArea areaTexto = new JTextArea();
       areaTexto.setBounds(50, 50, 100, 30);
       areaTexto.setText("Temporal");
       areaTexto.append("");
       areaTexto.setEditable(true);
       //System.out.println("Imprime el texto de area\n"+areaTexto.getText());
       panel.add(areaTexto); 
    }

    private void colocarListaDesplegable() {
        //
        String [] paises = {"Mexico", "Colombia", "Ecuador", "EUA"};
        
        JComboBox listaDesp1 = new JComboBox(paises);
        listaDesp1.setBounds(30, 30, 100, 30);
        
        listaDesp1.addItem("Argentina");
        //System.out.println("Imprime el texto de area\n"+listaDesp1.getText());
        panel.add(listaDesp1);
        
    }
    
    
}
