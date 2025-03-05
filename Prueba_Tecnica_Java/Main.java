package Prueba_Tecnica_Java;

public class Main {
    
    public static void main(String[] args) {

        memoria [] misDevices = new memoria[4];
        giratorio [] misGiratorios = new giratorio[2];

        /* ARRAY MEMORIA */

         misDevices[0] = new CD("CD de Erik", "CD", 4800, 700, 100, "El Rey Leon", "140 minutos");
         misDevices[1] = new DiscoDuro("JJ HDD","Disco Duro", 7200, 1000, 900, "Windows 11", 2);
         misDevices[2] = new Blueray("BlueRay - The Hangover","BlueRay", 9000, 25, 5, "Resacón en Las Vegas", "140 minutos");
         misDevices[3] = new DiscoDeVinilo("Disco de Vinilo de El Barrio", "Vinilo",45, 0,0, "Me voy del Mundo - El Bario", "50 minutos");

        /* ARRAY GIRATORIOS */

         misGiratorios [0] = new Rueda ("CROSSCLIMATE 2 SUV", "Rueda", "Michelin", "Negra", "Caucho",18, "Invierno", "4x4", "media");
         misGiratorios [1] = new Frisbees ("Aerobie Superdisc", "Frisbee", "Aerobie", "Blanco", "Plastico",10, 130);

        
        System.out.println("\nDISPOSITIVOS DE ALMACENAMIENTO ENCONTRADOS:\n");
         
        for (int i = 0; i < misDevices.length; i++) {
            switch (misDevices[i]) {
                case CD cd -> {
                    System.out.println("INFO:\n" + cd.getInfo() + "\n");/* 
                    ( (CD) misDevices[i]).quemar();
                    System.out.println("INFO:\n" + cd.getInfo() + "\n"); */
                }
                case DiscoDuro discoDuro -> {
                    System.out.println("INFO:\n" + discoDuro.getInfo() + "\n");/* 
                    System.out.println("\n");
                    ( (DiscoDuro) misDevices[i]).girar();
                    ( (DiscoDuro) misDevices[i]).formatear();
                    ( (DiscoDuro) misDevices[i]).cambiarNombre();
                    System.out.println("\n");
                    System.out.println("INFO:\n" + discoDuro.getInfo() + "\n"); */
                } 
                case Blueray blueRay -> {
                    System.out.println("INFO:\n" + blueRay.getInfo() + "\n");
                }
                case DiscoDeVinilo discoDeVinilo -> {
                    System.out.println("INFO:\n" + discoDeVinilo.getInfo() + "\n");
                }
                default -> {
                    System.out.println("Error, dispositivo no encontrado");
                    }
                }
            }  

        
        System.out.println("\nOBJETOS GIRATORIOS ENCONTRADOS:\n");

        for (int i = 0; i < misGiratorios.length; i++) {
            switch (misGiratorios[i]) {
                case Rueda Rueda -> {
                    System.out.println("INFO:\n" + Rueda.getInfo() + "\n");
                    ( (Rueda) misGiratorios[i]).instalarRueda();
                    ( (Rueda) misGiratorios[i]).inflar();
                    ( (Rueda) misGiratorios[i]).limpiar();
                    ( (Rueda) misGiratorios[i]).girar();
                }
                case Frisbees Frisbees -> {
                    System.out.println("INFO:\n" + Frisbees.getInfo() + "\n");
                    ( (Frisbees) misGiratorios[i]).lanzar();
                    ( (Frisbees) misGiratorios[i]).recoger();
                    ( (Frisbees) misGiratorios[i]).limpiar();
                }
                default -> {
                    System.out.println("Error, Giratorio no encontrado");
                    }
                }
            }  

        }

    }