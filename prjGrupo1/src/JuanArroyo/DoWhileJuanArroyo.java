package juanarroyo;

public class DoWhileJuanArroyo {

    public void doWhileNombreApellidoJA(int size, char symb) {
        int auxDec = size, auxInc = 1, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0;

        do {
            System.out.print(symb);
            i++;
        } while (i < size);

        if (size >= 10) {

            do {
                System.out.print(' ');
                j++;
            } while (j < (auxDec - 3));

        } else {
            do {
                System.out.print(' ');
                j++;
            } while (j < (auxDec - 1));
        }

        System.out.print(symb);

        System.out.println();

        do {

            do {

                if (l == size / 2) {
                    System.out.print(symb);

                    do {
                        System.out.print(' ');
                        m++;
                    } while (m < auxDec);

                    System.out.print(symb);

                    m = 0;

                    do {
                        System.out.print(' ');
                        m++;
                    } while (m < auxInc);

                    m = 0;

                    System.out.print(symb);

                    auxInc += 2;
                    auxDec--;
                } else {
                    System.out.print(' ');
                }

                l++;
            } while (l < (size - 1));

            l = 0;

            if (k == (size / 2) - 1) {
                if (size > 6 && size < 10) {
                    do {
                        System.out.print("\b");
                        n++;
                    } while (n < (size + 2));
                    n = 0;
                } else if (size >= 10) {
                    do {
                        System.out.print("\b");
                        n++;
                    } while (n < (size * 2));
                    n = 0;
                } else {
                    do {
                        System.out.print("\b");
                        n++;
                    } while (n < (size + 1));
                    n = 0;
                }
                do {
                    System.out.print(symb);
                    n++;
                } while (n < size);

                n = 0;
            }

            System.out.println();

            k++;
        } while (k < (size - 2));

        k = 0;

        do {
            System.out.print(symb);
            k++;
        } while (k < (size / 2));

        k = 0;
    }

}
