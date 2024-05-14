package juanarroyo;

public class DoWhileJuan {

    public void doWhileNombreJ(int size, char symb) {

        System.out.println();

        int i = 0, j = 0;

        do {
            System.out.print(symb);
            i++;
        } while (i < size);

        System.out.println();

        i = 0;

        do {

            do {
                if (j == size / 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(' ');
                }
                j++;
            } while (j < (size - 1));

            j = 0;
            System.out.println();
            i++;
        } while (i < (size - 2));

        i = 0;
        j = 0;

        do {

            System.out.print(symb);
            i++;
        } while (i <= (size / 2));

    }

}
