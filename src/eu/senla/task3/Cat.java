package eu.senla.task3;

public class Cat {
    public Cat(String name) {
    }

    @Override
    public String toString() {
        return "Cat has name " + this.getName() + " and he is " + this.getAge();
    }

    private int age;
    private String name;
    public Cat(){
        age = 5;
        name = "Bill";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public Cat(String name, int age ) {
        this.name = name;
        this.age = age;
   }
}