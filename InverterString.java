import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String string = scanner.nextLine();
        String stringInvertida = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            stringInvertida += string.charAt(i);
        }

        System.out.println("String original: " + string);
        System.out.println("String invertida: " + stringInvertida);
    }
}
