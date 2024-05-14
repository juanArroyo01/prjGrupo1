package juanarroyo;

public class ForArroyo {

    public void forApellidoA(int size, char symb) {

        for (int i = 0; i < size; i++) {

            for (int j = size; j > i; j--) {
                System.out.print(' ');
            }

            System.out.print(symb);

            if (i == (size / 2)) {
                for (int k = 0; k < size; k++) {
                    System.out.print(symb);
                }
            }

            if (i > 0 && i != (size / 2)) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.print(symb);
            }

            System.out.println();
        }
    }

}
