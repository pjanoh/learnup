public class Main {
    public static void main(String[] args) {
        int amount = 60;
        int discount = 100;

        if (discount >= amount) {
            discount = amount - 1;
        }

        int total = amount - discount;
        System.out.println("Итог: " + total);
        System.out.println("Скидка: " + discount);
    }
}
