public class DiscoDuro extends memoria{
    int particiones;
    String techLecEsc;

    public DiscoDuro(String nombre, String tipo, int velGiro, String capacidad, String contenido, int particiones) {
        super(nombre, tipo, velGiro, capacidad, contenido);
        this.particiones = particiones;
        this.techLecEsc = "Cabezal Magnetico";
    }   

   
    /* GETTERS */

    public int getParticiones() {
        return particiones;
    }

    public String getTechLecEsc() {
        return techLecEsc;
    }


    /* SETTERS */

    public void setParticiones(int particiones) {
        this.particiones = particiones;
    }

    public void setTechLecEsc(String techLecEsc) {
        this.techLecEsc = techLecEsc;
    }


    /* METODOS PROPIOS DE LA CLASE */

    public String getInfo() {
        return ("Tipo de Dispositivo: " + getTipo() + 
        "\nNombre: " + getNombre() 
        + "\nCapacidad Disponible: " + getCapacidad() 
        + "\nVelocidad de Giro: " + getVelGiro() + " RPM" 
        + "\nContenido: " + getContenido()
        + "\nParticiones: " + getParticiones()
        + "\nTecnologia Lec-Esc: " + getTechLecEsc());
    }

    
    public void tipoLecEsc() {
        System.out.println("Mi tecnologia para Lectura y Escritura es: " + techLecEsc);
    }


    /* METODOS ABSTRACTOS */
    
    @Override
    public void girar(){
        System.out.println("===================================");
        System.out.println("\n" + getTipo() + " girando...\n");
        System.out.println("===================================\n");
    }

    @Override
    public void formatear(){
        System.out.println("\n\nFORMATEANDO: " + getTipo() + "...");
        System.out.println("===================================");
        setCapacidad("1TB");
        setContenido("FORMATEADO");
        setParticiones(0);
        System.out.println("\nFORMATEADO ✅");
        System.out.println("\nCapacidad disponible: " + getCapacidad() + "\n");
        System.out.println("Numero particiones: " + getParticiones() + "\n");
        System.out.println("===================================");
    }

    @Override
    public void cambiarNombre(){
        System.out.println("\n\nCAMBIANDO NOMBRE DEL: " + getTipo() + "...");
        System.out.println("===================================");
        setNombre("HDD de Erik");
        System.out.println("\nNUEVO NOMBRE: " + getNombre() + "\n");
        System.out.println("===================================");
    } 
}