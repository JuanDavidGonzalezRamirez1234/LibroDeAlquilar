package ALQUILER;
public class LibroDigital extends Libro {
    private double tamanioArchivo;
    private String autor;
    private String precio;

    public LibroDigital(String titulo, String autor, double tamanioArchivo, double precio) {
        super(titulo, autor);
        this.tamanioArchivo = tamanioArchivo;
    }





    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.print("Titulo del libro: "+ titulo);
        System.out.print("Autor" + autor);
        System.out.print("Tamaño"+ precio);

        System.out.println("Tamaño del archivo: " + tamanioArchivo + " KB");
    }
}