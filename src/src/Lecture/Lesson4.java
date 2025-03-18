package Lecture;

import java.util.Random;

public class Lesson4 {

  static Random random = new Random();

  public static void main(String[] args) {

    // Булевые значения

    boolean itMoves = false;
    boolean itShouldMove = true;

    if (itMoves == itShouldMove){   // (itMoves && itShouldMove || !itMoves && !itShouldMove)
      System.out.println("No problem!");
    } else if (!itMoves){
      System.out.println("Use WD-40!");
    } else {
      System.out.println("Use duct tape!");
    }

    // Циклы
    // While: выполнится только в случае, если выражение равно true

    int a = 5;
    while (a > 1){
      System.out.println("a > 1: " + a);
      a = a - 1;
    }
    System.out.println("Done!");

    // do-while: первый раз выполнится в любом случае, даже если выражение false

    int b = 5;
    do {
      System.out.println("\nb = " + b);
    } while (b < 4);
    System.out.println("Done!");

    //---------------------------------------------------------------

    int summa = 0;
    do {
      int kubik1 = random.nextInt(6) + 1;
      int kubik2 = random.nextInt(6) + 1;
      System.out.println("Threw: " + kubik1 + " and " + kubik2);
      summa = kubik1 + kubik2;
    } while (summa != 7);
    System.out.println("Done!");

    //----------------------------------------------------------------

    int i = 0;
    while (i < 10){
      System.out.println(i);
      i++; // i += 1; // i = i + 1;
    }
    System.out.println("Done!");

    //------------------------------------------- эти два примера равны!!!!!

    for (int j = 0; j < 10; j++){
      System.out.println(j);
    }
    System.out.println("Done!");

    //-----------------------------------------------

    for (int j = 0; j < 10; j++){
      System.out.println(j);
    }

    for (int n = 10; n > 0; n = n - 3){
      System.out.println(n);
    }

    for (String x = "p"; x.length() < 10; x = x + "."){
      System.out.println(x);
    }

//    int x = 0;
//    for (; x < 10;) {
//      System.out.println(x);
//      i = i + 1;
//    }

    boolean leftToRight = true;
    for (int y = 0; y < 10; y++) {
      if (leftToRight) {
        for (int z = 0; z < 5; z++) {
          System.out.print(z);
        }
      } else {
        for (int z = 5; z > 0; z--) {
          System.out.print(z);
        }
      }
      leftToRight = !leftToRight;
      System.out.println();

    }

    System.out.println("Done!");

  }
}
