package models;
// Circulo.java
public class Circulo implements FormaGeometrica {
    private int x, y, radio;

    public Circulo(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo en (" + x + ", " + y + ") con radio " + radio);
    }

    @Override
    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moviendo círculo a (" + x + ", " + y + ")");
    }
}
