package marlonchimarro;

public class forChimarroC {
    public void forchimarroc(int size, char symb) {

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

    }
}
