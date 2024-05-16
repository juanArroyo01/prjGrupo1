package niurkayupanqui;

public class WhileY {

    public void whileY(int tamano, char caracter) {
        int f = 1;
        while (f <= tamano) {
            int c = 1;
            while (c <= tamano) {
                if (f == c || c == tamano - 1 || (c == 0 && f > tamano / 2) || (c == tamano - 1 && f < tamano / 2)) {
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
