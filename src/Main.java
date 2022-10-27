public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int age = 13;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        //Задание 2
        System.out.println("Задание 2");
        age = 15;
        if (age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (age < 14) {
            System.out.print("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься на аттракционе");
        }

        //Задание 3
        System.out.println("Задание 3");
        int one = 4;
        int two = -5;
        int three = 101;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число" + one);
            } else {
                System.out.println("Максимальное число" + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число" + two);
            } else {
                System.out.println("Максимальное число" + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число" + one);
            } else if (three > one) {
                System.out.println("Максимальное число" + three);
            } else {
                System.out.println(" Все 3 числа равны");
            }
        }
    }
}
