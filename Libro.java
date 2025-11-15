package trabajo.practicon3;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setAñoPublicacion(int año) {
        if (año > 0 && año <= 2025) { 
            this.añoPublicacion = año;
        } else {
            System.out.println("Error: El año debe ser un valor valido.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año: " + this.añoPublicacion);
    }
}
