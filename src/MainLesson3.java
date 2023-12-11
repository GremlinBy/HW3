import java.util.Scanner;

public class MainLesson3 {
    public static void main(String[] args) {
//        типы данных int long это целочисленные
//        double это дробные
//        int a = 5;
//        int b = 10;
//        int cat_legs = 4;
//        int human_arms = 2;
//        int peopleEyes = 2;
//        String test = "firstTest";
//        char c = '℉';
//        double d = 123.123;
//        System.out.println(cat_legs + d );
//        System.out.println("a=" + a +"\t\t\t" + " b=" + b + "\n" + cat_legs + " " + human_arms +
//                " " + peopleEyes + "\n" + c + test + c + "\n" + d);
        System.out.println("\t\t\tКонвертер из белок в баксы и евро");
        System.out.println("введите бел.рубли");
        double a = new Scanner(System.in).nextDouble(); //где а это сумма белок
        System.out.println("Введите курс $");
        double b = new Scanner(System.in).nextDouble(); // где b это курс доллара
        double result = (double) a / b;

        System.out.println("$" + result + "\tчто так же равняется " + ((a / b) / 1.08) + " Евро" + "\tили\n");
        System.out.printf("если округлить  %.2f \n", +(result / 1.08));

    }
}
