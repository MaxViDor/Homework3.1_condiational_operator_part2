public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();

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
}