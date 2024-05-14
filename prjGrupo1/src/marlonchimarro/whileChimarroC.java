package marlonchimarro;

public class whileChimarroC {
    public void whilechimarroc(int size, char symb) {

        int i = 1;
        while (i <= size) {
            int j = 1;
            while (j <= size) {
                if (i == 1 || i == size || j == 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println(); 
            i++;
        }

    }
}