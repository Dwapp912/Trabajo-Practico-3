package trabajo.practicon3;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private int maxCombustible = 100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void despegar() {
        if (this.combustible >= 10) {
            this.combustible = this.combustible - 10;
            System.out.println("Nave " + this.nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (this.combustible >= distancia) {
            this.combustible = this.combustible - distancia;
            System.out.println("Avanzando " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia);
        }
    }

    public void recargarCombustible(int cantidad) {
        if (this.combustible + cantidad > maxCombustible) {
            this.combustible = maxCombustible;
            System.out.println("Combustible recargado al maximo (100).");
        } else {
            this.combustible = this.combustible + cantidad;
            System.out.println("Recargando " + cantidad + ". Combustible actual: " + this.combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + this.nombre);
        System.out.println("Combustible: " + this.combustible + "/" + maxCombustible);
    }
}
