package Homework;

public class Task2 {

  public static void main(String[] args) {

    /* Задача №1
    Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным
    на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение,
    вычитание, деление и остаток от деления. Также сделать проверку на четность этих переменных и
    вывести результат.
     */

    int a = 45;
    int b = 30;

    System.out.println("\nЗадача №1\n");
    System.out.println("Сложение: " + (a + b));
    System.out.println("Умножение: " + (a * b));
    System.out.println("Вычитание: " + (a - b));
    System.out.println("Деление: " + (a / b));
    System.out.println("Деление дробное: " + (a * 1.0 / b));
    System.out.println("Остаток от деления: " + (a % b));

    System.out.println("Остаток от деления а на 2 = " + (a % 2));
    System.out.println("Остаток от деления b на 2 = " + (b % 2));

    // Если остаток от деления на 2 будет ноль, то число является четным, если один, то нечетным

    // Второй способ проверки четности числа:
    System.out.println("Четное ли число a ? " + ((a % 2) == 0));
    System.out.println("Четное ли число b ? " + ((b % 2) == 0));

    /* Задача №2
    Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения, а потом
    поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот).
     */

    int c = 10;
    int d = 15;

    // 1 способ:
    int temp = c;
    c = d;
    d = temp;

    /* 2 способ:
    c = c + d; // c = 25, d = 15
    d = c - d; // c = 25, d = 10
    c = c - d; // c = 15, d = 10
     */

    System.out.println("\nЗадача №2\n");
    System.out.println("Переменная с равна " + c);
    System.out.println("Переменная d равна " + d);


    /* Задача №3
    Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу
    корабля, половина оставшегося — капитану, остальное делится поровну между всеми членами команды,
    включая капитана.

    Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

    Вывести на экран кому сколько пиастров полагается
    Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит
    ему?

    Дополнительное задание со звездочкой
    Попробовать придумать как программа может проверить правильность дележа.
     */

    int sumPiastre = 2599;
    int pirates = 37;
    //-----------------------------
    int remainder = sumPiastre;

    int awardOwner = sumPiastre / 2;
    remainder = remainder - awardOwner;

    int awardCaptain = remainder / 2;
    remainder = remainder - awardCaptain;

    int awardPirates = remainder / (pirates + 1);
    remainder = remainder % (pirates + 1);

    // awardCaptain = awardCaptain + awardPirates;
    awardCaptain += awardPirates;

    System.out.println("\nЗадача №3\n");
    System.out.println("Вознаграждение владельцу корабля: " + awardOwner);
    System.out.println("Вознаграждение капитану корабля: " + awardCaptain);
    System.out.println("Вознаграждение каждого пирата: " + awardPirates);
    System.out.println("Остаток: " + remainder);

    System.out.println("Вознаграждение собственника-капитана корабля Джека Воробья: " + (awardOwner + awardCaptain));

    int testResult = awardOwner + awardCaptain + awardPirates * pirates + remainder;
    System.out.println("Проверка вычислений: " + testResult);
  }

}
