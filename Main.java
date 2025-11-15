package trabajo.practicon3;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Ejercicio 1: Estudiante ---");
        Estudiante e1 = new Estudiante();
        
        e1.setNombre("Juan");
        e1.setApellido("Perez");
        e1.setCurso("Programacion II");
        e1.setCalificacion(7.5);
        
        e1.mostrarInfo();
        e1.subirCalificacion(1.0);
        System.out.println("Calificacion despues de subir: " + e1.getCalificacion());
        e1.bajarCalificacion(0.5);
        System.out.println("Calificacion despues de bajar: " + e1.getCalificacion());

        
        System.out.println("\n--- Ejercicio 2: Mascota ---");
        Mascota m1 = new Mascota();
        m1.setNombre("Fido");
        m1.setEspecie("Perro");
        m1.setEdad(3);
        
        m1.mostrarInfo();
        m1.cumplirAnios();
        System.out.println("Despues de cumplir anios:");
        m1.mostrarInfo();

        
        System.out.println("\n--- Ejercicio 3: Libro ---");
        Libro l1 = new Libro();
        l1.setTitulo("El Aleph");
        l1.setAutor("Borges");
        
        System.out.println("Intentando poner año invalido (2030):");
        l1.setAñoPublicacion(2030); 
        l1.mostrarInfo(); 
        
        System.out.println("Intentando poner año valido (1949):");
        l1.setAñoPublicacion(1949); 
        l1.mostrarInfo();

        
        System.out.println("\n--- Ejercicio 4: Gallina ---");
        Gallina g1 = new Gallina();
        g1.setIdGallina("G-001");
        g1.setEdad(2);
        g1.setHuevosPuestos(0); 

        Gallina g2 = new Gallina();
        g2.setIdGallina("G-002");
        g2.setEdad(1);
        g2.setHuevosPuestos(0);
        
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();
        
        g2.ponerHuevo();

        System.out.println("Estado Gallina 1:");
        g1.mostrarEstado();
        System.out.println("Estado Gallina 2:");
        g2.mostrarEstado();

        
        System.out.println("\n--- Ejercicio 5: Nave Espacial ---");
        NaveEspacial n1 = new NaveEspacial();
        n1.setNombre("Enterprise");
        n1.setCombustible(50);
        
        n1.mostrarEstado();
        
        System.out.println("Intentando avanzar 100:");
        n1.avanzar(100); 
        n1.mostrarEstado();

        System.out.println("Recargando 80:");
        n1.recargarCombustible(80); 
        n1.mostrarEstado();
        
        System.out.println("Avanzando 60:");
        n1.avanzar(60); 
        n1.mostrarEstado();
    }
}
