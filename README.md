# Задания для кандидата

Добрый день, уважаемый кандидат.

## Комментарии к выполнению заданий:
- Обязательно снабдить код комментарием (на английском языке).
- В первую очередь интересуют исходники.
- Задания могут быть сделаны на любом языке программирования, если есть возможность на Java - лучше на Java.
- Обязательное выполнение всех трех задач.

## Вопрос:
**Если Вы желаете набрать людей для обучения, зачем задавать задания уровня олимпиады по программированию?**

## Ответ:
Нам нужно фильтровать людей, которые с одной стороны ничего не умеют еще в наших технологиях, а с другой — которые смогут решать сложные задания и у которых работает голова.

Если человек сможет разобраться и решить подобные задачи, то и сможет быстро обучиться. Если бросит все на пол пути, то скорее всего и с него ничего толкового не выйдет.

Удачи!

---

## Задание 1

**Условие:**  
Если мы из корректно записанного арифметического выражения, содержащего числа, знаки операций и открывающие и закрывающие круглые скобки, выбросим числа и знаки операций, а затем запишем оставшиеся в выражении скобки без пробелов между ними, то полученный результат назовем правильным скобочным выражением.  
Пример:
- Правильное скобочное выражение: `(()(()))`
- Неправильное скобочное выражение: `())(`

Найти число правильных скобочных выражений, содержащих **N** открывающихся и **N** закрывающихся скобок. **N** вводится с клавиатуры. **N** — неотрицательное целое число.

**Пример:**

- Для N = 1 (по одной скобке открывающейся и закрывающейся) — ответ 1  
  Варианты:
  () )( -> неправильно )) -> неправильно ((

Только один правильный вариант.

- Для N = 2 — ответ 2  
  Варианты:
  ()() (())


---

## Task 2

You are given a list of cities. Each direct connection between two cities has a transportation cost (an integer greater than 0). The goal is to find the paths of minimum cost between pairs of cities. Assume that the cost of each path (which is the sum of costs of all direct connections belonging to this path) does not exceed 200000. The name of a city is a string containing characters from a to z and is at most 10 characters long.

**Input:**

- s [number of tests <= 10]
- n [number of cities <= 10000]
- NAME [city name]
- p [the number of neighbors of city NAME]
- nr cost [nr - index of a city connected to NAME (the index of the first city is 1)]
  [cost - transportation cost]
- r [the number of paths to find <= 100]
- NAME1 NAME2 [NAME1 - source city, NAME2 - destination city]
  [empty line separating the tests]

**Output:**

- cost [the minimum transportation cost from city NAME1 to city NAME2 (one per line)]

**Example Input:**

1 
4 
gdansk 
2 
2 1 
3 3 
bydgoszcz 
3 
1 1 
3 1 
4 4 
torun 
3 
1 3 
2 1 
4 1 
warszawa 
2 
2 4 
3 1 
2 
gdansk warszawa 
bydgoszcz warszawa


**Example Output:**

3 
2


---

## Task 3

Find the sum of the digits in the number 100! (i.e. 100 factorial).  
**Correct answer:** 648.

100! is the product of all numbers from 1 to 100:
\[
100! = 100 \times 99 \times 98 \times \dots \times 2 \times 1.
\]
Find the sum of all the digits of this number.

---

