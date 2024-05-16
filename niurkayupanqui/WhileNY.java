package niurkayupanqui;

    public class WhileNY {
    
            public void whileNY(int tamano, char caracter) {
       
            int f = 1;
            while (f <= tamano) {
             int c = 1;
                 while (c <= tamano) {
                if (c < tamano) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                c++;
            }
                System.out.println();
             f++;
                }
            while (f <= tamano) {
                int c = 1;
                while (c <= tamano) {
                    if ((f < tamano / 2 && (c == f || c  == tamano - 1 - f)) || (f >= tamano / 2 && c == tamano / 2)) {
        
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                    c++;
                }
                System.out.println();
                f++;
            }

        }
}
        

