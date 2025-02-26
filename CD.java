
public class CD extends memoria{
    String tiempoContenido;
    String techLecEsc;

    public CD(String nombre, String tipo, int velGiro, String capacidad, String contenido, String tiempoContenido) {
        super(nombre, tipo, velGiro, capacidad, contenido);
        this.tiempoContenido = tiempoContenido;
        this.techLecEsc = "Laser";
    }   

   
    
    public void tipoLecEsc() {
        System.out.println("Mi tecnologia para Lectura y Escritura es: " + techLecEsc);
    }
    
    public void girar(){
        System.out.println(getTipo() + " girando...");
    }


    public void formatear(){
        System.out.println("FORMATEANDO......." + getTipo());
        setCapacidad("1TB");
        System.out.println("/nCapacidad:" + getCapacidad());
    }

    public void cambiarNombre(){
        setNombre("Erik HDD");
    }





}



