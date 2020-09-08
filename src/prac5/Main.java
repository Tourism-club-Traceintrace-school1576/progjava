package prac5;

public class Main {
    public static void main(String[] args) {
        //razlojenieNaMnojateli(150, 2);
        String s = "papapap";
        System.out.println(isPalindrom(s, 0, s.length()-1));
    }

    public static void razlojenieNaMnojateli(int n, int k){
        // k- дополнительный параметр. При вызове должен быть равен 2 - первое простое число после 1
        // Базовый случай условие выхода из рекурсии
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            razlojenieNaMnojateli(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            razlojenieNaMnojateli(n, ++k);
        }
    }

    public static boolean isPalindrom(String s, int i, int j){
        // s - подаваемая строка i and j ндексы символов в строке
        // Базовый случай условие выхода из рекурсии
        if((i==j) || ((i+1==j)&&(s.charAt(i+1)==s.charAt(j)))) return true;
        //шаг рекурсии/рекурсивное условие
        if (s.charAt(i)==s.charAt(j)) return isPalindrom(s, i+1, j-1);
        return false;
    }

    public static int noTwoZerosNext(int a, int b, int x){
        // а колво 1 б колво нулей х текущее значение
        // базовый случай условие выхода из рекурсии
        if ((x==0) && (a==0)) return 0;
    }
}
