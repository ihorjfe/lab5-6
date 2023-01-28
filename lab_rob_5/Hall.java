package lab_rob_5;

public class Hall extends HallDemo{
    // змінні екземплярів класу
    private double width; //ширина залу
    private double length; //довжина залу
    private double height; //висота залу
    private int tables;//кількість столів


     Hall(double width, double length, double height, int tables) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.tables = tables;
    }
    public void numberTables(){
        System.out.println("Кількість столиків: "+ tables);
    }

    int square(int width,int length,int height){//Площа залу
        int s = width*length*height;
        return s;

    }
    double square(){ //перевизначений метод
        double s = width*length*height;
        return s;

    }
    ///////////////////////////
    int number(){
        int v = tables*300;
        return v;
    }

    void someInfo(){
         numberTables();
    }

    void someInfo(double salary){
        System.out.println("Середня зарплата персоналу: " + salary);
    }
    ///////////////////////////
    public Hall() {

    }
    public Hall(int tables) {
        this.tables=tables;

    }
    public Hall(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
         int t = tables * 2;
        this.tables = tables;
    }

}
