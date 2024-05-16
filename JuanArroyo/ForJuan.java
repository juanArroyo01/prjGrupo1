package juanarroyo;

public class ForJuan {

    public void forNombreJ(int size, char symb) {
        System.out.println();

        for (int j = 0; j < size; j++) { // Imprime la raya de la jota
            System.out.print(symb);
        }

        System.out.println();

        for (int i = 0; i < size - 2; i++) { // Imprime el palo de la jota
            for (int j = 0; j < size - 1; j++) {
                if (j == size / 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        for (int i = 0; i <= size / 2; i++) { // Imprime el de la jota
            System.out.print(symb);
        }
    }
}