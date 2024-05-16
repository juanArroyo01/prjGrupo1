package niurkayupanqui;

public class ForNiurka {
    
    public void forN(int tamano, String caracter){
        for (int f=1 ; f<=tamano; f++ ){
            for (int c=1 ; c<=tamano; c++ )
                if(c==1 || c==tamano || f==c )
                    System.out.print(caracter);
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
    
}
