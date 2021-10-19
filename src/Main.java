public class Main {
    public static void main(String[] args) {
        int amount = 60;
        int discount = 100;

        if (amount <= 0) {
            System.out.println("Сумма не может быть отрицательной: " + amount);
            return;
        }

        if (discount >= amount) {
            discount = amount - 1;
        }

        int total = amount - discount;
        System.out.println("Итог: " + total);
        System.out.println("Скидка: " + discount);
    }
}
