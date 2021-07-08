import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        temp();
        eval(i, j, k);
    }
    public static void eval(int i, int j, int k)
    {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k)
        {
            System.out.println("YES");
        }
        else { System.out.println("NO"); }
    }
    public static void temp() {
        ArrayList a = new ArrayList();
        ArrayList x = new ArrayList();
        for (int i = 0; i < 30000; i++)
        {
            x.add(i);
        }
        for (int i = 0; i < 10000; i++)
        {
            a.addAll(x.subList(i,i+20000));
        }
    }

}
