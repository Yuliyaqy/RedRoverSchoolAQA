package Homework;

public class Task4 {

  public static void main(String[] args) {

    /* Задача №1
    Необходимо вывести числа от 0 до 15.
     */
    System.out.println("\nЗадача №1\n");

    for (int a = 0; a < 15; a++){
      System.out.println(a);
    }

    /* Задача №2
    Необходимо вывести все положительные степени числа 5 до тех пор, пока результат возведения в
    степень меньше 100000, вывести результат возведения в степень.
     */
    System.out.println("\nЗадача №2\n");

    System.out.println("1 Вариант\n");
    int limit = 100000;
    int base =5;

    for (int result = 1, power = 0; result < limit; result = result * base) {
      System.out.println(base + "^" + power + "=" + result);
      power++;
    }

    System.out.println("\n2 Вариант\n"); // С помощью цикла "for"

    for (int x = 5, y = 1; Math.pow(x, y) < 100000 && y > 0; y++){
      System.out.println(Math.pow(x, y));
    }

    System.out.println("\n3 Вариант\n"); // С помощью цикла "while"
    int x1 = 5;
    int y1 = 1;
    while (Math.pow(x1, y1) < 100000 && y1 > 0) {
      System.out.println(Math.pow(x1, y1));
      y1++;
    }

    System.out.println("\n4 Вариант\n"); // С помощью цикла "do while"
    int limit2 = 100000;
    int base2 = 5;

    int power2 = 0, result2 = 1;
    do {
      System.out.println(base2 + "^" + power2 + "=" + result2);
      power2++;
      result2 = result2 * base2;
    } while (result2 < limit2);

    System.out.println("\n5 Вариант\n"); // С помощью цикла "do while"

    int limit3 = 100000;
    int base3 = 5;

    int power3 = 0, result3 = 1;
    while (true){
      if (result3 >= limit3){
        break;
      }
      System.out.println(base3 + "^" + power3 + "=" + result3);
      power3++;
      result3 = result3 * base3;
    }
    System.out.println("Done!");

    /* Задача №3
    Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
    Реализовать 2 варианта:
    - использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
    - без использования конструкции if (шаг цикла на ваше усмотрение).
     */
    System.out.println("\nЗадача №3\n");

    System.out.println("1 Вариант\n");

    for (int b = 40; b <= 60; b++) {
      if ((b % 4) == 0) {
        System.out.println(b);
      }
    }

    System.out.println("\n2 Вариант\n");

    for (int b = 40; b <= 60; b = b + 4) {
        System.out.println(b);
    }

  }

}
