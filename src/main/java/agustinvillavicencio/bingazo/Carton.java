
package agustinvillavicencio.bingazo;


 // @author Agustin Villa
 
public class Carton {
    private int nombre;
    private byte[][]numeros;
    private boolean terna1;
    private boolean terna2;
    private boolean terna3;
    private boolean terna4;
    private boolean terna5;
    private boolean terna6;
    private boolean terna7;
    private boolean terna8;
    private boolean terna9;
    private boolean quintina1;
    private boolean quintina2;
    private boolean quintina3;
    private boolean quintina4;
    private boolean quintina5;
    private boolean quintina6;
    private boolean quintina7;
    private boolean quintina8;
    private boolean quintina9;
    private boolean lleno1;
    private boolean lleno2;
    private boolean lleno3;

    public Carton(int nombre,byte[][] numeros) {
        this.nombre=nombre;
        this.numeros = numeros;
        this.terna1 = false;
        this.terna2 = false;
        this.terna3 = false;
        this.terna4 = false;
        this.terna5 = false;
        this.terna6 = false;
        this.terna7 = false;
        this.terna8 = false;
        this.terna9 = false;
        this.quintina1 = false;
        this.quintina2 = false;
        this.quintina3 = false;
        this.quintina4 = false;
        this.quintina5 = false;
        this.quintina6 = false;
        this.quintina7 = false;
        this.quintina8 = false;
        this.quintina9 = false;
        this.lleno1 = false;
        this.lleno2 = false;
        this.lleno3 = false;
        
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public boolean isTerna4() {
        return terna4;
    }

    public void setTerna4(boolean terna4) {
        this.terna4 = terna4;
    }

    public boolean isTerna5() {
        return terna5;
    }

    public void setTerna5(boolean terna5) {
        this.terna5 = terna5;
    }

    public boolean isTerna6() {
        return terna6;
    }

    public void setTerna6(boolean terna6) {
        this.terna6 = terna6;
    }

    public boolean isTerna7() {
        return terna7;
    }

    public void setTerna7(boolean terna7) {
        this.terna7 = terna7;
    }

    public boolean isTerna8() {
        return terna8;
    }

    public void setTerna8(boolean terna8) {
        this.terna8 = terna8;
    }

    public boolean isTerna9() {
        return terna9;
    }

    public void setTerna9(boolean terna9) {
        this.terna9 = terna9;
    }

    public boolean isQuintina4() {
        return quintina4;
    }

    public void setQuintina4(boolean quintina4) {
        this.quintina4 = quintina4;
    }

    public boolean isQuintina5() {
        return quintina5;
    }

    public void setQuintina5(boolean quintina5) {
        this.quintina5 = quintina5;
    }

    public boolean isQuintina6() {
        return quintina6;
    }

    public void setQuintina6(boolean quintina6) {
        this.quintina6 = quintina6;
    }

    public boolean isQuintina7() {
        return quintina7;
    }

    public void setQuintina7(boolean quintina7) {
        this.quintina7 = quintina7;
    }

    public boolean isQuintina8() {
        return quintina8;
    }

    public void setQuintina8(boolean quintina8) {
        this.quintina8 = quintina8;
    }

    public boolean isQuintina9() {
        return quintina9;
    }

    public void setQuintina9(boolean quintina9) {
        this.quintina9 = quintina9;
    }

    public boolean isCartonLleno2() {
        return lleno2;
    }

    public void setCartonLleno2(boolean cartonLleno2) {
        this.lleno2 = cartonLleno2;
    }

    public boolean isCartonLleno3() {
        return lleno3;
    }

    public void setCartonLleno3(boolean cartonLleno3) {
        this.lleno3 = cartonLleno3;
    }

    public byte[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(byte[][] numeros) {
        this.numeros = numeros;
    }

    public boolean isTerna1() {
        return terna1;
    }

    public void setTerna1(boolean terna1) {
        this.terna1 = terna1;
    }

    public boolean isTerna2() {
        return terna2;
    }

    public void setTerna2(boolean terna2) {
        this.terna2 = terna2;
    }

    public boolean isTerna3() {
        return terna3;
    }

    public void setTerna3(boolean terna3) {
        this.terna3 = terna3;
    }

    public boolean isQuintina1() {
        return quintina1;
    }

    public void setQuintina1(boolean quintina1) {
        this.quintina1 = quintina1;
    }

    public boolean isQuintina2() {
        return quintina2;
    }

    public void setQuintina2(boolean quintina2) {
        this.quintina2 = quintina2;
    }

    public boolean isQuintina3() {
        return quintina3;
    }

    public void setQuintina3(boolean quintina3) {
        this.quintina3 = quintina3;
    }

    public boolean isCartonLleno1() {
        return lleno1;
    }

    public void setCartonLleno1(boolean cartonLleno1) {
        this.lleno1 = cartonLleno1;
    }
    public void marcador(byte num){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j <numeros[0].length; j++) {
               if (numeros[i][j]==num){
                numeros[i][j]=0;
                break;
                }
            }
        }
    }
  
