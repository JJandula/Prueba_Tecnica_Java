package Prueba_Tecnica_Java;

 abstract public class memoria{
    private String nombre;
    private String tipo;
    private int velGiro;
    private int capacidad;
    private int capacidadRest;
    private String contenido;



    /* CONSTRUCTOR MEMORIA */

    public memoria(String nombre, String tipo, int velGiro, int capacidad, int capacidadRest, String contenido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.velGiro = velGiro;
        this.capacidad = capacidad;
        this.capacidadRest = capacidadRest;
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

    public int getCapacidad() {
        return capacidad;
    }

    public String getContenido() {
        return contenido;
    }

    public int getCapacidadRest() {
        return capacidadRest;
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
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }


   

    /* METODOS ABSTRACTOS */

    abstract String getInfo();

    abstract void cambiarNombre();
    
    abstract void formatear();
    

}