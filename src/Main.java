public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        //task 1
        System.out.println("task 1");
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
    }

    //task 2
    public static void task2() {
        System.out.println("task 2");
        for (int numberBack = 10; numberBack >= 1; numberBack--) {
            System.out.println(numberBack);
        }

        //task 3
        System.out.println("task 3");
        for (int evenNumber = 0; evenNumber <= 17; evenNumber = evenNumber + 2) {
            System.out.println(evenNumber);
        }
        //task 4
        System.out.println("task 4");
        for (int numberBackAgain = 10; numberBackAgain >= -10; numberBackAgain--) {
            System.out.println(numberBackAgain);
        }
        //task 5
        System.out.println("task 5");
        for (int bissextileYear = 1904; bissextileYear <= 2096; bissextileYear = bissextileYear + 4) {
            System.out.println(bissextileYear + " год является високосным");
        }
        //task 6
        System.out.println("task 6");
        for (int sequence = 7; sequence <= 98; sequence = sequence + 7) {
            System.out.println(sequence);
        }
        //task 7
        System.out.println("task 7");
        for (int multiplication = 1; multiplication <= 512; multiplication = multiplication * 2) {
            System.out.println(multiplication);
        }
        //task 8
        System.out.println("task 8");
        int amount = 29000;
        int savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings = savings + amount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }
        //task 9
        System.out.println("task 9");
        int amount2 = 29000;
        int savings2 = 0;
        for (int i = 1; i <= 12; i++) {
            savings2 = savings2 + savings2 / 100;
            savings2 = savings2 + amount2;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings2 + " рублей");
        }
        //task 10
        System.out.println("task 10");
        for (int multiplicationTable = 1; multiplicationTable <= 10; multiplicationTable++) {
            System.out.println(multiplicationTable * 2);
        }
    }
}