package antonelacasa;

public class ForCasa {
    public void forCasac(int size, char symb){

        //Imprime linea superior horizontal de la C
        for (int i = 0; i < size; i++) {
         System.out.print(symb);   
        }
        System.out.println();
         //Imprime linea lateral 
        for (int i = 0; i < size; i++) {
            System.out.println(symb);   
            
        } //Imprime linea inferior horizontal de la C
        for (int i = 0; i < size; i++) {
            System.out.print(symb);   
        }
        System.out.println();

    }

}
