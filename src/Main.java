import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello and welcome! ");
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
        // 5.
        int braunPaintPerClass = 4, whitePaintPerClass = 2;
        int totalClasses = 120 / (braunPaintPerClass + whitePaintPerClass);
        System.out.print("В школе, где " + totalClasses + " классов нужно ");
        System.out.print((totalClasses * whitePaintPerClass) + " банок белой краски и ");
        System.out.println((totalClasses * braunPaintPerClass) + " банок коричневой краски");


    }
}