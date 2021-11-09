package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = 550;
        int wather = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;

        String coffee_type;

        String user;

        do {

            System.out.println("Write action (buy, fill, take, remaining, exit): ");

            user = scanner.nextLine();

            switch (user) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    coffee_type = scanner.nextLine();

                    switch (coffee_type) {
                        case "1":
                            if ((wather - 250) > 0 && (beans - 16) > 0 && cups > 0) {
                                wather -= 250;
                                beans -= 16;
                                --cups;
                                money += 4;
                            } else {
                                    System.out.println("No ingredients");
                            }
                            break;
                        case "2":
                            if ((wather - 350) > 0 && (milk - 75) > 0 && (beans - 20) > 0 && cups > 0) {
                                wather -= 350;
                                milk -= 75;
                                beans -= 20;
                                --cups;
                                money += 7;
                            } else {
                                System.out.println("No ingredients");
                            }
                            break;
                        case "3":
                            if ((wather - 200) > 0 && (milk - 100) > 0 && (beans - 12) > 0 && cups > 0) {
                                wather -= 200;
                                milk -= 100;
                                beans -= 12;
                                --cups;
                                money += 6;
                            } else {
                                System.out.println("No ingredients");
                            }
                            break;
                        case "back":
                            break;
                        default:
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    int fillWather = scanner.nextInt();
                    wather += fillWather;

                    System.out.println("Write how many ml of milk you want to add:");
                    int fillMilk = scanner.nextInt();
                    milk += fillMilk;

                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int fillBeans = scanner.nextInt();
                    beans += fillBeans;

                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    int fillCups = scanner.nextInt();
                    cups += fillCups;
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":

                    System.out.println(wather + " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println(beans + " g of coffee beans");
                    System.out.println(cups + " disposable cups");
                    System.out.println("$" + money + " of money");
                    break;
                default:
                    break;
            }
        } while (!user.equals("exit"));
    }
}
