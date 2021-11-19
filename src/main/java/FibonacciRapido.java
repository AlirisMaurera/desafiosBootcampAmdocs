/*
* A fórmula de Binet é uma forma de calcular números de Fibonacci.

Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.

Entrada
A entrada é um número natural n (0 < n ≤ 50).

Saída
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.
* */

import java.util.Scanner;

public class FibonacciRapido {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double x, y;
        double n = leitor.nextInt();

        x = (1 + Math.sqrt(5))/2;
        y = (1 - Math.sqrt(5))/2;

        double fibonacci = (Math.pow(x,n) - Math.pow(y, n))/Math.sqrt(5);

        System.out.printf("%.1f", fibonacci);
        leitor.close();
    }
}
