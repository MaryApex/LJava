package week_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean work = true;
        Scanner input = new Scanner(System.in);
        String password = "1234";
        int balance = 1000;

        System.out.println("Доброго дня! Вас вітає ТирольБанк. Для початку роботи з системою будь ласка вставте Вашу банківську картку та введіть пін-код.");

        int triesCounter = 0;
        int tries = 2;
        while (work) {
            if (password.equals(input.next())) {
                System.out.println("Пароль вірний");
                System.out.println("Оберіть, будь ласка, бажану операцію");
                System.out.println("Натисніть 1 якщо бажаєте перевірити баланс");
                System.out.println("Натисніть 2 якщо бажаєте зняти кошти");
                System.out.println("Натисніть 3 якщо бажаєте поповнити баланс");
                System.out.println("Натисніть 4 якщо бажаєте завершити роботу з банкоматом");

                String userChoice = input.next();

                switch (userChoice) {

                    case "1": {
                        System.out.println("Ваша баланс = " + balance);
                        break;
                    }
                    case "2": {
                        System.out.println("Будь ласка введіть суму яку бажаєте зняти");
                        int withdrawal = input.nextInt();
                        if (withdrawal <= balance && withdrawal >= 0) {
                            balance = balance - withdrawal;
                        } else {
                            System.out.println("На вашому рахунку не достатньо коштів для здійснення операції");
                            System.out.println("Ваш баланс становить " + balance);
                        }

                        break;
                    }
                    case "3": {
                        System.out.println("Внесіть будь ласка купюрив банкомат");
                        int addMoney = input.nextInt();
                        if (addMoney >= 0 && addMoney <= 1000000) {
                            balance = balance + addMoney;
                            System.out.println("Ваш новий баланс дорівнює " + balance);
                        } else {
                            System.out.println("Будь ласка внесіть меншу суму");
                        }
                        break;
                    }
                    case "4": {
                        work = false;
                        break;
                    }
                    default: {
                        System.out.println("Будь ласкаб зробіть Ваш вибір! Сеанс буде завершено через 60 секунд.");
                    }
                }

            } else {
                System.out.println("Пароль  не вірний. Спробуйте ввести пароль ще раз. У Вас залишилось " + tries + " спроб");
                while (triesCounter > tries) ;
                tries = tries - 1;
                if (password.equals(input.next())) {
                    System.out.println("Пароль вірний");
                } else {
                    System.out.println("Пароль  не вірний. Спробуйте ввести пароль ще раз. У Вас залишилось " + tries + " спроб");
                    while (triesCounter >= tries) ;
                    Scanner secondInput = new Scanner(System.in);
                    tries = tries - 1;
                    if (password.equals(input.next())) {
                        System.out.println("Пароль вірний");
                    } else {
                        System.out.println("Пароль  не вірний. Вашу картку заблоковано банком");
                        System.exit(0);
                    }
                }
            }
        }
        input.close();
    }
}
