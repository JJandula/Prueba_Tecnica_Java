public class DiscoDuro extends memoria{
    int particiones;
    String techLecEsc;

    public DiscoDuro(String nombre, String tipo, int velGiro, String capacidad, String contenido, int particiones) {
        super(nombre, tipo, velGiro, capacidad, contenido);
        this.particiones = particiones;
        this.techLecEsc = "Cabezal Magnetico";
    }   

   
    
    public void tipoLecEsc() {
        System.out.println("Mi tecnologia para Lectura y Escritura es: " + techLecEsc);
    }
    
    @Override
    public void girar(){
        System.out.println(getTipo() + " girando...");
        System.out.println("===================================");
        System.out.println("\n");
    }

    @Override
    public void formatear(){
        System.out.println("FORMATEANDO: " + getTipo() + "...");
        System.out.println("===================================");
        setCapacidad(" 1TB");
        System.out.println("Capacidad disponible:" + getCapacidad());
        setContenido("FORMATEADO");
        System.out.println("FORMATEADO ✅");
        System.out.println("===================================");
    }

    @Override
    public void cambiarNombre(){
        System.out.println("\n");
        System.out.println("CAMBIANDO NOMBRE DEL: " + getTipo() + "...");
        System.out.println("===================================");
        setNombre("HDD de Erik");
        System.out.println("NUEVO NOMBRE: " + getNombre());
        System.out.println("===================================");
    } 
}