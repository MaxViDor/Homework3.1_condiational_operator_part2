public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        char ClientOS = 1;
        if(ClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (ClientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Ваше мобильное устройство не поддерживает мобильное приложение");

    }
    public static void task2 () {
        System.out.println("Задача 2");
        char ClientOS = 0;
        int clientDeviceYear = 2017;
        if(ClientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (ClientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }  else if(ClientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
    } else if (ClientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным ");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime;

        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 0;
        }

        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }
}