package ALQUILER;

public class LibroImpreso extends Libro {
    private double peso;
    private String autor;

    public LibroImpreso(String titulo, String autor, double peso, double precio) {
        super(titulo, autor);
        this.peso = peso;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.print("Titulo del libro: "+ titulo);
        System.out.print("Autor" + autor);
        System.out.print("Tamaño"+ precio);
        System.out.println("Peso: " + peso + " KB");
    }
}
