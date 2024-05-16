package niurkayupanqui;

public class DoWhileY {
    public void doWhileY(int tamano, char caracter) {
        int f = 0;
        do {
            int c = 0;
            do {
                if ((f <= tamano / 2 && (c == f || c == tamano - 1 - f)) || (f > tamano / 2 && c == tamano / 2)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(' ');
                }
                c++;
            } while (c < tamano);
            System.out.println();
            f++;
        } while (f < tamano);

    }
}
