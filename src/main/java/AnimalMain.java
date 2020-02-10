public class AnimalMain {
    public static void main(String[] args) {

        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        cat cat1 = new cat();


        home.makeAllSounds();// this doesn't give/return any result/data
        home.AdoptPet(dog1);
        home.makeAllSounds();

        home.AdoptPet(cat1);

        home.makeAllSounds();

        home.AdoptPet(dog2);

        home.makeAllSounds();
    }
}