package antonelacasa;

public class WhileAntonelaCasa {
    public void whileAntonelaCasaAC(int size, char symbA, char symbC){
        int i = 0;

        // Letra A
        while (i < size) {
            System.out.print(symbA);
            i++;
        }
        System.out.print("  "); // Separador entre letras

        // Letra C
        i = 0;
        while (i < size) {
            System.out.print(symbC);
            i++;
        }
        System.out.println();

        // Cuerpo de la letra A
        i = 0;
        while (i < size) {
            int j = 0;
            while (j < size) {
                if (j == 0 || j == size - 1 || i == size / 2) {
                    System.out.print(symbA);
                } else {
                    System.out.print(' ');
                }
                j++;
            }
            System.out.print("  "); // Separador entre letras

            // Cuerpo de la letra C
            j = 0;
            while (j < size) {
                if (i == size || i == size - 1 || j == 0) {
                    System.out.print(symbC);
                } else {
                    System.out.print(' ');
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    
}
