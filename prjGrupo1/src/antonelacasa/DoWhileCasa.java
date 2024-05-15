package antonelacasa;

public class DoWhileCasa {
    public void dowhileCasaC(int size, char symb){
        // Primer bucle
        int i = 0;
        do {
            System.out.print(symb);
            i++;
        } while (i < size);
        System.out.println();
        
        // Segundo bucle
        int j = 0;
        do {
            System.out.println(symb);
            j++;
        } while (j < size);
        
        // Tercer bucle
        int k = 0;
        do {
            System.out.print(symb);
            k++;
        } while (k < size);
        System.out.println();
    }
    
}
