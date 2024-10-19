public class Main {
    public static void main(String[] args) {
        // Объявление переменных
        int initialBalance = 100;
        int rechargeAmount = 1100;
        int bonus = 0;

        // Объявление переменной для итогового счёта
        int finalBalance;
        // Проверка условным оператором не превысила ли сумма пополнения порог
        if (rechargeAmount > 1000) {

        // Рассчитываем бонус
            bonus = (rechargeAmount / 100); }

        // Итоговый счет
            finalBalance = initialBalance + rechargeAmount + bonus;

            // Вывод результатов на экран
            System.out.println("Сумма пополнения: " + rechargeAmount + " рублей");
            System.out.println("Бонусные рубли: " + bonus);
            System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");

        }
    }
