package Prueba_Tecnica_Java;

public class Blueray extends memoria implements Girar{
    private String tiempoContenido;
    private String techLecEsc;

    public Blueray(String nombre, String tipo, int velGiro, int capacidad, int capacidadRest, String contenido, String tiempoContenido) {
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
        setCapacidadRest(3);
        setContenido("Resacón 2: ¡Ahora en Tailandia!");
        setTiempoContenido("104 minutos");
        System.out.println("\nNUEVO CONTENIDO:\n\nNonbre: " + getContenido() + "\nTiempo: " + getTiempoContenido());
        System.out.println("\n===================================");
        System.out.println("\n");
    }


    /* METODOS ABSTRACTOS IMPLEMENTADOS EN LA CLASE */

    @Override
    String getInfo() {
        return ("Tipo de Dispositivo: " + getTipo() + 
        "\nNombre: " + getNombre() 
        + "\nCapacidad Total: " + getCapacidad() + " GB"
        + "\nCapacidad Disponible: " + getCapacidadRest() + " GB"
        + "\nVelocidad de Giro: " + getVelGiro() + " RPM" 
        + "\nContenido: " + getContenido()
        + "\nTiempo del contenido: " + getTiempoContenido()
        + "\nTecnologia Lec-Esc: " + getTechLecEsc());
    }



    @Override
    void formatear(){
        System.out.println("FORMATEANDO......." + getTipo());
        setCapacidad(25);
        System.out.println("/nCapacidad total:" + getCapacidad() + " GB");
    }

    @Override
    void cambiarNombre(){
        setNombre("BlueRay Vírgen");
    }


    /* METODOS DE INTERFAZ */

    @Override
    public void girar() {
        System.out.println("===================================");
        System.out.println("\nBlueRay girando... \n");
        System.out.println("===================================");
    }


}


