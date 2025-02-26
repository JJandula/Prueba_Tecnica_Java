 abstract public class memoria {
    private String nombre;
    private String tipo;
    private int velGiro;
    private String capacidad;
    private String contenido;



    /* CONSTRUCTOR MEMORIA */

    public memoria(String nombre, String tipo, int velGiro, String capacidad, String contenido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.velGiro = velGiro;
        this.capacidad = capacidad;
        this.contenido = contenido;
    }


    /* GETTERS */

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelGiro() {
        return velGiro;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getContenido() {
        return contenido;
    }



    /* SETTERS */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setVelGiro(int velGiro) {
        this.velGiro = velGiro;
    }
    
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }



    /* METODOS DE LA CLASE */


    public String getInfo() {
        return ("Tipo de Dispositivo: " + getTipo() + 
        "\nNombre: " + getNombre() 
        + "\nCapacidad Disponible: " + getCapacidad() 
        + "\nVelocidad de Giro: " + getVelGiro() + " RPM" 
        + "\nContenido: " + getContenido());
    }
    

   

    /* METODOS ABSTRACTOS */


    abstract void girar();

    abstract  void cambiarNombre();
    
    abstract void formatear();
    

}

 