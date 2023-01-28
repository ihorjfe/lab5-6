package lab_rob_5;

public class Kitchen extends Hall {
    // змінні екземплярів класу
    private String chiefcook;//головний кухар
    private int cooks; //кількість кухарів
    private double area;//площа кухні
    private int cleaners;//кількість прибиральників на кухні
    private double time;//час роботи працивників за день

     Kitchen(String chiefcook, int cooks, double area, int cleaners, double time) {
        this.chiefcook = chiefcook;
        this.cooks = cooks;
        this.area = area;
        this.cleaners = cleaners;
        this.time = time;
    }

    public Kitchen() {

    }

    void people(int cooks, int cleaners) {
        System.out.println("Кількість працивників в кухні: " + (cooks + cleaners));
    }


    double times() {
        double t = time * 6;
        return t;
    }

    int times(int time) {//перевизначений метод
        int t = time * 6;
        return t;
    }
    int number() {
        int v =(cooks*700)+(cleaners*400) ;
        return v;
    }
    Kitchen newkitchen (){
        Kitchen kitchen = new Kitchen(chiefcook+"Олексійович",cooks * 2, area *1.5,cleaners+3,time+1);
        return kitchen;
    }

    @Override
    void someInfo() {
        System.out.println("кількість прибиральників на кухні " + cleaners);
    }

    public String getChiefcook() {
        return chiefcook;
    }

    public void setChiefcook(String chiefcook) {
        this.chiefcook = chiefcook;
    }

    public int getCooks() {
        return cooks;
    }

    public void setCooks(int cooks) {
        this.cooks = cooks;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCleaners() {
        return cleaners;
    }

    public void setCleaners(int cleaners) {
         int c = cleaners * 2;
        this.cleaners = cleaners;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void someMethod(){
         numberTables();
        System.out.println("Імя кухара: " + chiefcook);
    }
}
