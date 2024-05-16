package niurkayupanqui;

public class WhileN {
    
    public void whileN(int tamano, char caracter) {
        int f = 1;
        while (f <= tamano) {
            int c = 1;
            while (c <= tamano) {
                if (c == 1 || c == tamano || f == c) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                c++;
            }
            System.out.println();
            f++;
        }

    }





}
