package Lecture;

public class Lesson4_1 {

  public static void main(String[] args) {

    boolean result1 = 1 > 2;
    System.out.println(result1);

    // --------------------------------------

    int a = 11;
    boolean isEven = (a % 2) == 0;
    int result = 0;

    System.out.println(result);
    if (isEven) {
      result = a * 3;
    } else {
      result = a * 2;
    }
    System.out.println(result);

    // то же самое только без объявления переменных ->

    if ((a % 2) == 0) {
      System.out.println(a * 3);
    } else {
      System.out.println(a * 2);
    }

    // -----------------------------

    if (a < 0) {
      System.out.println("Negative");
    } else {
      if (a < 10) {
        System.out.println("A single digit");
      } else {
        System.out.println("Greater or equal to 10");
      }
    }

    // то же самое, только "else if" указывается вместе

    if (a < 0) {
      System.out.println("Negative");
    } else if (a < 10) {
      System.out.println("A single digit");
    } else {
      System.out.println("Greater or equal to 10");
    }

    // можно еще указывать вот так

    if (a < 0) {
      System.out.println("Negative");
    } else if (a < 10) {
      System.out.println("A single digit");
    } else if (a < 20) {
      System.out.println("A between 10 and 19");
    } else {
      System.out.println("Greater or equal to 20");
    }

    // то же самое, только с if используются логические операторы (&&, ||)

    if (a < 0) {
      System.out.println("Negative");
    }
    if (a >= 0 && a < 10) {
      System.out.println("A single digit");
    }
    if (a >= 10 && a < 20) {
      System.out.println("A between 10 and 19");
    }
    if (a >= 20) {
      System.out.println("Greater or equal to 20");
    }

    // -------------- Тема: Циклы

    int sum = 0;

    int i = 0;
    sum = sum + i;

    i = i + 1;
    sum = sum + i;

    i = i + 1;
    sum = sum + i;

    i = i + 1;
    sum = sum + i;

    System.out.println(sum);

    // то же самое, но с циклом for

    int sum2 = 0;
    for (int j = 0; j <= 3; j = j + 1) {
      sum2 = sum2 + j;
    }
    System.out.println(sum2);

    // -------------------------------

    int sum3 = 0;
    for (int k = 0; k >= -10; k = k -1) {
      sum3 = sum3 + k;
      if (sum3 < -15) {
        break;
      }
    }
    System.out.println(sum3);

    // Это выражение можно записать по другому:
    // (????????? ответ не сходится с предыдущим примером ???????)

    int sum4 = 0;
    for (int n = 0; n >= -10 || sum4 < -15; n = n - 1) {
      sum4 = sum4 + n;
    }
    System.out.println(sum4);

    // ------------------------------------------

    int sum5 = 0;
    for (int l = 0; l < 10; l = l + 1) {
      sum5 = sum5 + l;
      if (sum5 % 2 == 0) {
        System.out.println(sum5);
      }
    }
    System.out.println(sum5);

    // -----------------------------------------

    int sum6 = 0;
    for (int l = 0; l <= 10; l = l + 1) {
      sum6 = sum6 + l;
      if (l % 2 == 0) {
        continue;
      } else {
        sum6 = sum6 + l;
      }
    }
    System.out.println(sum6);

    // Оператор "continue" просто переходит к следующему циклу!!!

    // то же самой, только без "continue"

    int sum7 = 0;
    for (int l = 0; l <= 10; l = l + 1) {
      sum7 = sum7 + l;
      if (l % 2 != 0) {
         sum7 = sum7 + l;
      }
    }
    System.out.println(sum7);

  }
}
