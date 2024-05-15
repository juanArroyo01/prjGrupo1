package antonelacasa;

public class WhileCasa {
    public void whileCasaC(int size, char symb){
        // Primer bucle
        int i = 0;
        while (i < size) {
            System.out.print(symb);
            i++;
        }
        System.out.println();
        
        // Segundo bucle
        int j = 0;
        while (j < size) {
            System.out.println(symb);
            j++;
        }
        
        // Tercer bucle
        int k = 0;
        while (k < size) {
            System.out.print(symb);
            k++;
        }
        System.out.println();
    }
}
