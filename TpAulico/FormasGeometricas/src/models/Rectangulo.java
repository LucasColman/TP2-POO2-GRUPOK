package models;

// Rectangulo.java
public class Rectangulo implements FormaGeometrica {
    private int x, y, ancho, alto;

    public Rectangulo(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo en (" + x + ", " + y + ") con ancho " + ancho + " y alto " + alto);
    }

    @Override
    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moviendo rectángulo a (" + x + ", " + y + ")");
    }
}
