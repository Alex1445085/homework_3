import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello and welcome! ");
        System.out.println();
        // 1.
        byte varByte = 127;
        short varShort = 32000;
        int varInt = 1000987;
        long varLong = 9888777666L;
        float varFloat = 12.88765f;
        double varDouble = 3.141592652;
        System.out.println("Значение переменной 'varByte' с типом 'byte' равно " + varByte);
        System.out.println("Значение переменной 'varChar' с типом 'char' равно " + varShort);
        System.out.println("Значение переменной 'varInt' с типом 'int' равно " + varInt);
        System.out.println("Значение переменной 'varLong' с типом 'long' равно " + varLong);
        System.out.println("Значение переменной 'varFloat' с типом 'float' равно " + varFloat);
        System.out.println("Значение переменной 'varDouble' с типом 'double' равно " + varDouble);
        System.out.println();
        // 2.
        varFloat = 27.12f;
        varLong = 987678965549L;
        varFloat = 2.786f;
        varShort = 569;
        varShort = -159;
        varShort = 27897;
        varByte = 67;
        // 3.
        short teachLudPavl, teachAnnSerg, teachEkaAndr;
        teachLudPavl = 23;
        teachAnnSerg = 27;
        teachEkaAndr = 30;
        System.out.println("На каждого ученика рассчитано " + (480 / (teachAnnSerg + teachEkaAndr + teachLudPavl)) + " листов бумаги.");
        System.out.println();
        // 4.
        int efficiency2Min = 16;
        int i = efficiency2Min * 10;
        System.out.println("За 20 минут машина произвела " + i + " штук бутылок.");
        i = i * 3 * 24;
        System.out.println("За сутки машина произвела " + i + " штук бутылок.");
        i = i * 3;
        System.out.println("За трое суток машина произвела " + i + " штук бутылок.");
        i = i * 10;
        System.out.println("Если в месяце 30 дней, то за месяц машина произвела " + i + " штук бутылок.");
        System.out.println();
        // 5.
        int braunPaintPerClass = 4, whitePaintPerClass = 2;
        int totalClasses = 120 / (braunPaintPerClass + whitePaintPerClass);
        System.out.print("В школе, где " + totalClasses + " классов нужно ");
        System.out.print((totalClasses * whitePaintPerClass) + " банок белой краски и ");
        System.out.println((totalClasses * braunPaintPerClass) + " банок коричневой краски.");
        System.out.println();
        // 6.
        short bananasWeight = 80;
        short milkWeight100 = 105;
        short iceCream = 100;
        short eggWeight = 70;
        float totalWeight = bananasWeight * 5 + milkWeight100 * 2 + iceCream * 2 + eggWeight * 4;
        System.out.println("Вес такого спортзавтрака составляет " + totalWeight + " г.");
        float totalWeightKilo = 0.000f;
        totalWeightKilo = totalWeight / 1000;
        System.out.println("В килограммах это будет " + totalWeightKilo + " кг.");
        System.out.println();
        // 7.
        int differenceWWeight = 7, weightOut250 = 250, weightOut500 = 500;
        System.out.print("При похудании на 250г в день на приведение веса в норму необходимо ");
        System.out.println((differenceWWeight * 1000 / weightOut250) + " дней.");
        System.out.print("При похудании на 500г в день на приведение веса в норму необходимо ");
        System.out.println(differenceWWeight * 1000 / weightOut500 + " дней.");
    }
}
