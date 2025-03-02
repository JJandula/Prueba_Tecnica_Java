package Prueba_Tecnica_Java;

public class Frisbees extends giratorio implements Girar{
    private int peso;

    public Frisbees(String modelo, String tipo, String marca, String color, String material, int tamanyo, int peso) {
        super(modelo, tipo, marca, color, material, tamanyo);
        this.peso = peso;
    }   

   
    /* GETTERS */

    public int getPeso() {
        return peso;
    }


    /* SETTERS */

    public void setPeso(int peso) {
        this.peso = peso;
    }


    /* METODOS PROPIOS DE LA CLASE */

    
    public void tipoLecEsc() {
        System.out.println("Mi tecnologia para Lectura y Escritura es: ");
    }


    /* METODOS ABSTRACTOS */

    @Override
    String getInfo(){
        return (
        "Tipo de Objecto: " + getTipo() +
        "\nModelo: " + getModelo() + 
        "\nMarca: " + getMarca() +
        "\nColor: " + getColor() +
        "\nMaterial: " + getMaterial() +
        "\nTamaño: " + getTamanyo() + " Pulgadas"+
        "\nPeso: " + getPeso() + " Gramos");
    }
    
    @Override
    void limpiar(){
        System.out.println("Fribee Limpio!");
    }

    @Override
    void lanzar(){
        System.out.println("Fribee lanzado!");
    }

    @Override
    void recoger(){
        System.out.println("Fribee recogido!");
    }

    /* METODOS NO UTILIZADOS */

    @Override
    void cambiarNombre(){
    }

    @Override
    void inflar(){
    }

    @Override
    void instalarRueda(){
    }
    



    /* METODOS DE INTERFAZ */

    @Override
    public void girar() {
        System.out.println("===================================");
        System.out.println("\nFrisbees por el aire... \n");
        System.out.println("===================================");
    }

}
