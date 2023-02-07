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


    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    private static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    private static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    private static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    private static void task6() {
        System.out.println("Задача 6");
        var boxerWight1 = 78.2;
        var boxerWight2 = 82.7;
        var totalWight = boxerWight1 + boxerWight2;
        System.out.println("Общий вес боксёров " + totalWight + " кг");
        var differentWight = boxerWight2 - boxerWight1;
        System.out.println("Разница в весе " + differentWight + " кг");
    }

    private static void task7() {
        System.out.println("Задача 7");
        var boxerWight1 = 78.2;
        var boxerWight2 = 82.7;
        var differentWight1 = boxerWight2 - boxerWight1;
        System.out.println("Разница в весе " + differentWight1 + " кг");
        var differentWight2 = boxerWight2 % boxerWight1;
        System.out.println("Разница в весе " + differentWight2 + " кг");
    }

    private static void task8() {
        System.out.println("Задача 8");
    }
}