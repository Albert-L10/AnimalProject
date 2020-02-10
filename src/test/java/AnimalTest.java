import jdk.internal.jline.internal.TestAccessible;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

public class AnimalTest {

   Dog dog=new Dog();
   cat Cat=new cat();




    @Test
    public void TestDogSound()
    {
        String test=dog.sound();
        Assert.assertEquals(test,"Barks");
    }

    @Test
    public void TestCatSound()
    {
        String test=Cat.sound();
        Assert.assertEquals(test,"meeauws");
    }



    @Test
    public void TestDogEats(){
        String test=dog.eat();
        Assert.assertEquals(test,"food");

    };

    @Test
    public void TestCatEats(){

        String test=Cat.eat();
        Assert.assertEquals(test,"food");
    };



}