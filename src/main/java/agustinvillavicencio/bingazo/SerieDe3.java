
package agustinvillavicencio.bingazo;

import java.util.ArrayList;
import java.util.Scanner;

 // @author Agustin Villa
 
public class SerieDe3 {
    static Scanner leer=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        boolean terna,quintina,lleno,ternaFinal=false,
                llenoFinal=false,quintinaFinal=false;
        byte num;
        byte contTerna=2,contQuintina=2,contLleno=2;
        
        /*byte a007[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};*/
        byte a001[][]={{27,32,51,64,80},{12,33,44,70,84},{6,18,47,65,71},
            {3,11,45,60,76},{19,30,55,78,82},{22,35,59,62,86},
            {23,40,50,73,85},{8,29,31,52,87},{9,17,39,48,69}};
        byte a002[][]={{10,38,42,68,72},{16,20,54,75,81},{5,25,49,58,89},
            {4,26,41,63,88},{14,34,43,67,77},{7,28,56,79,90},
            {1,13,36,53,61},{2,21,37,66,74},{15,24,46,57,83}};
        byte a003[][]={{1,12,30,51,62},{5,23,36,68,87},{19,28,45,58,72},
            {11,21,52,74,82},{6,22,38,53,76},{16,39,43,66,88},
            {15,32,40,65,81},{29,37,55,77,90},{2,17,44,57,78}};
        byte a004[][]={{7,24,47,71,80},{26,31,50,60,89},{8,10,33,48,63},
            {13,20,54,64,84},{25,42,56,70,86},{9,35,46,67,75},
            {3,14,41,73,83},{18,34,49,61,79},{4,27,59,69,85}};
        byte a005[][]={{15,30,44,60,82},{22,31,52,70,87},{7,16,47,58,76},
            {14,23,50,72,86},{4,28,33,53,74},{19,38,49,67,90},
            {6,12,45,75,83},{17,34,48,62,77},{9,29,54,69,84}};
        byte a006[][]={{1,11,32,51,65},{3,21,39,66,80},{18,26,41,59,71},
            {2,20,40,78,81},{25,36,55,64,88},{8,13,37,42,68},
            {10,24,56,61,85},{27,43,57,73,89},{5,35,46,63,79}};
        byte a007[][]={{22,31,51,64,87},{16,35,41,70,89},{7,17,43,65,77},
            {20,44,54,79,83},{1,27,30,56,85},{6,18,34,47,61},
            {9,15,40,62,72},{19,38,55,75,84},{21,39,59,67,90}};
        byte a008[][]={{2,24,46,66,86},{13,32,49,69,73},{3,29,53,78,88},
            {10,33,42,60,71},{12,23,50,74,80},{5,28,48,52,82},
            {4,11,36,57,63},{8,25,37,68,76},{14,26,45,58,81}};
        byte a009[][]={{12,20,52,60,84},{21,40,53,73,85},{6,35,41,69,74},
            {16,37,43,68,87},{23,38,56,76,88},{7,18,45,59,78},
            {4,11,44,72,82},{19,36,46,62,79},{5,26,58,66,86}};
        byte a010[][]={{1,24,48,71,83},{27,30,57,65,90},{3,13,39,49,67},
            {14,22,54,70,81},{8,25,31,55,77},{15,34,42,63,89},
            {2,10,32,50,61},{9,28,33,64,80},{17,29,47,51,75}};
        byte a011[][]={{28,30,57,60,81},{10,38,48,72,90},{3,11,49,69,73},
            {25,45,58,78,87},{5,29,31,59,88},{6,17,39,46,62},
            {8,15,42,63,70},{18,32,50,76,80},{24,35,55,65,84}};
        byte a012[][]={{7,22,41,67,83},{13,34,43,68,74},{9,26,51,75,89},
            {12,33,40,61,77},{16,20,52,79,82},{2,27,47,54,85},
            {1,14,36,53,64},{4,21,37,66,71},{19,23,44,56,86}};
        byte a013[][]={{7,13,31,54,63},{8,25,36,68,85},{17,28,44,57,75},
            {11,21,53,70,83},{9,29,32,58,77},{12,39,42,69,84},
            {15,34,41,67,80},{26,35,52,74,81},{4,18,47,55,76}};
        byte a014[][]={{1,22,40,73,86},{23,37,51,60,88},{2,14,38,43,65},
            {19,20,56,31,82},{24,46,59,72,87},{5,30,49,66,79},
            {3,10,45,71,89},{16,33,48,62,78},{6,27,50,64,90}};
        byte a015[][]={{3,20,54,73,84},{13,31,42,64,77},{27,34,55,65,88},
            {5,10,43,60,80},{25,33,58,76,82},{19,36,44,68,78},
            {2,30,45,72,85},{11,23,52,61,87},{4,17,32,48,66}};
        byte a016[][]={{14,22,40,51,86},{1,28,37,63,79},{6,16,38,53,69},
            {8,15,41,70,83},{9,21,39,50,67},{24,46,56,74,90},
            {7,12,47,62,81},{26,35,57,71,89},{18,29,49,59,75}};
        byte a017[][]={{2,21,53,77,84},{16,31,47,65,78},{26,35,58,68,86},
            {9,11,48,60,85},{20,33,56,72,90},{12,36,49,67,73},
            {7,30,40,75,83},{14,22,52,61,89},{8,18,38,42,69}};
        byte a018[][]={{13,23,45,54,81},{4,25,32,62,71},{6,19,34,55,63},
            {3,17,41,70,80},{5,28,39,50,66},{29,43,57,79,88},
            {1,10,44,64,82},{24,37,51,74,87},{15,27,46,59,76}};
        byte a019[][]={{2,11,35,56,67},{3,22,38,68,86},{15,29,44,59,76},
            {14,23,51,75,80},{4,26,34,55,78},{17,37,41,69,81},
            {10,33,45,62,84},{21,39,57,70,90},{5,16,49,58,74}};
        byte a020[][]={{6,25,46,79,83},{27,30,50,65,87},{9,12,31,47,66},
            {13,20,52,61,88},{28,42,53,72,89},{7,32,43,64,77},
            {1,18,40,71,82},{19,36,48,60,73},{8,24,54,63,85}};
        byte a021[][]={{29,33,53,61,80},{10,39,43,74,89},{8,13,48,63,78},
            {1,11,44,62,73},{12,31,52,76,81},{20,36,57,68,82},
            {23,41,50,77,86},{2,27,37,54,90},{7,16,38,45,69}};
        byte a022[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};
        byte a023[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};
        byte a024[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};
        byte a025[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};
        byte a026[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};
        byte a027[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};
        byte a028[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};
        byte a029[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};
        byte a030[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};

        
        
