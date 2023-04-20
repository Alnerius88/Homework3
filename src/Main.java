public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte son = 120;
        short sons = 3211;
        int manySons = 123034;
        long thosandSons = 12449958L;
        float prosperoAsh = 51233.123F;
        double magnusSpine = 938457.1294887;
        System.out.println("Значение переменной son, с типом byte, равно " + son);
        System.out.println("Значение переменной sons, с типом short, равно " + sons);
        System.out.println("Значение переменной many sons, с типом int, равно " + manySons );
        System.out.println("Значение переменной thousandSons, с типом long, равно " + thosandSons );
        System.out.println("Значение переменной prosperoAsh, с типом float, равно " + prosperoAsh );
        System.out.println("Значение переменной magnusSpine, с типом double, равно " + magnusSpine );

    }
    public static void task2 () {
        System.out.println("Задача 2");
        float one = 27.12F;
        long two = 987678965549L;
        double three = 2.786;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludPav = 23;
        byte annSer = 27;
        byte ekatSer = 30;
        short paper = 480;
        int sheetPaper = paper / (ludPav + annSer + ekatSer);
        System.out.println("На каждого ученика рассчитано " + sheetPaper + " листов бумаги.");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte efficiencyTwo = 16;
        int efficiencyTwenty = efficiencyTwo * 10;
        int efficiency24 = efficiencyTwenty * 72;
        int efficiency3 = efficiency24 * 3;
        int efficiencyMonth = efficiency3 * 10;
        System.out.println("За 20 минут машина произвела " + efficiencyTwenty + " штук бутылок.");
        System.out.println("За сутки машина произвела " + efficiency24 + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + efficiency3 + " штук бутылок.");
        System.out.println("За месяц машина произвела " + efficiencyMonth + " штук бутылок.");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classes = totalPaint / (whitePaint + brownPaint);
        int classBrowns = classes * brownPaint;
        int classWhite = classes * whitePaint;
        System.out.println("В школе, где " + classes + " классов, нужно " + classWhite + " белой краски и " + classBrowns + " банок коричневой краски.");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short bananaWeight = 80;
        short milkWeight100 = 105;
        short icecreameWeight = 100;
        short eggWeight = 70;
        int breakfastGramm = bananaWeight * 5 + milkWeight100 * 2 + icecreameWeight * 2 + eggWeight * 4;
        float weightKg = breakfastGramm / 1000F;
        System.out.println("Вес спортзавтрака составляет "+ breakfastGramm + " в граммах, или " + weightKg + " если считать в килограммах.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        float minLost = 250 / 1000F;
        float maxLost = 500 / 1000F;
        short lostNeed = 7;
        float maxTime = lostNeed / minLost;
        int wholeMax = Math.round(maxTime);
        float minTime = lostNeed / maxLost;
        int wholeMin = Math.round(minTime);
        System.out.println("При потере 250 грамм в день спортсмен похудеет на 7 кг за " + wholeMax + " дней.");
        System.out.println("При потере 500 грамм в день, спортсмен похудеет на 7 кг за "+ wholeMin + " дней.");
        int middleTime = (wholeMax + wholeMin) / 2;
        System.out.println("В среднем, спортсмену понадобиться "+ middleTime + " дней, что бы похудеть на нужный вес.");
    }
    public static void task8 () {
        System.out.println("Задача 8");
    }

}