//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Задача №1");
        int firstFriday = 3;
        System.out.println(firstFriday + " Дата первой пятницы месяца(значение от 1 до 7.");
        for ( int i = 1; i <= 31; i++){
            if (i >= firstFriday && (i - firstFriday) % 7 == 0){
                System.out.println("сегодня пятница, " +  i + "-е число. Необходимо сдать отчет. ");;
            }
        }
        System.out.println("Задача №2");
        int totalDistance = 42195;
        int distance = 0;
        do {
            int remains = totalDistance - distance;
            System.out.println("Держитесь! Осталось " + remains + " метров");
            distance += 500;
        }while (distance <= totalDistance);
        System.out.println("Финиш! Вы пробежали марафон!");

        for (distance = 0; distance < totalDistance; distance += 500){
            int remains = totalDistance - distance;
            System.out.println("Держитесь! Осталось " + remains + " метров!");
        }
        System.out.println("Финишь! Вы пробежали марафон!");

        System.out.println("Задача №3");
        int budget = 3000;
        int costPfrking = 100;
        int days = 0;
        int tempBudget = budget;
        while (tempBudget >= costPfrking) {
            days++;
            if (days % 5 == 0) {
                continue;
            }
            tempBudget -= costPfrking;
        }
        System.out.println("Бюджета хватит на " + days + " дней.");

        for (int i = 1; tempBudget >= costPfrking; i++) {
            days = i;
            if (i % 5 == 0) {
                continue;
            }
            tempBudget -= costPfrking;
        }
        System.out.println("Бюджета хватит на " + days + " дней.");

        System.out.println("Задача №4");
        int month = 0;
        int donat = 15000;
        double total = 0;
        int desiredAmount = 12000000;
        while (true){
            month++;
            total += donat;
            if (month % 6 == 0){
                total = total+total*0.07;
            }
            System.out.printf("Месяц %d. Накоплений %.2f\n", month, total);
            if (total > desiredAmount){
                break;
            }
        }
        System.out.println("Цель достигнута! Понадобилось " + month + " месяцев");

        System.out.println("Задача №5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            charge = charge + 2;
            if (minute % 10 == 0) {
                overheats++;
                continue;
            }
            if (overheats == 3) {
                System.out.println("Зарядка прекращена. Текущий заряд " + charge);
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минуту");
    }
}