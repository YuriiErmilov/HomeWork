//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome,,!");

        byte a = 67;
        short b = 30000;
        int c = 40000;
        long d = 2242222L;
        float f = 3.14f;
        double g = 1.7;

        System.out.println("Значение переменной с типом byte равно " + a );
        System.out.println("Значение переменной с типом short равно " + b );
        System.out.println("Значение переменной с типом int равно " + c );
        System.out.println("Значение переменной с типом long равно " + d );
        System.out.println("Значение переменной с типом float равно " + f );
        System.out.println("Значение переменной с типом double равно " + g );

        double first = 27.12;
        long second = 987678965549L;
        float third = 2.786f;
        short fourth = 569;
        int fifth = -159;
        int sixth = 27897;
        byte seventh = 67;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);
        System.out.println(seventh);


        byte studentsLudmilaPavlov = 23;
        byte studentsAnnaSerge = 27;
        byte studentsEkaterinaAndre = 30;
        short sheetsOfPaper = 480;
        int totalStudents = studentsLudmilaPavlov + studentsAnnaSerge + studentsEkaterinaAndre;
        int paperEachStudents = sheetsOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperEachStudents + " листов бумаги.");


        byte productivityTwoMinutes = 16;
        System.out.println("За 2 минуты машина производит " + productivityTwoMinutes + " бутылок.");
        int productivityTwentyMinutes = productivityTwoMinutes * 10;
        System.out.println("За 20 минут машина производит " + productivityTwentyMinutes + " бутылок.");
        int productivitySixtyMinutes =  productivityTwentyMinutes * 3;
        System.out.println("За 60 минут машина производит " + productivitySixtyMinutes + " бутылок.");
        int productivityOneDay = productivitySixtyMinutes * 24;
        System.out.println("За сутки машина производит " + productivityOneDay + " бутылок.");
        int productivityThreeDays = productivityOneDay * 3;
        System.out.println("За три дня машина производит " + productivityThreeDays + " бутылок.");
        int productivityOneMonth =  productivityThreeDays * 10;
        System.out.println("За один месяц машина производит " + productivityOneMonth + " бутылок.");


        byte totalOfPaint = 120;
        byte whitePaintOnClass = 2;
        byte brownPaintOnClass = 4;
        int totalPaintOneClass = whitePaintOnClass + brownPaintOnClass;
        byte totalClassInSchool = (byte) (totalOfPaint / totalPaintOneClass);
        byte totalWhitePaintWasBuy = (byte) (whitePaintOnClass * totalClassInSchool);
        byte totalBrownPaintWasBuy = (byte) (brownPaintOnClass * totalClassInSchool);
        System.out.println("В школе, где " + totalClassInSchool + " классов, нужно " + totalWhitePaintWasBuy + " банок белой краски и " + totalBrownPaintWasBuy + " банок коричневой краски.");

        byte banana = 80;
        byte milkOneHundredMilliliters = 105;
        byte iceCream = 100;
        byte egg = 70;

        int totalBananaInRecipe = banana * 5;
        int totalMilkInRecipe = milkOneHundredMilliliters * 2;
        int totalIceCreamInRecipe = iceCream * 2;
        int totalEggInRecipe = egg * 4;

        int sportBreakfast = totalBananaInRecipe + totalMilkInRecipe +  totalIceCreamInRecipe + totalEggInRecipe;
        System.out.println("Вес такого спортзавтрака в граммах будет " + sportBreakfast);
        float sportBreakfastInKilogram = sportBreakfast / 1000F;
        System.out.println("Вес такого спорт завтрака в киллограмах будет " + sportBreakfastInKilogram);


        byte weightToLose = 7;
        short minToLoseWeight = 250;
        short maxToLoseWeight = 500;

        int weightToLoseInKilogram = weightToLose * 1000;

        int daysForMinToLoseWeight = weightToLoseInKilogram / minToLoseWeight;
        int daysFroMaxToLoseWeight = weightToLoseInKilogram / maxToLoseWeight;

        float averageWeightLossDay = (minToLoseWeight + maxToLoseWeight) / 2F;
        float daysToLoseWeightOnAverage = weightToLoseInKilogram / averageWeightLossDay;

        System.out.println("Если спортсмен будет терять еженевно " + minToLoseWeight + " грамм, то потребуется " + daysForMinToLoseWeight + " дней для похудения");
        System.out.println("Если спортсмен будет терять еженевно " + maxToLoseWeight + " грамм, то потребуется " + daysFroMaxToLoseWeight + " дней для похудения");
        System.out.println("В среднем может потребоваться " +daysToLoseWeightOnAverage + " дней, чтобы добиться результата похудения");



        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        float mashaRaisingSalary = masha * 0.1f;
        float denisRaisingSalary = denis * 0.1f;
        float kristinaRaisingSalary = kristina * 0.1f;

        int mashaNewSalary = masha + (int)mashaRaisingSalary;
        int denisNewSalary = denis + (int)denisRaisingSalary;
        int kristinaNewSalary = kristina + (int)kristinaRaisingSalary;

        int mashaSalaryYearBeforeRaising = masha * 12;
        int denisSalaryYearBeforeRaising = denis * 12;
        int kristinaSalaryYearBeforeRaising = kristina * 12;

        int mashaSalaryYearAfterRaising = mashaNewSalary * 12;
        int denisSalaryYearAfterRaising = denisNewSalary * 12;
        int kristinaSalaryYearAfterRaising = kristinaNewSalary * 12;

        int differenceSalaryMashaYear = mashaSalaryYearAfterRaising - mashaSalaryYearBeforeRaising;
        int differenceSalaryDenisYear = denisSalaryYearAfterRaising - denisSalaryYearBeforeRaising;
        int differenceSalaryKristinaYear = kristinaSalaryYearAfterRaising - kristinaSalaryYearBeforeRaising;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + differenceSalaryMashaYear + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + differenceSalaryDenisYear + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + differenceSalaryKristinaYear + " рублей");

    }
}