        /*Carton c001=new Carton("",1,a001);
        Carton c002=new Carton("",2,a002);
        Carton c003=new Carton("",3,a003);
        Carton c004=new Carton("",4,a004);
        Carton c005=new Carton("",5,a005);
        Carton c006=new Carton("",6,a006);
        Carton c007=new Carton("",7,a007);
        Carton c008=new Carton("",8,a008);
        Carton c009=new Carton("",9,a009);
        Carton c010=new Carton("",10,a010);
        Carton c011=new Carton("",11,a011);
        Carton c012=new Carton("",12,a012);
        Carton c013=new Carton("",13,a013);
        Carton c014=new Carton("",14,a014);
        Carton c015=new Carton("",15,a015);
        Carton c016=new Carton("",16,a016);
        Carton c017=new Carton("",17,a017);
        Carton c018=new Carton("",18,a018);
        Carton c019=new Carton("",19,a019);
        Carton c020=new Carton("",20,a020);
        Carton c021=new Carton("",21,a021);
        Carton c022=new Carton("",22,a022);
        Carton c023=new Carton("",23,a023);
        Carton c024=new Carton("",24,a024);
        Carton c025=new Carton("",25,a025);
        Carton c026=new Carton("",26,a026);
        Carton c027=new Carton("",27,a027);
        Carton c028=new Carton("",28,a028);
        Carton c029=new Carton("",29,a029);
        Carton c030=new Carton("",30,a030);
        */
        
        Carton c001=new Carton("Monica Molina",1,a001);
        Carton c002=new Carton("",2,a002);
        Carton c003=new Carton("",3,a003);
        Carton c004=new Carton("Patricia Lucero",4,a004);
        Carton c005=new Carton("Matias Richard",5,a005);
        Carton c006=new Carton("Jose",6,a006);
        Carton c007=new Carton("",7,a007);
        Carton c008=new Carton("Laura Lucero",8,a008);
        Carton c009=new Carton("Ines Quiroga",9,a009);
        Carton c010=new Carton("",10,a010);
        Carton c011=new Carton("Monica Molina",11,a011);
        Carton c012=new Carton("",12,a012);
        Carton c013=new Carton("",13,a013);
        Carton c014=new Carton("Tia Chaty",14,a014);
        Carton c015=new Carton("Antonella Herrera",15,a015);
        Carton c016=new Carton("Ailin Villavicencio",16,a016);
        Carton c017=new Carton("",17,a017);
        Carton c018=new Carton("Gabriela Vidal",18,a018);
        Carton c019=new Carton("Juan Carlos Romero",19,a019);
        Carton c020=new Carton("Ricardo Lucero",20,a020);
        Carton c021=new Carton("Fabiana Quiroga",21,a021);
        Carton c022=new Carton("",22,a022);
        Carton c023=new Carton("",23,a023);
        Carton c024=new Carton("",24,a024);
        Carton c025=new Carton("",25,a025);
        Carton c026=new Carton("",26,a026);
        Carton c027=new Carton("",27,a027);
        Carton c028=new Carton("",28,a028);
        Carton c029=new Carton("",29,a029);
        Carton c030=new Carton("",30,a030);
        
        
        
        
        ArrayList<Carton> array= new ArrayList<>();
        
