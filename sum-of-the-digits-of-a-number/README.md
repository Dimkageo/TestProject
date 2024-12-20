# Задача 3: Знаходження суми цифр числа 100!

## Умови задачі

**Задача:**  
Необхідно знайти суму цифр числа 100!, тобто 100 факторіала.

**Правильна відповідь:** 648.

### Що таке факторіал?

Факториал числа \( n \) (позначається \( n! \)) — це добуток усіх цілих чисел від 1 до \( n \). Наприклад, для числа 5:
\[
5! = 5 \times 4 \times 3 \times 2 \times 1 = 120.
\]
Для числа 100 факторіал виглядатиме так:
\[
100! = 100 \times 99 \times 98 \times \dots \times 2 \times 1.
\]
Це величезне число, яке містить 158 цифр.

Ваша задача — знайти **суму цифр** цього числа.

### Алгоритм розв'язку

1. Знайти значення \( 100! \).
2. Перетворити це число в рядок і обчислити суму всіх цифр у числі.

### Рішення на Java

```java
import java.math.BigInteger;

public class FactorialSum {
    public static void main(String[] args) {
        // Обчислюємо 100!
        BigInteger factorial = calculateFactorial(100);
        
        // Знаходимо суму цифр числа 100!
        int sum = sumOfDigits(factorial);
        
        // Виводимо результат
        System.out.println(sum);
    }
    
    // Метод для обчислення факторіала
    public static BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); // Множимо на i
        }
        return factorial;
    }

    // Метод для обчислення суми цифр числа
    public static int sumOfDigits(BigInteger number) {
        int sum = 0;
        // Перетворюємо число в рядок
        String numberStr = number.toString();
        
        // Проходимо по кожній цифрі і додаємо до суми
        for (int i = 0; i < numberStr.length(); i++) {
            sum += numberStr.charAt(i) - '0'; // Перетворюємо символ на цифру
        }
        return sum;
    }
}
```
---
## Пояснення до рішення
### Обчислення факторіала:
Для обчислення факторіала числа 100 використовується метод calculateFactorial. Ми використовуємо цикл, щоб множити числа від 1 до 100, починаючи з 1, і використовуємо клас BigInteger, оскільки число 100! є дуже великим і не вміщується в типах даних типу int або long.

### Обчислення суми цифр:
Для обчислення суми цифр використовуємо метод sumOfDigits. Ми перетворюємо число на рядок, щоб можна було пройти по кожній цифрі і додати її до загальної суми. Для перетворення символу цифри в її числове значення віднімаємо від символу '0'.

### Виведення результату:
Після того як сума цифр була обчислена, ми виводимо результат.

---
## Важливі моменти:
BigInteger: В Java стандартні типи даних не можуть містити таке велике число, як 100!, тому для обчислення факторіала використовується клас BigInteger, який підтримує обчислення з довільною точністю.
Обробка цифр: Після обчислення факторіала число перетворюється на рядок, що дозволяє легко обробляти кожну цифру.
## Висновок:
Цей підхід дозволяє ефективно обчислити суму цифр числа
100
!
100!, використовуючи можливості класу BigInteger в Java.