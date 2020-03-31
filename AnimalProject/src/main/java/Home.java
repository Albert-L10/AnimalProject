import java.util.ArrayList;

public class Home {

    ArrayList<Animal> pets =new ArrayList<>();


    public void AdoptPet(Animal pet)
    {
        pets.add(pet);



    }

    public void makeAllSounds()
    {
        for (Animal a : pets) {
            System.out.println(a.sound());
        }
    }




}
