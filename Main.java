
public class Main{
    
    public static void main(String[] args) {

        memoria [] misDevices = new memoria[2];

         misDevices[0] = new CD("CD de Erik", "CD", 4800, "700 MB", "El Rey Leon", "140 minutos");
         misDevices[1] = new DiscoDuro("JJ HDD","Disco Duro", 7200, "900GB", "Windows 11", 2);
        
        System.out.println("\nDISPOSITIVOS ENCONTRADOS:\n");
         
        for (int i = 0; i < misDevices.length; i++) {

            switch (misDevices[i]) {
                case CD cd -> System.out.println("INFO:\n" + cd.getInfo() + "\n");
                case DiscoDuro discoDuro -> {
                    System.out.println("INFO:\n" + discoDuro.getInfo() + "\n");
                    System.out.println("\n");
                    ( (DiscoDuro) misDevices[i]).girar();
                    ( (DiscoDuro) misDevices[i]).formatear();
                    ( (DiscoDuro) misDevices[i]).cambiarNombre();
                    System.out.println("\n");
                    System.out.println("INFO:\n" + discoDuro.getInfo() + "\n");
                } 
                
                default -> {
                    System.out.println("Error, dispositivo no encontrado");
                    }
                }
            }  

        }

    }











        /* System.out.println("INFO: " + ( (CD) misDevices[i]).getInfo()); */

        

/*         for (memoria memory : misDevices) {
           switch (memory.getTipo().getSimpleName()){
               case "CD":
                   System.out.println(memory.toString());
                   break;
               case "DiscoDuro":
                   System.out.println(memory.toString());
                   break;
               default:
                   System.out.println("Desconocido");
            }
        }

    }

}


for (memoria memory : misDevices) {
    if (memory != null) {  // Evita NullPointerException
        switch (memory.getTipo()) {
            case "CD":
            case "DiscoDuro":
                System.out.println(DiscoDuro.getInfo());
                break;
            default:
                System.out.println("Desconocido");
        } */