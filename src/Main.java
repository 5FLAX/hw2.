public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend -2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog / 3.5 + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var boxer1 = 78.2;
        System.out.println("Вес боксера1 "+boxer1+ " кг!");
        var boxer2 = 82.7;
        System.out.println("Вес боксера2 " + boxer2 + " кг!");
        var TotalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров "+TotalWeight + " кг!");
        var weightDifference = (boxer2 % boxer1);
        System.out.println("Разница в весе на " + weightDifference + " кг!");

        System.out.println("Задание 7");
        weightDifference = boxer2 - boxer1;
        System.out.println("Остаток " + weightDifference + " кг!");

        System.out.println("Задание 8.1");
        var allTime = 640;
        System.out.println("Общее время сотрудников " + allTime + " часов работы!");
        var employeesTime = 8;
        System.out.println("Время работы одного сотрудника " +employeesTime + " часов!");
        var quantity = allTime / employeesTime;
        System.out.println("Всего работников в компании "+ quantity + " человек");

        System.out.println("Задание 8.2");
        var allTime2 = 94;
        System.out.println("Часы сотрудников "+ allTime2 +" человека");
        var alltime3= allTime + allTime2;
        System.out.println("Общеее время сотрудников " + alltime3 + " часов");
        var employeesTime1 = alltime3/ quantity;
        System.out.println("Еслив в комапании работает "+ quantity + " человек то всего по "+ employeesTime1+ " часов работы может быть поделенно между сотрудниками");



    }
}