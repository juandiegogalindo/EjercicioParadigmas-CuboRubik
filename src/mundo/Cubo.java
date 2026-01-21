package mundo;

import java.awt.Color;

/**
 *
 * @author Juan Diego Galindo
 * @author Geronimo Nicolas Moreno
 * @author Sofia Torres Paez
 */
public class Cubo {
    private final Color red = Color.RED;
    private final Color gray = Color.GRAY;
    private final Color green = Color.GREEN;
    private final Color blue = Color.BLUE;
    private final Color yellow = Color.YELLOW;
    private final Color black = Color.BLACK;
    
    private Color frontal, derecho, izquierdo, superior, inferior, posterior;

    public Cubo() {
        this.frontal = blue; 
        this.derecho = gray;
        this.posterior = green;
        this.izquierdo = red;
        this.superior = black;
        this.inferior = yellow;
    }

    public Color getFrontal() {
        return frontal;
    }

    public void setFrontal(Color frontal) {
        this.frontal = frontal;
    }

    public Color getDerecho() {
        return derecho;
    }

    public void setDerecho(Color derecho) {
        this.derecho = derecho;
    }

    public Color getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Color izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Color getSuperior() {
        return superior;
    }

    public void setSuperior(Color superior) {
        this.superior = superior;
    }

    public Color getInferior() {
        return inferior;
    }

    public void setInferior(Color inferior) {
        this.inferior = inferior;
    }

    public Color getPosterior() {
        return posterior;
    }

    public void setPosterior(Color posterior) {
        this.posterior = posterior;
    }

    
    public void giroEjeX() {
        Color vacio;
        vacio = this.frontal;
        this.frontal = this.izquierdo;
        this.izquierdo = this.posterior;
        this.posterior = this.derecho;
        this.derecho = vacio;
    }

    public void giroEjeY() {
        Color vacio;
        vacio = this.frontal;
        this.frontal = this.superior;
        this.superior = this.posterior;
        this.posterior = this.inferior;
        this.inferior = vacio;
    }

    public void giroEjeZ() {
        Color vacio;
        vacio = this.superior;
        this.superior = this.derecho; 
        this.derecho = this.inferior;
        this.inferior = this.izquierdo;
        this.izquierdo = vacio;
    }
}