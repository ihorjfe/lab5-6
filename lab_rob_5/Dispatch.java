package lab_rob_5;

public class Dispatch {

    Hall h = new Hall(15, 12, 5,21);
    Kitchen k = new Kitchen("Олег", 7, 5000, 2, 8);
    Menu m = new Menu("Салат", "Страва", "Напої", 80, 100, 50);
    Hall hall;

    void dis(int i){
        if(i == 1){
            hall = h;
            hall.someInfo();
        } else if (i == 2) {
            hall = k;
            hall.someInfo();
        } else if (i == 3) {
            hall = m;
            hall.someInfo();
        }
    }
}
