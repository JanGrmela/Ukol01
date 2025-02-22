//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package ukol1;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.time.Month.APRIL;

public class Main { //
    String name = "Jan";
    String surname = "Grmela";
    String city = "Ostrava";
    String SPZ = "SPZ";
    static int contract = 25;
    double fuel = 6.25;
    static int weightofCarrot = 1543;
    LocalDate datum = LocalDate.of(2016, APRIL, 15);

    public static void ukol10() {
        double averageCarrotPerContract = weightofCarrot / contract;
        System.out.println("Průměr na smlouvu =" + averageCarrotPerContract);
    }
    public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }
    public static void ukol3() {
        String pocetLekci = String.valueOf(10);
        System.out.println(pocetLekci);
    }
    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }
    public static void ukol5() {
        BigDecimal cena = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++)
            cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }
    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }
    public static void ukol7() {
        String vykonMotoru = "120";
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }
    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+velikostKosile);
    }
    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }
    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol10();
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }

}