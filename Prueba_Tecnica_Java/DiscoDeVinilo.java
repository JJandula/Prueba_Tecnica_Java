package Prueba_Tecnica_Java;

public class DiscoDeVinilo extends memoria implements Girar{
    private String tiempoContenido;
    private String techLecEsc;

    public DiscoDeVinilo(String nombre, String tipo, int velGiro, int capacidad, int capacidadRest, String contenido, String tiempoContenido) {
        super(nombre, tipo, velGiro, capacidad, capacidadRest, contenido);
        this.tiempoContenido = tiempoContenido;
        this.techLecEsc = "Aguja";
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

   
    
    /* METODOS ABSTRACTOS IMPLEMENTADOS EN LA CLASE */

    @Override
    String getInfo() {
        return ("Tipo de Dispositivo: " + getTipo() + 
        "\nNombre: " + getNombre() 
        + "\nVelocidad de Giro: " + getVelGiro() + " RPM" 
        + "\nContenido: " + getContenido()
        + "\nTiempo del contenido: " + getTiempoContenido()
        + "\nTecnologia Lec-Esc: " + getTechLecEsc());
    }

     @Override
    public void cambiarNombre(){
        setNombre("BlueRay Vírgen");
    }
    
     @Override
    void formatear(){
        System.out.println("FORMATEANDO......." + getTipo());
        setCapacidad(700);
        System.out.println("/nCapacidad total:" + getCapacidad() + " MB");
    }

    /* METODOS DE INTERFAZ */

    @Override
    public void girar() {
        System.out.println("===================================");
        System.out.println("\nDisco de Vinilo girando... \n");
        System.out.println("===================================");
    }

}



