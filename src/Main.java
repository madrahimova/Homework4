import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void call(Class cls, String methodName) throws Exception {
        cls.getDeclaredMethod(methodName).invoke(null);
    }

    public static void main(String[] args) {
        var tasksCount = 7;
        for (var i = 1; i <= tasksCount; i++) {
            try {
                call(Main.class, "task" + i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static String is18YearsOld(int age) {
        if (age < 18) {
            return "Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать";
        } else {
            return "Если возраст человека равен " + age + ", то он совершеннолетний";
        }
    }

    public static void task1() {
        System.out.println("Задача 1");

        int personAge = 16;
        System.out.println(is18YearsOld(personAge));

        personAge = 19;
        System.out.println(is18YearsOld(personAge));
    }

    private static String isCold(int temperature) {
        if (temperature < 5) {
            return "На улице " + temperature + " градусов, нужно надеть шапку";
        } else {
            return "На улице " + temperature + " градусов, можно идти без шапки";
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int temperature = -10;
        System.out.println(isCold(temperature));

        temperature = 5;
        System.out.println(isCold(temperature));
    }

    public static String isMoreThan60(int speed) {
        if (speed < 60) {
            return "Если скорость " + speed + ", то можно ездить спокойно";
        } else {
            return "Если скорость " + speed + ", то придется заплатить штраф";
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int speed = 61;
        System.out.println(isMoreThan60(speed));
        speed = 50;
        System.out.println(isMoreThan60(speed));
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] ages = new int[]{5, 14, 20, 25};
        for (int age : ages) {
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            } else if (age > 6 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else if (age > 18 && age < 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
            } else if (age > 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int[] ages = new int[]{4, 10, 16};
        for (int age : ages) {
            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            } else if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else if (age >= 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int totalPlaces = 102;
        int placesToSit = 60;
        int[] places = new int[]{10, 70, 102};
        for (int occupied : places) {
            if (occupied <= placesToSit) {
                System.out.println("Если зянято " + occupied + " мест(а), то есть сидячее место");
            } else if (occupied > placesToSit && occupied < totalPlaces) {
                System.out.println("Если зянято " + occupied + " мест(а), то есть стоячее место");
            } else {
                System.out.println("Если зянято " + occupied + " мест(а), то вагон уже полностью забит");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 2;
        int two = 1;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Число " + one + " в переменной one большее");
        } else if (two >= one && two >= three) {
            System.out.println("Число " + two + " в переменной two большее");
        } else if (three >= one && three >= two) {
            System.out.println("Число " + three + " в переменной three большее");
        }
    }
}