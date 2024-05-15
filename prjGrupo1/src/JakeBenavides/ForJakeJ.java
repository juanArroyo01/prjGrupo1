package JakeBenavides;

public class ForJakeJ{
    public void forNombreJ(int size, char symb){

        System.out.println();
        for (int i = 0; i < size ; i++){
            System.out.print(symb);
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0 ; j < size; j++) {
                if (j == size / 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

        for (int i = 0; i <= size / 2; i++) {
            System.out.print(symb);   
        }
    }
}