package lab_rob_6;

public class MenuAndCooker implements MenuDemo{
    double priceSalads;
    double priseDish;
    double priseDrink;

    String name;

    public MenuAndCooker(double priceSalads, double priseDish, double priseDrink, String name) {
        this.priceSalads = priceSalads;
        this.priseDish = priseDish;
        this.priseDrink = priseDrink;
        this.name = name;
    }

    public void Zamovlenya(){
        System.out.println("Ціна повного замовлення: "+(priceSalads+priseDrink+priseDish));
    }

    public void showName() {
        System.out.println("Імя кухара: " + name);
    }

    public interface NewMethod{
        int number();
    }
}
