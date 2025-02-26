
public class CD extends memoria{
    private String tiempoContenido;
    private String techLecEsc;

    public CD(String nombre, String tipo, int velGiro, String capacidad, String contenido, String tiempoContenido) {
        super(nombre, tipo, velGiro, capacidad, contenido);
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

    public String getInfo() {
        return ("Tipo de Dispositivo: " + getTipo() + 
        "\nNombre: " + getNombre() 
        + "\nCapacidad Disponible: " + getCapacidad() 
        + "\nVelocidad de Giro: " + getVelGiro() + " RPM" 
        + "\nContenido: " + getContenido()
        + "\nContenido: " + getTiempoContenido()
        + "\nTecnologia Lec-Esc: " + getTechLecEsc());
    }
    

    public void quemar(){
        System.out.println("\n");
        System.out.println("AÑADIENDO NUEVO CONTENIDO HA " + getTipo());
        System.out.println("===================================");
        setCapacidad("200MB");
        setContenido("Bad Bunny - Debí Tirar");
        setTiempoContenido("82 minutos");
        System.out.println("\nNUEVO CONTENIDO:\n\nNonbre: " + getContenido() + "\nTiempo: " + getTiempoContenido());
        System.out.println("\n===================================");
        System.out.println("\n");
    }


    /* METODOS ABSTRACTOS IMPLEMENTADOS EN LA CLASE */


    @Override
    public void girar(){
        System.out.println(getTipo() + " girando...");
    }


    @Override
    public void formatear(){
        System.out.println("FORMATEANDO......." + getTipo());
        setCapacidad("700MB");
        System.out.println("/nCapacidad total:" + getCapacidad());
    }

    @Override
    public void cambiarNombre(){
        setNombre("CD Vírgen");
    }



}



