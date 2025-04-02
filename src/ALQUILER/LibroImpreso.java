package ALQUILER;

public class LibroImpreso extends Libro {
    private double peso;

    public LibroImpreso(String titulo, String autor, double precio, double peso) {
        super(titulo, autor, precio);
        this.peso = peso;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Peso: " + peso + " G");
    }

    @Override
    public String toString() {
        return super.toString() + ", Peso: " + peso + " G";
    }
}