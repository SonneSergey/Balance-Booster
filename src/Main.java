public class Main {
    public static void main(String[] args) {
        // Начальная сумма на счету клиента
        int initialBalance = 100;

        // Сумма пополнения
        int refillAmount = 300;

        // Вычисление бонуса
        int bonus = (refillAmount > 1000) ? refillAmount / 100 : 0;

        // Итоговый счет
        int finalBalance = initialBalance + refillAmount + bonus;
        System.out.println("Пополнение на сумму: " + refillAmount + " рублей.");
        if (bonus > 0) {
            System.out.println("Бонусные рубли: " + bonus);
        } else {
            System.out.println("Бонусов нет, так как сумма пополнения менее 1000 рублей.");
        }
        System.out.println("Итоговая сумма на счету клиента: " + finalBalance);
    }
}