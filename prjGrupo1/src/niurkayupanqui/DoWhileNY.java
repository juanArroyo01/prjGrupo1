package niurkayupanqui;

public class DoWhileNY {

    public void doWhileNY(int tamano, char caracter) {

        int i = 0;
        do {
            int j = 0;
            do {
                if (j == 0 || j == tamano - 1 || j == i) {
                    System.out.print(caracter);
                } else {
                    System.out.print(' ');
                }
                j++;
            } while (j < tamano);
        
            System.out.print("  "); // Espacio entre la N y la Y
        
            j = 0;
            do {
                if ((i < tamano / 2 && (j == i || j == tamano - 1 - i)) || (i >= tamano / 2 && j == tamano / 2)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(' ');
                }
                j++;
            } while (j < tamano);
        
            System.out.println();
            i++;
        } while (i < tamano);
        
    }
}
