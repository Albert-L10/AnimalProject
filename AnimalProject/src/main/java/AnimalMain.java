public class AnimalMain {
    public static void main(String[] args) {

        String name = "";

        Dog dog;
        dog = new Dog(name="Rex");

        System.out.println(name+" "+dog.eat());
        dog.sound();

        Cat cat;
        cat = new Cat(name="stacy");
        System.out.println(name+" "+cat.eat());
        cat.sound();

        Home home=new Home();

        home.AdoptPet(cat);
        home.makeAllSounds();

        home.AdoptPet(dog);
        home.makeAllSounds();
    }
}