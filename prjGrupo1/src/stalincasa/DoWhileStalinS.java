public class DoWhileStalinS {
    public void imprimirDoWhileS(int size, char symb) {
        int i = 0;
        do {
            int j = 0;
            do {
                if (i == 0 || i == size - 1 || i == size / 2) {
                    System.out.print(symb);
                } else if (i < size / 2 && j == 0) {
                    System.out.print(symb);
                } else if (i > size / 2 && j == size - 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(' ');
                }
                j++;
            } while (j < size);

            i++;
            System.out.println();
        } while (i < size);
    }
}
