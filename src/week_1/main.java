package week_1;

public class main {
    public static void main(String[] args) {

//        boolean a = “true”; - тут нам не потрібні лапки, вони роблять зімнну стрінгою
//         byte b  = 129; - цей тип даних місти змінні від -128 до 127
//         short c = 25f; - цей тип даних є виключно числовим в параметрах від -32768 до 32767
//         long e = 6456567774; - тут потрібна explicit ініціалізація, в кінці значення потрібно додати L/l
//         int t = -8798954356; - цей тип даних містить числові дані в параметрах від -2147483648 до 2147483647
//         double p = ‘-6’; - цей тип даних містить не цілі дані (з плаваючою крапкою) і потребує explicit ініціалізації
//          float s = 4.89; - цей тип даних вимагає explicit ініціалізації
//          char l = “y”; - тут зайві подвійні лапки, мають бути одиничні

        boolean a = true;
        byte b = 127;
        short c = 25000;
        long e = 6456567774L;
        int t = -879895435;
        double p = 6.1D;
        float s = 4.89F;
        char l = 'y';

        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number = number + 1;
        }
        String message = "And now wise versa";
        {
            System.out.println(message);
        }
        int newNumber = 10;
        while (newNumber >= 1) {
            System.out.println(newNumber);
            newNumber = newNumber - 1;


        }
    }
}
