package Dz0202;

import javax.sound.midi.MidiChannel;
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
    public static boolean NameOfMonths(String[] args, String nameMonths){return false;}
    private static boolean isMonthExist(Months[] months, String nameMonth) {return false;}


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
                            else {
                                System.out.println("назва пори року" + nameOfSeasons.toString() + "does not exist");
                            }
                            case "3" -> {
                                for (int i = 0; i < months.length; i++ ){
                                    int index = months[i].getDays();
                                    if(index % 2 == 0){
                                        System.out.println(months[i]);
                                    }
                                }
                            }
                            case "4" -> {
                                for (int i = 0; i < months.length; i++ ){
                                    int index = months[i].getDays();
                                    if(index % 2 == 1){
                                        System.out.println(months[i]);
                                    }
                                    case "5" -> {
                                        scanner = new Scanner(System.in);
                                        System.out.println("Введіть місяць: ");
                                        String nameMonth = scanner.next();
                                        if (isMonthExist(months, nameMonth)){
                                            Months monthss = Months.valueOf(nameMonth);
                                            int index = monthss.ordinal();
                                            if (index == months.length - 1){
                                                System.out.println(months[0]);
                                            }else {
                                                System.out.println(months[index + 1]);
                                            }
                                        }else {
                                            System.out.println("Місяць не знайдено");
                                        }
                                    }
                                    case "6" -> {
                                        scanner = new Scanner(System.in);
                                        System.out.println("Введіть місяць: ");
                                        String nameMonths = scanner.next();
                                        if (isMonthExist(months, nameMonths)){
                                            Months monthss2 = Months.valueOf(nameMonths);
                                           int index = monthss2.ordinal();
                                            if (index == 0){
                                                System.out.println(months[11]);
                                            }else {
                                                System.out.println(months[index - 1]);
                                            }
                                        }else {
                                            System.out.println("Місяць не знайдений");
                                        }
                                    }

                                }
                            }


                        }
                            }
                        }
                    }
                }
            }


}
