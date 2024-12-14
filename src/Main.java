public class Main {
    public static void main(String[] args) {
        int year = 1584;
        printLeapYear(year);
        int clietnOs = 0;
        int clientDeviceYear = 2000;
        findOutYear(clietnOs, clientDeviceYear);
    }

    /// Задание 1
    public static void printLeapYear(int year) {
        if (year >= 1584 && (year % 4 == 0 || year % 100 != 0 && year % 400 == 0)) {
            System.out.println(year + " является високосным годом");
        } else {
            System.out.println(year + " не является високосным годом");
        }
    }

    /// Задание 2
    public static void findOutYear(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
 ///Задание 3


    }
}



