package niurkayupanqui;

public class ForYupanqui {

    public void forY(int tamano, String caracter){
        for (int f = 0; f < tamano; f++) {
            for (int c = 0; c < tamano; c++) {
                if (f == c || c == tamano - 1 || (c == 0 && f > tamano / 2) || (c == tamano - 1 && f < tamano / 2))
                    System.out.print(caracter);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }   
    }

}
