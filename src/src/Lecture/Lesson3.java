package Lecture;

public class Lesson3 {

  public static void main(String[] args) {
    int baseSalary = 1000;
    int h1 = 65;
    int hCount = 40;

    int payment = baseSalary + (h1 * hCount);

    /* boolean b = 1 == 2;
    System.out.println(b); */

    if (payment < 2000){
      System.out.println("Меньше минимальной з/п!");
    } else {
      System.out.println(payment);
      if (payment > 3000){
        payment = payment - (payment / 100 * 3);
      }
      System.out.println(payment);
    }

    // ------------------------------------------------

    int x = 3;
    int y = 2;

    // or
    if (x == y || x + 2 > 3){
      System.out.println("Or!");
    }

    // and
    if (x != y && x + 2 < 10){
      System.out.println("And!");
    }

    // ------------------------------

    int a = 10;
    int b = 3;

    int z = a * 2 - b;

    if (z > 20){
      System.out.println("z > 20");
    } else {
      System.out.println("z <= 20");
    }
  }
}
