package juanarroyo;

public class ForJuanArroyo {

    public void forNombreApellidoJA(int size, char symb) {
        int auxDec = size, auxInc = 1;

        for (int j = 0; j < size; j++) { // Imprime la raya de la jota
            System.out.print(symb);
        }

        if (size > 10) {
            for (int i = 0; i < auxDec - 6; i++) { // Separacion de letras
                System.out.print(' ');
            }
        } else {
            for (int i = 0; i < auxDec - 1; i++) { // Separacion de letras
                System.out.print(' ');
            }
        }

        System.out.print(symb);

        System.out.println();

        for (int i = 0; i < size - 2; i++) { // Imprime el palo de la jota
            for (int j = 0; j < size - 1; j++) {

                if (j == size / 2) {
                    System.out.print(symb);
                    for (int k = 0; k < auxDec; k++) {
                        System.out.print(' ');
                    }
                    System.out.print(symb);
                    for (int k = 0; k < auxInc; k++) {
                        System.out.print(' ');
                    }
                    System.out.print(symb);
                    auxInc += 2;
                    auxDec--;
                } else {
                    System.out.print(' ');
                }

            }

            if (i == (size / 2) - 1) {
                if (size > 6 && size < 10) {
                    for (int j = 0; j < size + 2; j++) {
                        System.out.print("\b");
                    }
                } else if (size > 10) {
                    for (int j = 0; j < (size * 1.5); j++) {
                        System.out.print("\b");
                    }
                } else {
                    for (int j = 0; j < (size + 1); j++) {
                        System.out.print("\b");
                    }
                }

                for (int k = 0; k < size; k++) {
                    System.out.print(symb);
                }
            }
            System.out.println();
        }

        for (int i = 0; i <= size / 2; i++) { // Imprime el de la jota
            System.out.print(symb);
        }

    }

}
