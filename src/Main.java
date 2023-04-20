public class Main {
    public static void main(String[] args) {
        int money = 300;
        int amount = 100;
        int initialMoney = 100;

        int bonus;
        if (money >= 1000) {
            bonus = money / amount;
        } else {
            bonus = 0;

        }


        int totalMoney = initialMoney + money + bonus;


        System.out.println("сумма на счету " + totalMoney);
        System.out.println("Бонус " + bonus);

    }

}
