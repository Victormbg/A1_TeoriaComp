import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String s, a, b;

        System.out.print("\n=========CONCATENA��O=========\n\n");
        System.out.print("Informe o primeiro valor ");
        a = ler.next();

        System.out.print("Informe o segundo valor ");
        b = ler.next();

        s = a + b;
        System.out.println(s);

    }

}