    public boolean buscaTerna(){
        byte cont=0;
        boolean terna=false;
        for (int i = 0; i < numeros.length; i++) {
            cont=0;
            for (int j = 0; j <numeros[0].length; j++) {
                if(numeros[i][j]==0){
                    cont++;
                    if(cont==3){
                        if(i==0 && !terna1){
                            System.out.println("\n-------------------------");
                            System.out.print("TERNA!! en carton Nº"+nombre);
                            System.out.println(" , fila 1");
                            System.out.println("--------------------------\n");
                            terna1=true; 
                            terna=true;
                            break;
                        }else if(i==1 && !terna2){
                            System.out.println("\n--------------------------");
                            System.out.print("TERNA!! en carton Nº"+nombre);
                            System.out.println(" , fila 2");
                            System.out.println("--------------------------\n");
                            terna2=true; 
                            terna=true;
                            break;
                        }else if(i==2 && !terna3){
                            System.out.println("\n--------------------------");
                            System.out.print("TERNA!! en carton Nº"+nombre);
                            System.out.println(" , fila 3");
                            System.out.println("--------------------------\n");
                            terna3=true; 
                            terna=true;
                            break;
                        }else if(i==3 && !terna4){
                            System.out.println("\n--------------------------");
                            System.out.print("TERNA!! en carton Nº"+nombre);
                            System.out.println(" , fila 4");
                            System.out.println("--------------------------\n");
                            terna4=true; 
                            terna=true;
                            break;
                        }else if(i==4 && !terna5){
                            System.out.println("\n--------------------------");
                            System.out.print("TERNA!! en carton Nº"+nombre);
                            System.out.println(" , fila 5");
                            System.out.println("--------------------------\n");
                            terna5=true; 
                            terna=true;
                            break;
                        }else if(i==5 && !terna6){
                            System.out.println("\n--------------------------");
                            System.out.print("TERNA!! en carton Nº"+nombre);
                            System.out.println(" , fila 6");
                            System.out.println("--------------------------\n");
                            terna6=true; 
                            terna=true;
                            break;
                        }else if(i==6 && !terna7){
                            System.out.println("\n--------------------------");
                            System.out.print("TERNA!! en carton Nº"+nombre);
                            System.out.println(" , fila 7");
                            System.out.println("--------------------------\n");
                            terna7=true; 
                            terna=true;
                            break;
                        }else if(i==7 && !terna8){
                            System.out.println("\n--------------------------");
                            System.out.print("TERNA!! en carton Nº"+nombre);
                            System.out.println(" , fila 8");
                            System.out.println("--------------------------\n");
                            terna8=true; 
                            terna=true;
                            break;
                        }else if(i==8 && !terna9){
                            System.out.println("\n--------------------------");
                            System.out.print("TERNA!! en carton Nº"+nombre);
                            System.out.println(" , fila 9");
                            System.out.println("--------------------------\n");
                            terna9=true; 
                            terna=true;
                            break;
                        }
                    }
                }
            }
        }
        return terna;
    }
    public boolean buscaQuintina(){
        boolean quintina=false;
        byte cont=0,faltante=0;
        for (int i = 0; i < numeros.length; i++) {
            cont=0;
            faltante=0;
            for (int j = 0; j <numeros[0].length; j++) {
                
                if(numeros[i][j]!=0){
                    faltante=numeros[i][j];
                }
                if(numeros[i][j]==0){
                    cont++;
                }
                
                if(cont==5){
                    if(i==0 && !terna1 && !quintina1){
                        System.out.println("\n--------------------------");
                        System.out.print("QUINTINA!! en carton Nº"+nombre);
                        System.out.println(" , fila 1");
                        System.out.println("--------------------------\n");
                        quintina1=true; 
                        quintina=true;
                    }else if(i==1 && !terna2 && !quintina2){
                        System.out.println("\n--------------------------");
                        System.out.print("QUINTINA!! en carton Nº"+nombre);
                        System.out.println(" , fila 2");
                        System.out.println("--------------------------\n");
                        quintina2=true; 
                        quintina=true;
                    }else if(i==2 && !terna3 && !quintina3){
                        System.out.println("\n--------------------------");
                        System.out.print("QUINTINA!! en carton Nº"+nombre);
                        System.out.println(" , fila 3");
                        System.out.println("--------------------------\n");
                        quintina3=true; 
                        quintina=true;
                    }else if(i==3 && !terna4 && !quintina4){
                        System.out.println("\n--------------------------");
                        System.out.print("QUINTINA!! en carton Nº"+nombre);
                        System.out.println(" , fila 4");
                        System.out.println("--------------------------\n");
                        quintina4=true; 
                        quintina=true;
                    }else if(i==4 && !terna5 && !quintina5){
                        System.out.println("\n--------------------------");
                        System.out.print("QUINTINA!! en carton Nº"+nombre);
                        System.out.println(" , fila 5");
                        System.out.println("--------------------------\n");
                        quintina5=true; 
                        quintina=true;
                    }else if(i==5 && !terna6 && !quintina6){
                        System.out.println("\n--------------------------");
                        System.out.print("QUINTINA!! en carton Nº"+nombre);
                        System.out.println(" , fila 6");
                        System.out.println("--------------------------\n");
                        quintina6=true; 
                        quintina=true;
                    }else if(i==6 && !terna7 && !quintina7){
                        System.out.println("\n--------------------------");
                        System.out.print("QUINTINA!! en carton Nº"+nombre);
                        System.out.println(" , fila 7");
                        System.out.println("--------------------------\n");
                        quintina7=true; 
                        quintina=true;
                    }else if(i==7 && !terna8 && !quintina8){
                        System.out.println("\n--------------------------");
                        System.out.print("QUINTINA!! en carton Nº"+nombre);
                        System.out.println(" , fila 8");
                        System.out.println("--------------------------\n");
                        quintina8=true; 
                        quintina=true;
                    }else if(i==8 && !terna9 && !quintina9){
                        System.out.println("\n--------------------------");
                        System.out.print("QUINTINA!! en carton Nº"+nombre);
                        System.out.println(" , fila 9");
                        System.out.println("--------------------------\n");
                        quintina9=true; 
                        quintina=true; 
                    }
                    
                }else if(cont==4 && faltante!=0){
                    if(i==0 && !terna1 && !quintina1){
                        System.out.print("**(Casi Quintina de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }else if(i==1 && !terna2 && !quintina2){
                        System.out.print("**(Casi Quintina de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }else if(i==2 && !terna3 && !quintina3){
                        System.out.print("**(Casi Quintina de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }else if(i==3 && !terna4 && !quintina4){
                        System.out.print("**(Casi Quintina de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }else if(i==4 && !terna5 && !quintina5){
                        System.out.print("**(Casi Quintina de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }else if(i==5 && !terna6 && !quintina6){
                        System.out.print("**(Casi Quintina de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }else if(i==6 && !terna7 && !quintina7){
                        System.out.print("**(Casi Quintina de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }else if(i==7 && !terna8 && !quintina8){
                        System.out.print("**(Casi Quintina de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }else if(i==8 && !terna9 && !quintina9){  
                        System.out.print("**(Casi Quintina de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }
                }
            }
        }
        return quintina;
    }
    
    public boolean buscaLleno(){
        boolean lleno=false;
        byte cont=0,faltante=0;
        if(!lleno1){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <5; j++) {
                    
                    if(numeros[i][j]!=0){
                        faltante=numeros[i][j];
                    }else{
                        cont++;
                    }
                    
                    if(cont==15){
                        System.out.println("\n--------------------------");
                        System.out.println("CARTON LLENO!! Serie Nº"+nombre+" , 1º carton" );
                        System.out.println("--------------------------\n");
                        lleno1=true; 
                        lleno=true;
                    }else if(cont==14 && faltante!=0){
                        System.out.print("**(Casi BINGO de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }
                }
            }
        }
        if(!lleno2){
            cont=0;
            faltante=0;
            for (int i = 3; i < 6; i++) {
                for (int j = 0; j <5; j++) {
                    
                    if(numeros[i][j]!=0){
                        faltante=numeros[i][j];
                    }else{
                        cont++;
                    }
                    
                    if(cont==15){
                        System.out.println("\n--------------------------");
                        System.out.println("CARTON LLENO!! Serie Nº"+nombre+" , 2º carton" );
                        System.out.println("--------------------------\n");
                        lleno2=true; 
                        lleno=true;
                    }else if(cont==14 && faltante!=0){
                        System.out.print("**(Casi BINGO de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    } 
                }
            }
        }
        if(!lleno3){
            cont=0;
            faltante=0;
            for (int i = 6; i < 9; i++) {
                for (int j = 0; j <5; j++) {
                    
                    if(numeros[i][j]!=0){
                        faltante=numeros[i][j];
                    }else{
                        cont++;
                    }
                    
                    if(cont==15){
                        System.out.println("\n--------------------------");
                        System.out.println("CARTON LLENO!! Serie Nº"+nombre+" , 3º carton" );
                        System.out.println("--------------------------\n");
                        lleno3=true; 
                        lleno=true;
                    }else if(cont==14 && faltante!=0){
                        System.out.print("**(Casi BINGO de la serie Nº"+nombre);
                        System.out.println(". Le falta el numero "+faltante+")**");
                    }
                }
            }
        }
        return lleno;
    }
}