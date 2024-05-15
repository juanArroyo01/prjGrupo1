public class ForStalinCasaSC {
    public void imprimirIniciales(int size, char symb) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            for (int j = 1; j <=size; j++) {
                if (i == 1 || i == size || i - 1 == size / 2 || j == 1 && i <= size / 2 || j == size && i > size / 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       System.out.println();
    }
}
