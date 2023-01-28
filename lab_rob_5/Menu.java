package lab_rob_5;


public class Menu extends Kitchen {
    String salad;//салати
    String dish;//страви
    String drink;//напої

    double priceSalads;
    double priseDish;
    double priseDrink;

     Menu(String salads, String dish, String drink, double priceSalads, double priseDish, double priseDrink) {
         super();
        this.salad = salads;
        this.dish = dish;
        this.drink = drink;
        this.priceSalads = priceSalads;
        this.priseDish = priseDish;
        this.priseDrink = priseDrink;
    }
    void Zamovlenya(){
        System.out.println("Ціна повного замовлення: "+(priceSalads+priseDrink+priseDish));
    }
    double Akcia(){
        double a =  priceSalads+priseDish/2;
        return a;
    }
    int Akcia(int priceSalads,int priseDish){//перевизначений метод
        int a =  priceSalads+priseDish/2;
        return a;
    }
    int number() {
        int v = (int) ((priceSalads+priseDish+priseDrink)/3);
        return v;
    }
    double newprice(Menu menu){
        Akcia(60, 70);
        return menu.priseDish;
    }


    void otherClasses(){
        System.out.println(super.getCooks());
        System.out.println(super.getLength());
    }

    void someMethodF(){
        someMethod();
        System.out.println("Ціна салатів: " + priceSalads);
    }

    @Override
    void someInfo() {
        System.out.println("ціна напоїв: " + priseDrink);
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public double getPriceSalads() {
        return priceSalads;
    }

    public void setPriceSalads(double priceSalads) {
        this.priceSalads = priceSalads;
    }

    public double getPriseDish() {
        return priseDish;
    }

    public void setPriseDish(double priseDish) {
        this.priseDish = priseDish;
    }

    public double getPriseDrink() {
        return priseDrink;
    }

    public void setPriseDrink(double priseDrink) {
         double dr = priseDrink *2;
        this.priseDrink = priseDrink;
    }


}


