package juanarroyo;

public class WhileJuanArroyo {

    public void whileNombreApellidoJA(int size, char symb) {
        int auxDec = size, auxInc = 1, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0;

        while (i++ < size) {
            System.out.print(symb);
        }

        if (size > 10) {
            while (j++ < (auxDec - 6)) {
                System.out.print(' ');
            }
        } else {
            while (j++ < (auxDec - 2)) {
                System.out.print(' ');
            }
        }

        System.out.print(symb);

        System.out.println();

        while (k++ < (size - 2)) {
            while (l++ < (size - 1)) {
                if (l == size / 2) {
                    System.out.print(symb);

                    while (m++ < auxDec) {
                        System.out.print(' ');
                    }

                    System.out.print(symb);

                    m = 0;

                    while (m++ < auxInc) {
                        System.out.print(' ');
                    }

                    m = 0;

                    System.out.print(symb);

                    auxInc += 2;

                    auxDec--;
                } else {
                    System.out.print(' ');
                }
            }
            l = 0;

            if (k == (size / 2) - 1) {
                if (size > 6 && size < 10) {
                    while (n++ < (size + 2)) {
                        System.out.print("\b");
                    }
                    n = 0;
                } else if (size > 10) {
                    while (n++ < (size * 1.5)) {
                        System.out.print("\b");
                    }
                    n = 0;
                } else {
                    while (n++ < (size + 1)) {
                        System.out.print("\b");
                    }
                    n = 0;
                }

                while (n++ < size) {
                    System.out.print(symb);
                }
                n = 0;
            }

            System.out.println();
        }
        k = 0;

        while (k++ < (size / 2)) {
            System.out.print(symb);
        }

        k = 0;
    }

}