        array.add(c001);array.add(c002);
        array.add(c003);array.add(c004);
        array.add(c005);array.add(c006);
        array.add(c007);array.add(c008);
        array.add(c009);array.add(c010);
        array.add(c011);array.add(c012);
        array.add(c013);array.add(c014);
        array.add(c015);array.add(c016);
        array.add(c017);array.add(c018);
        array.add(c019);array.add(c020);
        array.add(c021);array.add(c022);
        array.add(c023);array.add(c024);
        array.add(c025);array.add(c026);
        array.add(c027);array.add(c028);
        array.add(c029);array.add(c030);
        
        
        ArrayList<Carton> array2= new ArrayList<>();
        
        for (int i = 0; i < array.size(); i++) {
            if(!array.get(i).getNombre().equals("")){
                array2.add(array.get(i));
            }
        }
        
        ArrayList <Byte> placa=new ArrayList<>();
        
        String grilla[]={"x","x","x","x","x","x","x","x","x","x",
                "x","x","x","x","x","x","x","x","x","x",
                "x","x","x","x","x","x","x","x","x","x",
                "x","x","x","x","x","x","x","x","x","x",
                "x","x","x","x","x","x","x","x","x","x",
                "x","x","x","x","x","x","x","x","x","x",
                "x","x","x","x","x","x","x","x","x","x",
                "x","x","x","x","x","x","x","x","x","x",
                "x","x","x","x","x","x","x","x","x","x"};
        do{
            System.out.print("Ingrese un numero: ");
            num=leer.nextByte();
            if(num>0){
                placa.add(num); 
            }
                        
            if(num==-1){
                for (int i = 0; i < placa.size(); i++) {
                    for (int j = 0; j <grilla.length; j++) {
                        if(placa.get(i)==(j+1)){
                            grilla[j]=String.valueOf(placa.get(i));
                        }
                    }
                }
                for (int i = 0; i < grilla.length; i++) {
                    System.out.print(grilla[i]+" - ");
                    if((i+1)%10==0){
                        System.out.println("");
                    }
                }
                System.out.println("");
            }
            for (int i = 0; i <array2.size(); i++) {
                array2.get(i).marcador(num);
                if(contTerna>0){
                    terna=array2.get(i).buscaTerna();
                    if(terna){
                        ternaFinal=true;
                    }
                }
                if (contTerna<=0 && contQuintina>0){
                    quintina=array2.get(i).buscaQuintina(); 
                    if(quintina){
                        quintinaFinal=true;
                    }
                }
                if (contQuintina<=0 && contLleno>0){
                    lleno=array2.get(i).buscaLleno();
                    if(lleno){
                        llenoFinal=true;
                    }
                }
            }
            if(ternaFinal){
                contTerna--;
                ternaFinal=false;
            }
            if(quintinaFinal){
                contQuintina--;
                quintinaFinal=false;
            }
            if(llenoFinal){
                contLleno--;
                llenoFinal=false;
            }
            if (contTerna==0) {
                System.out.println("\n\nDesea buscar otra terna?");
                String respuesta=leer.next();
                if(respuesta.equalsIgnoreCase("si")){
                    contTerna=1;
                }else{
                    contTerna=-1;
                }
            } else if (contQuintina==0) {
                System.out.println("\n\nDesea buscar otra quintina?");
                String respuesta=leer.next();
                if(respuesta.equalsIgnoreCase("si")){
                    contQuintina=1;
                }else{
                    contQuintina=-1;
                }
            } else if (contLleno==0) {
                System.out.println("\n\nDesea buscar otro carton lleno?");
                String respuesta=leer.next();
                if(respuesta.equalsIgnoreCase("si")){
                    contLleno=1;
                }else{
                    contLleno=-1;
                }
            }
        }while(contLleno>0);
    }   
}