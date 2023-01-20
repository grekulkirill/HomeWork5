public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");

        char clientOS = '0';

        if (clientOS == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == '1') {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");

          int clientDeviceYear = 2014;

        if (clientOS == '0' && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == '1' && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (clientOS == '0' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == '1' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3");

        int year=2021;

        if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ) {
            System.out.println( year + " високосный");
        }
        else {
            System.out.println( year + " не високосный");
        }

        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryDay=1;

        if (deliveryDistance<20) {deliveryDay = deliveryDay;
            System.out.println("Потребуется дней: " + deliveryDay);
        }

        if (deliveryDistance >= 20 && deliveryDistance < 60) {deliveryDay = deliveryDay + 1;
                System.out.println("Потребуется дней: " + deliveryDay);
        }

        if (deliveryDistance >= 60 && deliveryDistance < 100) {deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }

        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("весенний сезон");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("летний сезон");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("осенний сезон");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("зимний сезон");
                break;

            default:
                System.out.println("такого месяца не существует");
        }

    }
}