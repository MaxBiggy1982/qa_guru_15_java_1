package mTotski;

public class Homework {

    public static void main(String[] args) {
        //  1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        // peremennye

        byte qByte1 = 100;
        byte qByte2 = 60;
        short qShort1 = 32000;
        short qShort2 = 14000;
        int qInt = 2000;
        double qDouble = 113.33;
        float qFloat = 1.1f;
        int Step;
        int NumberOfSteps = 10;

        //добиться переполнения при вычислениях,

        System.out.println("переполнения byte");
        System.out.println(qByte1 + qByte2);


        System.out.println("переполнения short");
        System.out.println(qShort1 + qShort2);

        // basic math
        System.out.println(qInt + 4);
        System.out.println(qInt - 5);
        System.out.println(qDouble * 3);
        System.out.println(qDouble / 16);
        System.out.println(qDouble % 4);

        // logic
        System.out.println("Logic");
        System.out.println(qInt > 2 && qShort2 <= 4); // false
        System.out.println(qInt > 2 || qShort2 >= 4); // true
        System.out.println(qInt == 4); //false

        // if condition
        // walking
        Step = 1;
        while (Step < NumberOfSteps) {
            if ((Step % 2) == 0) {
                System.out.println("Step with left leg");
            } else {
                System.out.println("Step with right leg");
            }
            Step++;
        }

        //   2) попробовать вычисления комбинаций типов данных (int и double)
        System.out.println("calculating data types (int и double)");
        int integerTest = 13;
        double doubleTest = 53.6;

        System.out.println(integerTest + doubleTest);
        System.out.println(integerTest - doubleTest);
        System.out.println(integerTest / doubleTest);
        System.out.println(integerTest * doubleTest);
        System.out.println(integerTest % doubleTest);
    }
}
