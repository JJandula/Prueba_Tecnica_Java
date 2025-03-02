package Prueba_Tecnica_Java;

public class DiscoDuro extends memoria implements Girar{
    int particiones;
    String techLecEsc;

    public DiscoDuro(String nombre, String tipo, int velGiro, int capacidad, int capacidadRest, String contenido, int particiones) {
        super(nombre, tipo, velGiro, capacidad, capacidadRest, contenido);
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

    

    
    public void tipoLecEsc() {
        System.out.println("Mi tecnologia para Lectura y Escritura es: " + techLecEsc);
    }


    /* METODOS ABSTRACTOS */

    @Override
    String getInfo(){
        return ("Tipo de Dispositivo: " + getTipo() + 
        "\nNombre: " + getNombre() 
        + "\nCapacidad Total: " + getCapacidad() + " GB"
        + "\nCapacidad Disponible: " + getCapacidadRest() + " GB"
        + "\nVelocidad de Giro: " + getVelGiro() + " RPM" 
        + "\nContenido: " + getContenido()
        + "\nParticiones: " + getParticiones()
        + "\nTecnologia Lec-Esc: " + getTechLecEsc());
    }

    @Override
    void formatear(){
        System.out.println("\n\nFORMATEANDO: " + getTipo() + "...");
        System.out.println("===================================");
        setCapacidadRest(1000);
        setContenido("FORMATEADO");
        setParticiones(0);
        System.out.println("\nFORMATEADO ✅");
        System.out.println("\nCapacidad disponible: " + getCapacidad() + " GB\n");
        System.out.println("Numero particiones: " + getParticiones() + "\n");
        System.out.println("===================================");
    }

    @Override
    void cambiarNombre(){
        System.out.println("\n\nCAMBIANDO NOMBRE DE: " + getTipo() + "...");
        System.out.println("===================================");
        setNombre("HDD de Erik");
        System.out.println("\nNUEVO NOMBRE: " + getNombre() + "\n");
        System.out.println("===================================");
    } 



    /* METODOS DE INTERFAZ */

    @Override
    public void girar() {
        System.out.println("===================================");
        System.out.println("\nDisco duro girando... \n");
        System.out.println("===================================");
    }

}