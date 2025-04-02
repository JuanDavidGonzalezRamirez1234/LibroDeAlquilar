package ALQUILER;

public class Libro {
    String titulo;
    private String autor;
    double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;

    }

    public Libro(String titulo, String autor) {
    }

    public void mostrarInfo(){
        System.out.print("Titulo: " + titulo);
        System.out.print("Autor: " + autor );
        System.out.print("Precio: "+ precio);

    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
