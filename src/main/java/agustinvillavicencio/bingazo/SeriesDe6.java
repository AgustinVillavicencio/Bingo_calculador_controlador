
package agustinvillavicencio.bingazo;

// @author Agustin Villavicencio

import static agustinvillavicencio.bingazo.MAIN.leer;
import java.util.ArrayList;

public class SeriesDe6 {
    public static void main(String[] args) {
        
        boolean terna,quintina,lleno,ternaFinal=false,
                llenoFinal=false,quintinaFinal=false;
        byte num;
        byte contTerna=0,contQuintina=2,contLleno=2;
        
        /*byte a007[][]={{,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,},
            {,,,,},{,,,,},{,,,,}};*/
        byte a001[][]={{9,17,44,61,85},{24,35,52,75,90},{18,37,49,64,79},
            {4,23,51,73,80},{16,31,48,63,78},{25,38,59,68,86},
            {7,10,41,60,84},{20,36,55,72,88},{11,28,43,58,76},
            {13,21,42,50,83},{2,26,33,65,71},{6,15,34,53,66},
            {3,19,40,74,87},{8,22,30,54,67},{29,45,56,77,89},
            {1,32,46,70,81},{12,27,57,62,82},{5,14,39,47,69}};
        byte a002[][]={{4,11,45,68,85},{22,38,51,71,90},{15,24,46,55,72},
            {5,20,54,73,82},{19,31,42,60,76},{29,34,59,61,89},
            {7,32,44,77,81},{16,23,57,65,87},{8,17,35,48,66},
            {1,13,40,67,80},{28,36,52,75,88},{14,39,41,69,78},
            {10,21,43,50,83},{2,27,30,62,79},{9,12,37,56,63},
            {3,18,47,70,84},{6,25,33,53,64},{26,49,58,74,86}};
        byte a003[][]={{3,11,42,60,80},{26,33,53,71,89},{18,34,47,64,77},
            {8,20,51,72,83},{14,32,46,62,73},{27,38,58,67,88},
            {9,13,40,61,82},{21,30,50,74,84},{15,25,49,56,78},
            {16,23,44,55,90},{2,24,31,63,70},{6,17,35,57,68},
            {1,19,41,75,81},{5,22,37,54,66},{28,45,59,79,87},
            {4,36,43,76,85},{10,29,52,65,86},{7,12,39,48,69}};
        byte a004[][]={{5,12,41,62,83},{23,34,53,74,84},{18,28,45,55,77},
            {8,27,54,70,80},{11,30,47,61,72},{29,36,56,67,82},
            {1,31,40,78,87},{14,20,51,60,90},{9,19,38,44,63},
            {4,13,46,68,86},{22,33,50,76,88},{15,39,49,69,79},
            {10,24,46,52,81},{2,25,32,64,75},{7,17,35,58,66},
            {3,16,42,71,85},{6,21,37,57,65},{26,48,59,73,89}};
        byte a005[][]={{20,37,54,62,82},{13,39,40,77,84},{3,18,44,64,79},
            {23,42,53,76,87},{1,28,30,55,88},{8,10,34,48,60},
            {5,14,43,66,75},{17,31,52,78,80},{25,36,56,67,89},
            {4,24,46,61,85},{11,38,49,65,72},{9,29,50,73,90},
            {16,35,45,68,71},{19,22,51,74,83},{7,27,47,58,86},
            {2,12,32,57,63},{6,21,33,69,70},{15,26,41,59,81}};
        byte a006[][]={{27,30,57,64,80},{13,36,40,77,86},{9,19,42,66,79},
            {1,11,43,61,74},{12,31,54,78,83},{25,33,59,63,90},
            {21,44,50,72,82},{4,22,35,53,89},{7,14,38,49,67},
            {21,44,50,72,82},{4,22,35,53,89},{7,14,38,49,67},
            {21,44,50,72,82},{4,22,35,53,89},{7,14,38,49,67},
            {21,44,50,72,82},{4,22,35,53,89},{7,14,38,49,67}};
        
        
        CartonSix c001=new CartonSix(2587,a001);
        CartonSix c002=new CartonSix(2588,a002);
        CartonSix c003=new CartonSix(2590,a003);
        CartonSix c004=new CartonSix(2591,a004);
        CartonSix c005=new CartonSix(893,a005);
        //CartonSix c006=new CartonSix(6,a006);
        
        ArrayList<CartonSix> array= new ArrayList<>();
        
        array.add(c001);array.add(c002);
        array.add(c003);array.add(c004);
        array.add(c005);//array.add(c006);
        
        do{
            System.out.print("Ingrese un numero: ");
            num=leer.nextByte();
            
            for (int i = 0; i <array.size(); i++) {
                array.get(i).marcador(num);
                /*if(contTerna>0){
                    terna=array.get(i).buscaTerna();
                    if(terna){
                        ternaFinal=true;
                    }
                }*/
                if (/*contTerna<=0 && */contQuintina>0){
                    quintina=array.get(i).buscaQuintina(); 
                    if(quintina){
                        quintinaFinal=true;
                    }
                }
                if (contQuintina<=0 && contLleno>0){
                    lleno=array.get(i).buscaLleno();
                    if(lleno){
                        llenoFinal=true;
                    }
                }
            }
            /*if(ternaFinal){
                contTerna--;
                ternaFinal=false;
            }*/
            if(quintinaFinal){
                contQuintina--;
                quintinaFinal=false;
            }
            if(llenoFinal){
                contLleno--;
                llenoFinal=false;
            }
            /*if (contTerna==0) {
                System.out.println("\n\nDesea buscar otra terna?");
                String respuesta=leer.next();
                if(respuesta.equalsIgnoreCase("si")){
                    contTerna=1;
                }else{
                    contTerna=-1;
                }
            } else */if (contQuintina==0) {
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