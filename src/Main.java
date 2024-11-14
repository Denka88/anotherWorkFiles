import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Zakaz> baza = new ArrayList<>();
        baza.add(new Zakaz("Первый", "Петр", "Петрович", "+7(912)253-54-13", "Чай"));
        baza.add(new Zakaz("Второй", "Петр", "Петрович", "+7(954)844-66-65", "Хлеб"));
        baza.add(new Zakaz("Третий", "Петр", "Петрович", "+7(964)274-54-34", "Кофе"));
        baza.add(new Zakaz("Четвертый", "Петр", "Петрович", "+7(976)346-77-22", "Молоко"));
        Scanner scan = new Scanner(System.in);

        byte menu;
        do {
            menu = scan.nextByte();
            switch (menu) {
                case (1): System.out.println("1"); break;
                case (2): for(Zakaz zakaz : baza) System.out.println(zakaz.toString()); break;
                case (3): System.out.println("3"); break;
                case (4): System.out.println("4"); break;
                case (5): System.out.println("Досвидания"); break;
            }

        }while (menu != 5);



    }
}