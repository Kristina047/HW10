public class Main {
    public static void main(String[] args) {
        {
            int year = 1584;
            printLeapYear(year);

            int clietnOs = 0;
            int clientDeviceYear = 2000;
            findOutYear(clietnOs, clientDeviceYear);

            int deliveryDistance = 70;
            int days = distanceTime(deliveryDistance);
            if (days > 0) {
                System.out.println("Потребуется дней: " + days + " срок доставки.");
            } else {
                System.out.println("Доставки нет.");
            }
        }
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
    }


    /// Задание 3
    public static int distanceTime(int km) {
        if (km <= 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km < 100) {
            return 3;
        } else {
            return 0;
        }
    }
}





