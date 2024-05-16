package niurkayupanqui;
public class DoWhileNY {

    public static void doWhileNY(int tamano, char caracter) {
    
        int f = 1;
            do {
            int c = 1;
             do {
                if (c < tamano) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                c++;
            } while (c <= tamano);
            System.out.println();
            f++;
        } while (f <= tamano);
    }
}

