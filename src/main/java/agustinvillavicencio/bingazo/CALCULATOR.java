
package agustinvillavicencio.bingazo;

import java.text.DecimalFormat;
import java.util.Scanner;


 // @author Agustin Villa
 
public class CALCULATOR {
    public static void main(String[] args) {
        String resp="";
        Scanner leer= new Scanner(System.in);
        int cartones;
        do{
            System.out.print("Ingrese cantidad de cartones: ");
            cartones=leer.nextInt();
            calculos(cartones);
            System.out.println("");
            System.out.println("============");
            System.out.println("Terminamos?");
            resp=leer.next();
        }while(!resp.equalsIgnoreCase("si"));
    }
    
    public static void calculos(int cartones){
        DecimalFormat df = new DecimalFormat("#.00");
        float pozoTotal=cartones*700;
        float pozoLleno=pozoTotal*50/100;
        float pozoQuintina=pozoTotal*15/100;
        float pozoTerna=pozoTotal*9/100;
        float pozoSorteo=1400;
        float ganancia=(pozoTotal*26/100)-pozoSorteo;
        if (cartones<=50) {
            System.out.println("\nPozo total: $"+pozoTotal);
            System.out.println("\nPozo para 1° Carton Lleno: $"+df.format(pozoLleno*0.514287));
            System.out.println("Pozo para 2° Carton Lleno: $"+df.format(pozoLleno*0.371428));
            System.out.println("Pozo para Acumulado: $"+df.format(pozoLleno*0.114285));
            System.out.println("\nPozo para 1° Quintina: $"+df.format(pozoQuintina*0.576924));
            System.out.println("Pozo para 2° Quintina: $"+df.format(pozoQuintina*0.423076));
            System.out.println("\nPozo para 1° Terna: $"+df.format(pozoTerna*0.516129));
            System.out.println("Pozo para 2° Terna: $"+df.format(pozoTerna*0.483871));
            System.out.println("Pozo para Sorteo: $"+pozoSorteo);
            System.out.println("\nGanancia: $"+ganancia);
        }else{
            System.out.println("\nPozo total: $"+pozoTotal);
            System.out.println("\nPozo para 1° Carton Lleno: $9000");
            System.out.println("Pozo para 2° Carton Lleno: $6500");
            System.out.println("Pozo para Acumulado: $2000");
            System.out.println("\nPozo para 1° Quintina: $3000");
            System.out.println("Pozo para 2° Quintina: $2200");
            System.out.println("\nPozo para 1° Terna: $1600");
            System.out.println("Pozo para 2° Terna: $1500");
            System.out.println("Pozo para Sorteo: $1400");
            System.out.println("\nGanancia: $"+ganancia);
            System.out.println("Sobrante: $"+((pozoLleno-17500)+(pozoQuintina-5200)+(pozoTerna-3100)));
        }
    }
}

/*
---------------------$300---------$400-------$450-------

    1º Carton lleno: 10000  -->  12000  --> 14000
    2º Carton lleno:  5000  -->   8000  -->  8500
    
    1ºQuintina:      2500   -->   3000  -->  3400
    2ºQuintina:      2000   -->   3000  -->  3400

    1ºTerna:         1500   -->   2000  -->  2000
    2ºTerna:         1200   -->   1600  -->  2000

--------------$400-----------
    1º Carton lleno:12000
    2º Carton lleno:8000
    
    1ºQuintina:3000
    2ºQuintina:3000

    1ºTerna:2000
    2ºTerna:1600

*/