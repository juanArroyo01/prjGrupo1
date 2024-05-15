package antonelacasa;

public class DoWhileAntonelaCasa {
    public void dowhileAntonelaCasaAC(int size, char symbA, char symbC){
        int i = 0;

        // Letra A
        do {
            System.out.print(symbA);
            i++;
        } while (i < size);
        System.out.print("  "); // Separador entre letras

        // Reinicializamos i para la siguiente iteración
        i = 0;
        // Letra C
        do {
            System.out.print(symbC);
            i++;
        } while (i < size);
        System.out.println();

        // Reinicializamos i para el siguiente conjunto de iteraciones
        i = 0;
        // Cuerpo de la letra A
        do {
            int j = 0;
            do {
                if (j == 0 || j == size - 1 || i == size / 2) {
                    System.out.print(symbA);
                } else {
                    System.out.print(' ');
                }
                j++;
            } while (j < size);
            System.out.print("  "); // Separador entre letras

            // Cuerpo de la letra C
            j = 0;
            do {
                if (i == size || i == size - 1 || j == 0) {
                    System.out.print(symbC);
                } else {
                    System.out.print(' ');
                }
                j++;
            } while (j < size);
            System.out.println();
            i++;
        } while (i < size);
    }
}
