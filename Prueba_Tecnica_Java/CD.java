package Prueba_Tecnica_Java;

public class CD extends memoria implements Girar{
    private String tiempoContenido;
    private String techLecEsc;

    public CD(String nombre, String tipo, int velGiro, int capacidad, int capacidadRest, String contenido, String tiempoContenido) {
        super(nombre, tipo, velGiro, capacidad, capacidadRest, contenido);
        this.tiempoContenido = tiempoContenido;
        this.techLecEsc = "Laser";
    }   


    /* GETTERS */


    public String getTiempoContenido() {
        return tiempoContenido;
    }

    public String getTechLecEsc() {
        return techLecEsc;
    }
   


    /* SETTERS */

    public void setTiempoContenido(String tiempoContenido) {
        this.tiempoContenido = tiempoContenido;
    }

    public void setTechLecEsc(String techLecEsc) {
        this.techLecEsc = techLecEsc;
    }


    
    /* METODOS PROPIOS DE LA CLASE */


    public void tipoLecEsc() {
        System.out.println("Mi tecnologia para Lectura y Escritura es: " + techLecEsc);
    }

   
    

    public void quemar(){
        System.out.println("\n");
        System.out.println("AÑADIENDO NUEVO CONTENIDO A " + getTipo());
        System.out.println("===================================");
        setCapacidadRest(200);
        setContenido("Bad Bunny - Debí Tirar");
        setTiempoContenido("82 minutos");
        System.out.println("\nNUEVO CONTENIDO:\n\nNonbre: " + getContenido() + "\nTiempo: " + getTiempoContenido());
        System.out.println("\n===================================");
        System.out.println("\n");
    }


    /* METODOS ABSTRACTOS IMPLEMENTADOS EN LA CLASE */

    @Override
    String getInfo() {
        return ("Tipo de Dispositivo: " + getTipo() + 
        "\nNombre: " + getNombre() 
        + "\nCapacidad Total: " + getCapacidad() + " MB"
        + "\nCapacidad Disponible: " + getCapacidadRest() + " MB"
        + "\nVelocidad de Giro: " + getVelGiro() + " RPM" 
        + "\nContenido: " + getContenido()
        + "\nTiempo del contenido: " + getTiempoContenido()
        + "\nTecnologia Lec-Esc: " + getTechLecEsc());
    }



    @Override
    void formatear(){
        System.out.println("FORMATEANDO......." + getTipo());
        setCapacidad(700);
        System.out.println("/nCapacidad total:" + getCapacidad() + " MB");
    }

    @Override
    void cambiarNombre(){
        setNombre("CD Vírgen");
    }

    /* METODOS DE INTERFAZ */

    @Override
    public void girar() {
        System.out.println("===================================");
        System.out.println("\nCD girando... \n");
        System.out.println("===================================");
    }


}



