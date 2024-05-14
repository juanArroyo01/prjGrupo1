package juanarroyo;

public class WhileArroyo {

    public void whileApellidoA(int size, char symb) {

        int aux = 0, aux2 = size, aux3 = 0, aux4 = 0;

        while (aux < size) {
            while (aux2-- > aux) {
                System.out.print(' ');
            }

            System.out.print(symb);

            if (aux == (size / 2)) {
                while (aux3 < size) {
                    System.out.print(symb);
                    aux3++;
                }
            }

            if (aux > 0 && aux != (size / 2)) {
                while (aux4 < aux) {
                    System.out.print("  ");
                    aux4++;
                }
                System.out.print(symb);
            }

            System.out.println();

            aux4 = 0;
            aux2 = size;
            aux++;
        }

    }

}
