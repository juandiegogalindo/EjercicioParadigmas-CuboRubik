package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import mundo.Rubik;

/**
 *
 * @author Juan Diego Galindo
 * @author Geronimo Nicolas Moreno
 * @author Sofia Torres Paez
 */
public class InterfazApp extends JFrame {
    private PanelCentro pnlCentro;
    private PanelIzquierda pnlIzquierda;
    private PanelDerecha pnlDerecha;
    private PanelPosterior pnlPosterior;
    private PanelSuperior pnlSuperior;
    private PanelInferior pnlInferior;
    private Rubik cuboRubik;

    public InterfazApp() {
        cuboRubik = new Rubik();
        getContentPane().setLayout(null); // Definicion de organizacion
        //Paneles
        pnlSuperior = new PanelSuperior(cuboRubik);
        pnlSuperior.setBounds(330, 80, 200, 200);
        getContentPane().add(pnlSuperior);
        
        pnlIzquierda = new PanelIzquierda(cuboRubik);
        pnlIzquierda.setBounds(130, 280, 200, 200);
        getContentPane().add(pnlIzquierda);
        
        pnlCentro = new PanelCentro(cuboRubik);
        pnlCentro.setBounds(330, 280, 200, 200);
        getContentPane().add(pnlCentro);        
        
        pnlInferior = new PanelInferior(cuboRubik);
        pnlInferior.setBounds(330, 480, 200, 200);
        getContentPane().add(pnlInferior);
        
        pnlDerecha = new PanelDerecha(cuboRubik);
        pnlDerecha.setBounds(530, 280, 200, 200);
        getContentPane().add(pnlDerecha);
        
        pnlPosterior = new PanelPosterior(cuboRubik);
        pnlPosterior.setBounds(730, 280, 200, 200);
        getContentPane().add(pnlPosterior);
        
        //Botones
        JButton boton1 = new JButton("-");
        boton1.setBounds(280, 80, 40, 100);
        getContentPane().add(boton1);
        
        JButton boton2 = new JButton("-");
        boton2.setBounds(280, 180, 40, 100);
        getContentPane().add(boton2);
        
        JButton boton3 = new JButton("-");
        boton3.setBounds(80, 280, 40, 100);
        getContentPane().add(boton3);
        
        JButton boton4 = new JButton("-");
        boton4.setBounds(80, 380, 40, 100);
        getContentPane().add(boton4);
        
        JButton boton5 = new JButton("-");
        boton5.setBounds(330, 30, 100, 40);
        getContentPane().add(boton5);
        
        JButton boton6 = new JButton("-");
        boton6.setBounds(430, 30, 100, 40);
        getContentPane().add(boton6);
        
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuboRubik.giroZ(0);
                actualizarInterfaz();
            }            
        }
        );
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuboRubik.giroZ(1);
                actualizarInterfaz();
            }            
        }
        );
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuboRubik.giroX(0);
                actualizarInterfaz();
            }            
        }
        );
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuboRubik.giroX(1);
                actualizarInterfaz();
            }            
        }
        );
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuboRubik.giroY(0);
                actualizarInterfaz();
            }            
        }
        );
        
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuboRubik.giroY(1);
                actualizarInterfaz();
            }            
        }
        );
        
        this.setTitle("CUBO RUBIK");
        this.setSize(1070, 760);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void actualizarInterfaz() {
        pnlCentro.actualizarColores();
        pnlIzquierda.actualizarColores();
        pnlDerecha.actualizarColores();
        pnlPosterior.actualizarColores();
        pnlSuperior.actualizarColores();
        pnlInferior.actualizarColores();
    }
    
    public static void main(String[] args) {
        InterfazApp frmMain = new InterfazApp();
        frmMain.setVisible(true);
    }
}
