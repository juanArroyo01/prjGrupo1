package juanarroyo;

public class WhileJuan {

    public void whileNombreJ(int size, char symb) {
        System.out.println();
        int i = 0, j = 0;

        while (i++ < size) {
            System.out.print(symb);
        }

        System.out.println();

        i = 0;

        while (i++ < (size - 2)) {
            while (j < (size - 1)) {
                if (j == size / 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(' ');
                }
                j++;
            }
            j = 0;
            System.out.println();
        }

        i = 0;
        j = 0;

        while (i++ <= (size / 2)) {
            System.out.print(symb);
        }

    }

}
