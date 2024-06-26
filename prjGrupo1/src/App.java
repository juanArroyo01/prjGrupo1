import java.util.Scanner;

import marlonchimarro.*;
import JakeBenavides.*;
import antonelacasa.*;
import juanarroyo.*;
import niurkayupanqui.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        ForCasa fca = new ForCasa();
        ForAntonela fan = new ForAntonela();
        ForAntonelaCasa fac = new ForAntonelaCasa();
        WhileCasa wca = new WhileCasa();
        WhileAntonela wan = new WhileAntonela();
        WhileAntonelaCasa wac = new WhileAntonelaCasa();
        DoWhileCasa dwca = new DoWhileCasa();
        DoWhileAntonela dwan = new DoWhileAntonela();
        DoWhileAntonelaCasa dwac = new DoWhileAntonelaCasa();

        ForJuan fj = new ForJuan();
        ForArroyo fa = new ForArroyo();
        ForJuanArroyo fja = new ForJuanArroyo();
        WhileJuan wj = new WhileJuan();
        WhileArroyo wa = new WhileArroyo();
        WhileJuanArroyo wja = new WhileJuanArroyo();
        DoWhileJuan dwj = new DoWhileJuan();
        DoWhileArroyo dwa = new DoWhileArroyo();
        DoWhileJuanArroyo dwja = new DoWhileJuanArroyo();

        whileMarlonM wm = new whileMarlonM();
        whileChimarroC wc = new whileChimarroC();
        whileMarlonChimarroMC wmc = new whileMarlonChimarroMC();
        doWhileMarlonM dwm = new doWhileMarlonM();
        doWhileChimarroC dwc = new doWhileChimarroC();
        doWhileMarlonChimarroMC dwmc = new doWhileMarlonChimarroMC();
        forMarlonM fm = new forMarlonM();
        forChimarroC fc = new forChimarroC();
        forMarlonChimarroMC fmc = new forMarlonChimarroMC();

        DoWhileCasaC dwcc = new DoWhileCasaC();
        DoWhileStalinS dws = new DoWhileStalinS();
        DoWhileStalinCasaSC dwsc = new DoWhileStalinCasaSC();
        WhileCasaC wcc = new WhileCasaC();
        WhileStalinS ws = new WhileStalinS();
        WhileStalinCasaSC wsc = new WhileStalinCasaSC();
        ForCasaC fcc = new ForCasaC();
        ForStalinS fcs = new ForStalinS();
        ForStalinCasaSC Fcsc = new ForStalinCasaSC();

        ForJakeJ fjj = new ForJakeJ();
        ForBenavides fb = new ForBenavides();
        ForJakeBenavides fbj = new ForJakeBenavides();
        WhileJake wjj = new WhileJake();
        WhileBenavides wb = new WhileBenavides();
        WhileJakeBenavides wjb = new WhileJakeBenavides();
        DoWhileJake dwjj = new DoWhileJake();
        DoWhileBenavides dwb = new DoWhileBenavides();
        DoWhileJakeBenavides dwjb = new DoWhileJakeBenavides();

        ForNiurka fn = new ForNiurka();
        ForYupanqui fy = new ForYupanqui();
        ForNiurkaYupanqui fny = new ForNiurkaYupanqui();
        WhileN wn = new WhileN();
        WhileY wy = new WhileY();
        WhileNY wny = new WhileNY();
        DoWhileN dwn = new DoWhileN();
        DoWhileY dwy = new DoWhileY();
        DoWhileNY dwny = new DoWhileNY();

        char symb;
        String auxString;
        int size = 0;
        boolean isCorrect = false;

        System.out.println("\n--> Taller 1 <--\n");

        do {
            System.out.print("-> Ingrese un tamaño definido mayor a 4: ");
            auxString = keyboard.nextLine();

            for (Character character : auxString.toCharArray()) {
                if (!Character.isDigit(character) || auxString.length() != 1) {
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
                System.out.println(
                        "\nHa ingresado un valor no numérico o ingreso dos o mas caracteres, ingrese nuevamente...\n");
                size = -1;
            }
        } while (!isCorrect);

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

        System.out.println("For - Juan Arroyo");
        fj.forNombreJ(size, symb);
        System.out.println("\n");
        fa.forApellidoA(size, symb);
        System.out.println("\n");
        fja.forNombreApellidoJA(size, symb);
        System.out.println("\n\nWhile - Juan Arroyo");
        wj.whileNombreJ(size, symb);
        System.out.println("\n");
        wa.whileApellidoA(size, symb);
        System.out.println("\n");
        wja.whileNombreApellidoJA(size, symb);
        System.out.println("\n\nDo While - Juan Arroyo");
        dwj.doWhileNombreJ(size, symb);
        System.out.println("\n");
        dwa.doWhileApellido(size, symb);
        System.out.println("\n");
        dwja.doWhileNombreApellidoJA(size, symb);

        System.out.println("\nFor - MarlonChimarroMC");
        fm.formarlonm(size, symb);
        System.out.println("\n");
        fc.forchimarroc(size, symb);
        System.out.println("\n");
        fmc.formarlonchimarromc(size, symb);
        System.out.println("\n\nWhile - MarlonChimarroMC");
        wm.whilemarlonm(size, symb);
        System.out.println("\n");
        wc.whilechimarroc(size, symb);
        System.out.println("\n");
        wmc.whilemarlonchimarromc(size, symb);
        System.out.println("Do While - MarlonChimarroMC");
        dwm.dowhilemarlonm(size, symb);
        System.out.println("\n");
        dwc.dowhilechimarroc(size, symb);
        System.out.println("\n");
        dwmc.dowhilemarlonchimarromc(size, symb);

        System.out.println("\nFor-StalinCasaSC");
        fcs.forNombreS(size, symb);
        System.out.println("\n");
        fcc.forApellidoC(size, symb);
        System.out.println("\n");
        Fcsc.imprimirIniciales(size, symb);
        System.out.println("\n\nWhile - StalinCasa");
        ws.whileNombreS(size, symb);
        System.out.println("\n");
        wcc.whileApellidoC(size, symb);
        System.out.println("\n");
        wsc.whileNombreApellido(size, symb);
        System.out.println("\n\nDo While - StalinCasa");
        dws.imprimirDoWhileS(size, symb);
        System.out.println("\n");
        dwcc.doWhileApellidoC(size, symb);
        System.out.println("\n");
        dwsc.doWhileNomApeliSC(size, symb);

        System.out.println("\nFor - Jake Benavides");
        fjj.forNombreJ(size, symb);
        System.out.println("\n");
        fb.ForApellidoB(size, symb);
        System.out.println("\n");
        fbj.ForNombreApellidoJB(size, symb);
        System.out.println("\n\nWhile - Jake Benavides");
        wjj.WhileNombreJ(size, symb);
        System.out.println("\n");
        wb.WhileApellidoB(size, symb);
        System.out.println("\n");
        wjb.WhileNombreApellidoJB(size, symb);
        System.out.println("\n\nDo While - Jake Benavides");
        dwjj.DoWhileNombreJ(size, symb);
        System.out.println("\n");
        dwb.DoWhileApellidoB(size, symb);
        System.out.println("\n");
        dwjb.DoWhileNombreApellidoJB(size, symb);

        System.out.println("\nFor - Antonela Casa");
        fca.forCasac(size, symb);
        System.out.println("\n");
        fan.forAntonelaA(size, symb);
        System.out.println("\n");
        fac.forAntonelaCasaAC(size, symb, symb);
        System.out.println("\n\nWhile - Antonela Casa");
        wca.whileCasaC(size, symb);
        System.out.println("\n");
        wan.whileAntonelaA(size, symb);
        System.out.println("\n");
        wac.whileAntonelaCasaAC(size, symb, symb);
        System.out.println("\n\nDo While - Antonela Casa");
        dwca.dowhileCasaC(size, symb);
        System.out.println("\n");
        dwan.dowhileAntonelaA(size, symb);
        System.out.println("\n");
        dwac.dowhileAntonelaCasaAC(size, symb, symb);

        System.out.println("\nFor - Niurka Yupanqui");
        fn.forN(size, symb);
        System.out.println("\n");
        fy.forY(size, symb);
        System.out.println("\n");
        fny.NY(size, symb);
        System.out.println("\n\nWhile - Niurka Yupanqui");
        wn.whileN(size, symb);
        System.out.println("\n");
        wy.whileY(size, symb);
        System.out.println("\n");
        wny.whileNY(size, symb);
        System.out.println("\n\nDo While - Niurka Yupanqui");
        dwn.doWhileN(size, symb);
        System.out.println("\n");
        dwy.doWhileY(size, symb);
        System.out.println("\n");
        dwny.doWhileNY(size, symb);

        keyboard.close();
    }
}
