package trabajo.practicon3;

public class Gallina {
    private String idGallina; 
    private int edad;
    private int huevosPuestos;

    public String getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo() {
        this.huevosPuestos = this.huevosPuestos + 1;
    }

    public void envejecer() {
        this.edad = this.edad + 1;
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + this.idGallina);
        System.out.println("Edad: " + this.edad);
        System.out.println("Huevos Puestos: " + this.huevosPuestos);
    }
}
