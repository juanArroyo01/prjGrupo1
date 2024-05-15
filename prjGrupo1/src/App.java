import java.util.Scanner;

import juanarroyo.WhileArroyo;
import juanarroyo.DoWhileArroyo;
import juanarroyo.DoWhileJuan;
import juanarroyo.DoWhileJuanArroyo;
import juanarroyo.ForArroyo;
import juanarroyo.ForJuan;
import juanarroyo.ForJuanArroyo;
import juanarroyo.WhileJuan;
import juanarroyo.WhileJuanArroyo;

import marlonchimarro.forChimarroC;
import marlonchimarro.doWhileChimarroC;
import marlonchimarro.doWhileMarlonM;
import marlonchimarro.whileChimarroC;
import marlonchimarro.whileMarlonM;
import marlonchimarro.whileMarlonChimarroMC;
import marlonchimarro.doWhileMarlonChimarroMC;
import marlonchimarro.forMarlonM;
import marlonchimarro.forMarlonChimarroMC;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        /*
         * ForJuan fj = new ForJuan();
         * ForArroyo fa = new ForArroyo();
         * ForJuanArroyo fja = new ForJuanArroyo();
         * WhileJuan wj = new WhileJuan();
         * WhileArroyo wa = new WhileArroyo();
         * WhileJuanArroyo wja = new WhileJuanArroyo();
         * DoWhileJuan dwj = new DoWhileJuan();
         * DoWhileArroyo dwa = new DoWhileArroyo();
         * DoWhileJuanArroyo dwja = new DoWhileJuanArroyo();
         */


        /*
         * whileMarlonM wm = new whileMarlonM();
         * whileChimarroC wc = new whileChimarroC();
         * whileMarlonChimarroMC wmc = new whileMarlonChimarroMC();
         * doWhileMarlonM dwm = new doWhileMarlonM();
         * doWhileChimarroC dwc = new doWhileChimarroC();
         * doWhileMarlonChimarroMC dwmc = new doWhileMarlonChimarroMC();
         * forMarlonM fm = new forMarlonM();
         * forChimarroC fc = new forChimarroC();
         * forMarlonChimarroMC fmc = new forMarlonChimarroMC();
         */
       
       /*  DoWhileCasaC dwcc= new DoWhileCasaC ();
        DoWhileStalinS dws = new DoWhileStalinS();
        DoWhileStalinCasaSC dwsc = new DoWhileStalinCasaSC();
        WhileCasaC wcc= new WhileCasaC();
        WhileStalinS ws = new WhileStalinS();
        WhileStalinCasaSC wsc = new WhileStalinCasaSC();
        ForCasaC fcc= new ForCasaC();
        ForStalinS fcs= new ForStalinS();
        ForStalinCasaSC Fcsc = new ForStalinCasaSC();  
        */   
        
         /*
         * ForJuan ja = new ForJuan();
         * 
         * De esta forma se crea el objeto clase.
         * 
         * Para llamar al metodo de aquella clase es:
         * ja.forNombre(parametro 1, parametro 2);
         * 
         * Y de esa forma ya se ejecuta el codigo ingresdo dentro de aquel metodo.
         */

        char symb;
        String auxString;
        int size = 0;
        boolean isCorrect = false;

        System.out.println("\n--> Taller 1 <--\n");

        while (true) {
            System.out.print("-> Ingrese un tamaño definido mayor a 4: ");
            auxString = keyboard.nextLine();

            for (int i = 0; i < auxString.length(); i++) {
                if (!Character.isDigit(auxString.charAt(i))) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
            }

            if (isCorrect) {
                size = Integer.valueOf(auxString);
                if (size <= 4) {
                    System.out.println("\nHa ingresado un bajo del limite, ingrese nuevamente...\n");
                } else {
                    break;
                }
            } else {
                System.out.println("\nHa ingresado un valor no numérico, ingrese nuevamente...\n");
                size = -1;
            }
        }

        isCorrect = false;

        do {
            System.out.print("\n-> Ingrese un caracter: ");
            auxString = keyboard.nextLine();
            if (!auxString.isEmpty()) {
                symb = auxString.charAt(0);
                isCorrect = true;
            } else {
                System.out.println("\nHa ingresado un valor vacío, ingrese nuevamente...\n");
                symb = ' ';
                isCorrect = false;
            }
        } while (!isCorrect);

        /*
         * Al crear su clase objeto y haber implementado, acontinuacion deben realizar:
         * ja.forNombre(size, symb);
         * 
         * Y se imprimira su letra
         */

        /*
         * System.out.println("For - Juan Arroyo");
         * fj.forNombreJ(size, symb);
         * System.out.println("\n");
         * fa.forApellidoA(size, symb);
         * System.out.println("\n");
         * fja.forNombreApellidoJA(size, symb);
         * System.out.println("\n\nWhile - Juan Arroyo");
         * wj.whileNombreJ(size, symb);
         * System.out.println("\n");
         * wa.whileApellidoA(size, symb);
         * System.out.println("\n");
         * wja.whileNombreApellidoJA(size, symb);
         * System.out.println("\n\nDo While - Juan Arroyo");
         * dwj.doWhileNombreJ(size, symb);
         * System.out.println("\n");
         * dwa.doWhileApellido(size, symb);
         * System.out.println("\n");
         * dwja.doWhileNombreApellidoJA(size, symb);
         */

         /*
         * System.out.println("For - MarlonChimarroMC");
         * fm.formarlonm(size, symb);
         * System.out.println("\n");
         * fc.forchimarroc(size, symb);
         * System.out.println("\n");
         * fmc.formarlonchimarromc(size, symb);
         * System.out.println("\n\nWhile - MarlonChimarroMC");
         * wm.whilemarlonm(size, symb);
         * System.out.println("\n");
         * wc.whilechimarroc(size, symb);
         * System.out.println("\n");
         * wmc.whilemarlonchimarromc(size, symb);
         * System.out.println("Do While - MarlonChimarroMC");
         * dwm.dowhilemarlonm(size, symb);
         * System.out.println("\n");
         * dwc.dowhilechimarroc(size, symb);
         * System.out.println("\n");
         * dwmc.dowhilemarlonchimarromc(size, symb); 
         */
       
       /*   System.out.println("For-StalinCasaSC");
        fcs.forNombreS(size,symb);
        System.out.println("\n");
        fcc.forApellidoC(size, symb);
        System.out.println("\n");
        Fcsc.imprimirIniciales(size,symb);
        System.out.println("\n\nWhile - StalinCasa");
        ws.whileNombreS(size, symb);
        System.out.println("\n");
        wcc.whileApellidoC(size, symb);
        System.out.println("\n");
        wsc.whileNombreApellido(size,symb);
        System.out.println("\n\nDo While - StalinCasa");
        dws.imprimirDoWhileS(size,symb);
        System.out.println("\n");
        dwcc.doWhileApellidoC (size,symb);
        System.out.println("\n");
        dwsc.doWhileNomApeliSC(size,symb);
        */

        


        keyboard.close();
    }
}
