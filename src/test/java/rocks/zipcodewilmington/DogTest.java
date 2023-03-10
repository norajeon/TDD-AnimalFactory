package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDogTest() {
        // Given
        String name = "doggo";
        Date birthDate = new Date();
        Integer id = 5;

        Dog dog = new Dog(name, birthDate, id);

        String a = dog.getName();
        Date b = dog.getBirthDate();
        Integer c = dog.getId();

        Assert.assertEquals(a, name);
        Assert.assertEquals(b, birthDate);
        Assert.assertEquals(c, id);
    }

    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog(null, null, null);

        String testingDog = dog.speak();

        // Then
        String barking = "bark!";
        Assert.assertEquals(barking, testingDog);
    }

    @Test
    public void birthDateTest() {
        //Given
        Date birthDate = new Date();
        Dog dog = new Dog(null, birthDate, null);

        //When
        dog.setBirthDate(birthDate);
        Date d = dog.getBirthDate();

        //Then
        Assert.assertEquals(birthDate, d);

    }

    @Test
    public void eatFoodTest() {
    //Given
        Dog dog = new Dog (null, null, null);
        Integer originalFoods = dog.getNumberOfMealsEaten();

    // When
        dog.eat(null);

        Integer expectedFoods = originalFoods + 1;
        Integer actualFoods = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expectedFoods, actualFoods);
    }

    @Test
    public void getIDTest() {
        //Given
        Integer whatever = 5;
        Dog dog = new Dog(null, null, whatever);

        //When
        Integer ans = dog.getId();


        Assert.assertEquals(whatever, ans);


    }

    @Test
    public void inheritanceOfAnimalTest() {
    Dog dog = new Dog( null, null, null);

    Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void inheritanceOfMammalTest() {
        Dog dog = new Dog( null, null, null);

        Assert.assertTrue(dog instanceof Mammal);
    }

}
