package marlonchimarro;

public class doWhileChimarroC {
    public void dowhilechimarroc(int size, char symb) {

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
            System.out.println(); 
            i++;
        } while (i <= size);

    }
}