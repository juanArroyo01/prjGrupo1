package marlonchimarro;

public class forMarlonM {
    public void impresionforM(){
        System.out.println("forMarlonM");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==1||j==5||(i+j==6 & i<=3)||(i==j & i<=2)){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
