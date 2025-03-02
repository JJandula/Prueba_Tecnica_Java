package Prueba_Tecnica_Java;

 abstract public class giratorio{
    private String modelo;
    private String tipo;
    private final String marca;
    private final String color;
    private final String material;
    private final int tamanyo;



    /* CONSTRUCTOR MEMORIA */

    public giratorio(String modelo, String tipo, String marca, String color, String material,int tamanyo) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
        this.material = material;
        this.tamanyo = tamanyo;
    }


    /* GETTERS */

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getTamanyo() {
        return tamanyo;
    }



    /* SETTERS */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

   

    /* METODOS ABSTRACTOS */

    abstract String getInfo();

    abstract void cambiarNombre();
    
    abstract void limpiar();

    abstract void inflar();

    abstract void instalarRueda();

    abstract void lanzar();

    abstract void recoger();
    
}