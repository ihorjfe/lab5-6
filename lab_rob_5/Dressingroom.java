package lab_rob_5;

public class Dressingroom {
    static double width; //ширина вбиральні
    static double lenght;//довжина вбиральні
    static double height; //висота вбиральні
    static int booth = 3;//кількість кабінок
    static {
        width = 10;
        lenght = 5;
        height = 2.50;
    }
    static void area(){
      double area  = width * lenght;
      System.out.println("Площа вбиральні :"+area);
    }
    static void room(){
        System.out.println("Ширина вбиральні : "+ width+", Довжина вбиральні : "+lenght+", Висота вбиральні :"+height+", Кількість кабінок :"+booth);
    }
}
