public class Main {
    public static void main(String[] args) {

        // Задача №1
        int saving = 15000;
        int total = 0;
        int month = 0;
        while (total < 2459000) {
            total = total + total/100;
            total = total + saving;
            month ++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
        }// это очень долго с нашей инфеляцией ))
        System.out.println();

        // Задача №2
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num1 = 10; num1 >= 1; num1-- ){
            System.out.print(num1 + " ");
        }
        System.out.println();
        System.out.println();

        // Задача №3
        int countryPeople = 12000000;
        int birthRate = 17;
        int death = 8;
        int year = 0 ;
        while (year < 12) {
            year = year + 1;
            countryPeople = countryPeople + (countryPeople * birthRate / 1000) - (countryPeople * death / 1000);
            System.out.println("Год " + year +  ", численность населения составляет " + countryPeople);
        }
        System.out.println();

        // Задача №4
        int contribution = 15000; // я правельно понял , что каждый месяц к его сумме вклада он добовляет 7 %  ?
        long accumulated = 0L;
        int interestRate = 7;
        int month1 = 0;
        while (accumulated < 12_000_000) {
            accumulated = accumulated + accumulated * interestRate/100 + contribution ;
            contribution = contribution * interestRate / 100 + contribution;
            month1++;
            System.out.println("Месяц " + month1 + " , сумма накоплений равна " + accumulated + " рублей");
        }
        System.out.println();

        // Задача №5
        int contribution1 = 15000;
        int accumulated1 = 0;
        int interestRate1 = 7;
        int month2 = 0;
        while (accumulated1 <= 12_000_000) {
            accumulated1 = accumulated1 + accumulated1 * interestRate1 / 100 + contribution1;
            contribution1 = contribution1 * interestRate1 / 100 + contribution1;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " , сумма накоплений равна " + accumulated1 + " рублей");
            }
        }
        System.out.println();

        // Задача №6
        int contribution2 = 15000;
        int accumulated2 = 0;
        int interestRate2 = 7;
        int month3 = 0;
        for (; month3 <= 108; month3 = month3 + 6) {
            accumulated2 = accumulated2 + accumulated2 * interestRate2 / 100 + contribution2;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " , сумма накоплений равна " + accumulated2 + " рублей");
            }
        }
        System.out.println();

        // Задача №7
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        // Задача №8
        int comet = 79;
        int year1  = 0;
        for ( ; year1 < 2100 ; year1 = year1 +comet  ) {
            if (year1 > 1824 && year1 < 2124) {
                System.out.println(year1);
            }
        }
    }
}
