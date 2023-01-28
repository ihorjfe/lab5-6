package lab_rob_6;


public class Kitchen extends Hall {

    public Kitchen(double width, double length, double height, int tables) {
        super(width, length, height, tables);
    }

    public double square(){
        double s = width*length*height;
        return s;

    }
}
