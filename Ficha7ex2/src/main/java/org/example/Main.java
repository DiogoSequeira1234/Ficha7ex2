package org.example;

public class Main {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Não é primo
            }
        }
        return true; // É primo
    }

    // Método para verificar se um número é par
    public boolean isEven(int number) {
        return number % 2 == 0; // Retorna true se for divisível por 2
    }

    // Método para verificar se um número é múltiplo de outro
    public boolean isMultiple(int number, int divisor) {
        return number % divisor == 0; // Retorna true se for múltiplo
    }

}