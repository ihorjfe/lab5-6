package lab_rob_6;

public class Main {
    public static void main(String[] args) {
        MenuAndCooker menuAndCooker = new MenuAndCooker(80.0, 78.9, 50.0, "Антон");
        Hall hall = new Hall(15, 12, 5,21);
        Kitchen kitchen = new Kitchen(15, 12, 5,21);

        menuAndCooker.Zamovlenya();
        menuAndCooker.showName();

        System.out.println();

        hall.numberTables();
        System.out.println(hall.square());
        System.out.println(hall.number());

        System.out.println();

        System.out.println(kitchen.square());
    }

}
