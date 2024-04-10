
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }


        System.out.println("Задание 2");
        int temperature = 16;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + "гадусов, нужно надеть шапку");
        }


        System.out.println("Задание 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }


        System.out.println("Задание 4");
        int age1 = 32;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в садик");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить у университет");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }


        System.out.println("Задание 5");
        int ageChild = 16;
        if (ageChild < 5) {
            System.out.print("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задание 6");
        int passengers = 123;
        if (passengers <= 60) {
            System.out.println("В вагоне " + passengers + " пассажиров. Мест достаточно, можно занять сидячее место");
        } else {
            if (passengers > 60 && passengers <= 102) {
                System.out.println("В вагоне " + passengers + " пассажиров. Мест достаточно, можно занять стоячее место");
            } else {
                System.out.println("Места в вагоне закончились. Посадка в другой вагон");

            }
        }
        System.out.println("Задание 7");
        int one = 45;
        int two = 0;
        int three = 87;
        boolean oneIsBiggest = one > two && one > three;
        boolean twoIsBiggest = two > one && two > three;

        if (oneIsBiggest) {
            System.out.println("Число " + one + " - наибольшее из всех");
        } else if (twoIsBiggest) {
            System.out.println("Число " + two + " - наибольшее из всех");
        } else {
            System.out.println("Число " + three + " - наибольшее из всех");

        }
    }
}