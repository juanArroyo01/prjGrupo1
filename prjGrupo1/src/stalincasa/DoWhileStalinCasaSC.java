public class DoWhileStalinCasaSC {
    public void doWhileNomApeliSC(int size, char symb) {
        int i = 1;
        do {
            int j = 1;
            do {
                if (i == 1 || i == size || j == 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j <= size);
            System.out.print("   ");
            j = 1;
            do {
                if (i == 1 || i == size || i - 1 == size / 2 || j == 1 && i <= size / 2 || j == size && i > size / 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j <= size);
            i++;
            System.out.println();
            
        } while (i <= size);
    }
}
