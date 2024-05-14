package juanarroyo;

public class DoWhileArroyo {

    public void doWhileApellido(int size, char symb) {

        int aux = 0, aux2 = size, aux3 = 0, aux4 = 0;

        do {

            do {
                System.out.print(' ');
                aux2--;
            } while (aux2 > aux);

            System.out.print(symb);

            if (aux == (size / 2)) {
                do {
                    System.out.print(symb);
                    aux3++;
                } while (aux3 < size);
            }

            if (aux > 0 && aux != (size / 2)) {
                do {
                    System.out.print("  ");
                    aux4++;
                } while (aux4 < aux);
                System.out.print(symb);
            }

            System.out.println();

            aux4 = 0;
            aux2 = size;
            aux++;

        } while (aux < size);

    }

}
