package marlonchimarro;

public class doWhileMarlonM {
    public void dowhilemarlonm(int size, char symb) {

        System.out.println("Printing '" + symb + "' pattern:");
        int i = 1;
        do {
            int j = 1;
            do {
                if (j == 1 || j == size || (i + j == size + 1 && i <= size / 2 + 1) || (i == j && i <= size / 2)) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j <= size);
            System.out.println();
            i++;
        } while (i <= size);

    }
}