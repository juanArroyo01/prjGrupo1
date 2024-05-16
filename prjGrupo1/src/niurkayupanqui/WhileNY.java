package niurkayupanqui;

public class WhileNY {

    public void whileNY(int tamano, char caracter) {
        int i = 0;
        while (i < tamano) {
            int j = 0;
            while (j < tamano) {
                if (j == 0 || j == tamano - 1 || j == i) {
                    System.out.print(caracter);
                } else {
                    System.out.print(' ');
                }
                j++;
            }

            System.out.print("  "); // Espacio entre la N y la Y

            j = 0;
            while (j < tamano) {
                if ((i < tamano / 2 && (j == i || j == tamano - 1 - i)) || (i >= tamano / 2 && j == tamano / 2)) {
                    System.out.print(caracter);
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