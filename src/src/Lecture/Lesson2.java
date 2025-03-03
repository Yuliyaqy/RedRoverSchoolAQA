package Lecture;

public class Lesson2 {

  public static void main(String[] args) {

    // Задание 1
    int regular = 50;
    int doppel = 20;
    int archers = 25;
    int lieutenant = 2;
    int capitan = 1;

    int baseSalary = 4;

    int summa = regular * baseSalary +
        (doppel + archers) * baseSalary * 2 +
        lieutenant * baseSalary * 10 +
        capitan * baseSalary * 100;

    System.out.println("Задание 1:\n" + summa);

    // Задание 2
    int oranges = 11;
    double half = oranges / 2.0;
    int remainder = oranges % 2;
    // % означает взять остаток от целочисленного деления!

    double testResult = half * 2;

    System.out.println("Задание 2:\n" + half);
    System.out.println("Проверка деления: " + testResult);
    System.out.println("Остаток от деления: " + remainder);
  }

}
