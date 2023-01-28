package lab_rob_5;

public class Administrator {
    final String name = "Антон";
    final int age = 28;
    final double height = 1.78;
    final double weight = 65;


    final void experience() {//Досвід роботи
        int experience = age - 18;
        System.out.println("Досвід роботи адміністратора : " + experience);
    }

    final void characteristic(){
        System.out.println("Ім'я :"+name+", Вік : "+age+", Висота : "+height+", Вага : "+weight);
    }

}

