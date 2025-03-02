package Prueba_Tecnica_Java;

public class Rueda extends giratorio implements Girar{
    private String estacionUso;
    private String tipoRueda;
    private String dureza;

    public Rueda(String modelo, String tipo, String marca, String color, String material, int tamanyo, String estacionUso, String tipoRueda, String dureza) {
        
        super(modelo, tipo, marca, color, material, tamanyo);
        this.estacionUso = estacionUso;
        this.tipoRueda = tipoRueda;
        this.dureza = dureza;

    }   


    /* GETTERS */

    public String getEstacionUso(){
        return estacionUso;
    }
    

    public String getTipoRueda() {
        return tipoRueda;
    }

    public String getDureza() {
        return dureza;
    }
   


    /* SETTERS */

   
    public void setEstacionUso(){
        this.estacionUso = estacionUso;
    }
    

    public void setTipoRueda() {
        this.tipoRueda = tipoRueda;
    }

    public void setDureza() {
        this.dureza = dureza;
    }
   


    
    /* METODOS PROPIOS DE LA CLASE */

   
    


    /* METODOS ABSTRACTOS IMPLEMENTADOS EN LA CLASE */

    @Override
    String getInfo() {
        return ("Tipo: " + getTipo() 
        + "\nModelo: " + getModelo()
        + "\nMarca: " + getMarca()
        + "\nColor: " + getColor()
        + "\nMaterial: " + getMaterial() 
        + "\nTamaño: " + getTamanyo() + " Pulgadas"
        + "\nEstacion de uso: " + getEstacionUso()
        + "\nTipo de rueda: " + getTipoRueda() 
        +"\nDureza del Neumatico: " + getDureza());
    }


   @Override
    void limpiar(){
    }

    @Override
    void inflar(){
    }

    @Override
    void instalarRueda(){
    }

    /* METODOS NO UTILIZADOS */

    @Override
    void lanzar(){
    }

    @Override
    void recoger(){
    }

    /* METODOS DE INTERFAZ */

    @Override
    public void girar() {
        System.out.println("===================================");
        System.out.println("\nRueda girando... \n");
        System.out.println("===================================");
    }


}



