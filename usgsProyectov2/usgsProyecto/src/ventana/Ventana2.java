package ventana;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana2 extends JFrame{
        public JPanel panel;
        public JButton boton1;
    public Ventana2(){
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("USGS selector de Parametros");
        setLocationRelativeTo(null);
        //getContentPane().setBackground(Color.CYAN);
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        
        
    }

    private void colocarPanel() {
        //
        panel = new JPanel();
        //panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas() {
        //
        JLabel etiqueta = new JLabel();
        
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Alinear en los parametros de etiqueta
        etiqueta.setText("Terremotos en el Mundo");
        etiqueta.setBounds(250,40,150,30);
        panel.add(etiqueta);
    }

    private void colocarBotones() {
        //
        boton1 = new JButton();
        boton1.setBounds(150, 200, 80, 80);
        ImageIcon imagen2 = new ImageIcon("lupa.png");
        boton1.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(64,64, Image.SCALE_SMOOTH)));
        boton1.setBounds(150, 200, 80, 80);
        panel.add(boton1);
        
        eventoOyenteAccion();//Oyente de Raton
    }

    private void eventoOyenteAccion() {
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Buscando...");
            }
        };
        boton1.addActionListener(oyenteAccion);
    }
}
