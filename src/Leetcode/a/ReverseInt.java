package Leetcode.a;
/*Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range:
 [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 */
class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(1563847412));
    }

    public static int reverse(int x) {
        int length = String.valueOf(Math.abs(x)).length(); // узнаём длину числа
        double result = 0; // создаём запасной результат, для того чтобы не выйти за пределы инта
        int result1 = 0; // задаём значение переменной результат
        int z = 1; // создаём переменную для возведения остатка на необходимый порядок
        for (int i2 = 1; i2 < length; i2++) {
            z *= 10;
        } // подгоняем значение порядка под наше число
        for (int i = 0; i < length; i++) {
            double y = x % 10; // узнаём остаток от деления
            y *= z; // поднимаем остаток на необходимый порядок
            x = x / 10; // сокращаем число, чтобы перейти к сл цифре
            if (result + y < -2147483648 || result + y > 2147483647) { //проверяем, не вышли ли мы за пределы
                return 0;
            }
            result1 += y; // добовляем полученное к результату
            result += y; // добовляем полученное к результату
            z /= 10; // переходим к сл порядку
        }
        return result1;
    }
}