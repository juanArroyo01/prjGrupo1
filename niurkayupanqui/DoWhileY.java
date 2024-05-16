package niurkayupanqui;

public class DoWhileY {
 public void doWhileY(int tamano, char caracter) {
            int f = 1;
            do {
                int c = 1;
                do {
                    if (c == 1 || c == tamano || f == c) {
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
       

