package eu.senla.task3;
public class Main {
    public static void main(String[] args) {
         int i = 0;
         while(i < 10){
             Cat cat = new Cat();
           System.out.println("Cat has name " + cat.getName() + " and he is " + cat.getAge());
         i++;
}
        System.out.println("=====================");
        for (int j = 0; j < 10; j++) {
            Cat cat = new Cat();
            cat.setAge(j);
            cat.setName("Cat № " + j);
            System.out.println(cat.toString());
        }
        System.out.println("=====================");
        i = 0;
        do { Cat cat = new Cat("Cat № " + i, i);
            System.out.println(cat.toString());
        }
         while(i++ < 10 - 1);
        System.out.println("=====================");

         Cat[] cats = new Cat[4];
         cats[0] = new Cat("Cat 1 ", 3);
         cats[1] = new Cat("Cat 2 ", 4);
         cats[2] = new Cat("Cat 3 ", 5);
         cats[3] = new Cat("Cat 4 ", 6);
         cats[4] = new Cat("Cat 5 ", 7);

        for (Cat cat: cats ){
            System.out.println(cat.toString());
        }
    }
}