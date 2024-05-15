package antonelacasa;

public class ForAntonelaCasa {
    public void forAntonelaCasaAC(int size, char symbA, char symbC) {

        // Letra A
        for (int i = 0; i < size; i++) {
            System.out.print(symbA);
        }
        System.out.print("  "); // Separador entre letras
        // Letra C
        for (int i = 0; i < size; i++) {
            System.out.print(symbC);
        }
        System.out.println();

        // Cuerpo de la letra A
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || i == size / 2) {
                    System.out.print(symbA);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print("  "); // Separador entre letras
            // Cuerpo de la letra C
            for (int j = 0; j < size; j++) {
                if (i == size || i == size - 1 || j == 0) {
                    System.out.print(symbC);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}