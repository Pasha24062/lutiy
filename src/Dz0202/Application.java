package Dz0202;

import java.util.Scanner;

public class Application {
    public static void menu() {
        System.out.println("=================================");
        System.out.println("Натиcніть 1, щоб перевірити чи такий місяць існує");
        System.out.println("Натиcніть 2, щоб вивести всі місяці з такой ж порою року");
        System.out.println("Натиcніть 3, щоб вивести всі місяці які мають меншу кулькість днів");
        System.out.println("Натисніть 4, щоб вивести  всі місяці, які мають більшу кількість днів");
        System.out.println("Натисніть 5, щоб вивести на екран наступну пору року");
        System.out.println("Натисніть 6, щоб вивести на екран попередню пору року");
        System.out.println("Натисніть 7, щоб вивести на екран всі місяці, які мають парну кількість дніввивести на екран всі місяці, які мають парну кількість днів");
        System.out.println("Натисніть 8, щоб вивести на екран всі місяці, які мають непарну кількість днів ");
        System.out.println("Натисніть 8, щоб вивести на екран, чи введений з консолі місяць має парну кількість днів ");
        System.out.println("=================================");
    }

    private static boolean isMonthsExist(Months[] months, String nameOfMonths) {
        return false;
    }

    private static boolean isSeasonsExist(Seasons[] seasons, Object nameOfSeasons) {
        return false;
    }

    public static void main(String[] args) {
        private boolean isMonthsExist ();
        Months[] months = Months.values();
        Seasons[] seasons = Seasons.values();
        Scanner scannerBasic = new Scanner(System.in);

        while (true) {
            menu();
            String menuCode = scannerBasic.next();
            switch (menuCode) {
                case "1" -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введіть місяць");
                    String nameOfMonths = scanner.next();
                    if (isMonthsExist(months, nameOfMonths)) {
                        System.out.println("Назва місяця" + nameOfMonths.toUpperCase() + "is exist");
                    } else {
                        System.out.println("Назва місяця" + nameOfMonths.toUpperCase() + "does not exist");
                    }
                }
                case "2" -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введіть пору року");
                    String NameOfSeasons = scanner.next();
                    Object nameOfSeasons;
                    nameOfSeasons = null;
                    if (isSeasonsExist(seasons, nameOfSeasons)) {
                       for (Months c : months);{
                           if (c.getSeasons().name().equaIsIgnoreCase(nameOfSeasons)){
                               System.out.println(c);
                               

                           }
                        }
                    }
                }
            }
        }
    }
}
