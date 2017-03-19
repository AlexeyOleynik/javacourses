import java.util.Scanner;

/**
 * Created by Alex on 19.03.2017.
 */
public class SwapVariablesTemporary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите переменную а... ");
        int a = sc.nextInt();
        System.out.println("Переменная а = " + a);
        System.out.println("Введите переменную b... ");
        int b = sc.nextInt();
        System.out.println("Переменная b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Теперь переменная а = " + a);
        System.out.println("Теперь переменная b = " + b);

    }
}
