package lab_rob_5;


public class Main {
    public static void main(String[] args) {

        Hall h = new Hall(15, 12, 5,21);
        h.numberTables();
        System.out.println("Площа залу: " + h.square());
        System.out.println("Площа залу: " + h.square(15,12,5));
        System.out.println("Ціна за усі столики : "+h.number());
        System.out.println();
        h.someInfo();
        h.someInfo(15.500);


        h.setWidth(15);
        h.setLength(12);
        h.setHeight(5);
        h.setTables(21);
        ///////////////////////////////////////////////////////////////////////////////
        Kitchen k = new Kitchen("Олег", 7, 5000, 2, 8);
        k.people(7,2);
        System.out.println("Кількість годин працівників за тиждень: " + k.times());
        System.out.println("Кількість годин працівників за тиждень: " + k.times(8));
        System.out.println("Витрати на зарплату працівникам кухні :"+k.number());
        k.someMethod();
        k.someInfo();

        System.out.println();

        k.setChiefcook("Олег");
        k.setCooks(7);
        k.setArea(5000);
        k.setCleaners(2);
        k.times(8);
        ////////////////////////////////////////////////////////////////////////////////
        Menu m = new Menu("Салат", "Страва", "Напої", 80, 100, 50);
        m.Zamovlenya();
        System.out.println("Якщо ви замовите "+m.salad+" і " +m.dish+ " то знижка 50% і ціна буде: "+ m.Akcia());
        System.out.println("Якщо ви замовите "+m.salad+" і " +m.dish+ " то знижка 50% і ціна буде: "+ m.Akcia(80,100));
        System.out.println("Середня ціна : "+m.number());
        m.someMethodF();
        System.out.println();
        m.someInfo();

        m.setSalad("Салат");
        m.setDish("Страва");
        m.setDrink("Напої");
        m.setPriceSalads(80);
        m.setPriseDish(100);
        m.setPriseDrink(50);
        //перевизначений конструктор
        Hall Hall1 = new Hall();
        Hall Hall2 = new Hall(21);
        Hall Hall3 = new Hall(15,12,5);

        //метод посилкового типу
        k.newkitchen();
        //методу із класу, екземпляр якого передано в якості параметру
        System.out.println(m.newprice(m));
        System.out.println();

        //////////////////////////////////////////////////////////////////////
        Dressingroom dressingroom = new Dressingroom();
        Dressingroom.area();
        Dressingroom.room();
        System.out.println();

        //////////////////////////////////////////////////////////////////////
        Administrator administrator = new Administrator();
        administrator.experience();
        administrator.characteristic();
        System.out.println();

        ////////////////////////////////////////////////////////////////////////////
        Cooker cooker = new Cooker("Олег", 7, 5000, 2, 8);
        cooker.test();
        System.out.println();

        ////////////////////////////////////////////////////////////////////////////
        Dispatch dispatch = new Dispatch();
        dispatch.dis(1);
        dispatch.dis(2);
        dispatch.dis(3);

    }
}
