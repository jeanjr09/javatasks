import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int[] fibonacci = { 0, 1 }; // Inicializa a sequência de Fibonacci com os valores 0 e 1

        while (fibonacci[fibonacci.length - 1] < num) { // Enquanto o último valor da sequência for menor que o número
                                                        // informado pelo usuário
            int nextFibonacci = fibonacci[fibonacci.length - 1] + fibonacci[fibonacci.length - 2]; // Calcula o próximo
                                                                                                   // valor da sequência
            fibonacci = Arrays.copyOf(fibonacci, fibonacci.length + 1); // Expande o array fibonacci
            fibonacci[fibonacci.length - 1] = nextFibonacci; // Adiciona o próximo valor à sequência
        }

        if (Arrays.asList(fibonacci).contains(num)) { // Verifica se o número informado pertence à sequência de
                                                      // Fibonacci
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
