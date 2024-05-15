public class WhileCasaC {
    public void whileApellidoC(int size , char symb){
       int i = 0, j = 1 ,k=0 ;
       
       while(i<size){
        System.out.print(symb);
        while (j<size) {
            if(i==0|| j== size){
                System.out.print( symb);

            }else{
                System.out.print(" ");
            }
            j++;
        }
        i++;
        System.out.println();
       } 
       while (k<size) {
        
        System.out.print(symb);
        k++;
       }
       System.out.println();
       System.out.println();
       
    }
}
