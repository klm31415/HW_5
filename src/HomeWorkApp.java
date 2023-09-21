import java.util.ArrayList;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(trueFalse(3,7));
        howNumber(5);
        System.out.println(howNumberBool(5));
        repeater("строка", 5);
        System.out.println(LeapYear(2023));

    }
    //2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //3
    public static void checkSumSign(){
        int a = 3;
        int b = 5;
        if(a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    //4
    public static void printColor() {
        int value = 7;
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    //5
    public static void compareNumbers() {
        int a = 3;
        int b = 7;
        if(a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //6
    public static boolean trueFalse (int a, int b){
        boolean check = false;
        int sum = a + b;
        if(sum >= 10 && sum <= 20) {
            check = true;
        }
        return check;
    }

    //7
    public static void howNumber (int a) {
        if(a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число jnhbwfntkmyjt");
        }
    }

    //8
    public static boolean howNumberBool (int a) {
        boolean b = true;
        if(a > 0){
            b = false;
        }
        return b;
    }

    //9
    public static void repeater (String a, int b){
        for (int i = 0; i < b; i++) {
              System.out.println(a);
        }
    }

    //10
    public static boolean LeapYear(int year) {
        boolean b = false;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            b = true;
        }
        return b;
    }
}