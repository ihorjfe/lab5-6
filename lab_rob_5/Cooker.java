package lab_rob_5;


public class Cooker extends Kitchen {
    public Cooker(String chiefcook, int cooks, double area, int cleaners, double time) {
        super(chiefcook, cooks, area, cleaners, time);
    }

    void callM(){
        System.out.println(times());
        System.out.println("Кількість кухарів: " + getCooks());
    }

    void test(){
        Experience experience = new Experience();
        experience.showE();
    }

    class Experience {
        int e = 10;
        void showE(){
            System.out.println("Досвід кухара: " + e);
            callM();
        }
    }
}
