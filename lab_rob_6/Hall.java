package lab_rob_6;

public class Hall implements HallDemo, MenuAndCooker.NewMethod{
    double width; //ширина залу
    double length; //довжина залу
    double height; //висота залу
    int tables;//кількість столів

    public Hall(double width, double length, double height, int tables) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.tables = tables;
    }
    public void numberTables() {
        System.out.println("Кількість столиків: "+ tables);
    }

    public double square(){
        double s = width*length*height;
        return s;

    }

    public int number(){
        int v = tables*300;
        return v;
    }
}
