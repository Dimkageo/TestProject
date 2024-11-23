import java.math.BigInteger;

public class FactorialSum {
    public static void main(String[] args) {
        // Вычисляем 100!
        BigInteger factorial = calculateFactorial(100);
        
        // Находим сумму цифр числа 100!
        int sum = sumOfDigits(factorial);
        
        // Выводим результат
        System.out.println(sum);
    }
    
    // Метод для вычисления факториала
    public static BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); // Умножаем на i
        }
        return factorial;
    }

    // Метод для вычисления суммы цифр числа
    public static int sumOfDigits(BigInteger number) {
        int sum = 0;
        // Преобразуем число в строку
        String numberStr = number.toString();
        
        // Проходим по каждой цифре и суммируем
        for (int i = 0; i < numberStr.length(); i++) {
            sum += numberStr.charAt(i) - '0'; // Преобразуем символ в цифру
        }
        return sum;
    }
}
