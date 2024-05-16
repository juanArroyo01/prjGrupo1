package niurkayupanqui;

public class ForNiurkaYupanqui {

    public void NY(int tamano, char caracter) {
        
        for (int i = 0; i < tamano; i++) {

            for (int j = 0; j < tamano; j++) {
                if (j == 0 || j == tamano - 1 || j == i) {
                    System.out.print(caracter);
                } else
                    System.out.print(' ');
            }

            
        System.out.print("  "); // Espacio entre la N y la Y

        for (int j = 0; j < tamano; j++) {
            if ((i < tamano / 2 && (j == i || j == tamano - 1 - i)) || (i >= tamano / 2 && j == tamano / 2)) {
                System.out.print(caracter);
            } else {
                System.out.print(' ');
            }
        }

        System.out.println();
        }


    }

}