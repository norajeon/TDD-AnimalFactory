package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Orzo";

        // When (a dog's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = cat.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat(null, null, null);

        String testingCat = cat.speak();

        // Then
        String meowing = "meow!";
        Assert.assertEquals(meowing, testingCat);
    }

    @Test
    public void birthDateTest() {
        //Given
        Date birthDate = new Date();
        Cat cat = new Cat(null, birthDate, null);

        //When
        cat.setBirthDate(birthDate);
        Date d = cat.getBirthDate();

        //Then
        Assert.assertEquals(birthDate, d);

    }

    @Test
    public void eatFoodTest() {
        //Given
        Cat cat = new Cat(null, null, null);
        Integer currentFoods = cat.getNumberOfMealsEaten();

        // When
        cat.eat(null);


        Integer foodsCount = cat.getNumberOfMealsEaten();
        Assert.assertTrue(foodsCount == (currentFoods + 1));
    }

    @Test
    public void getIDTest() {
        //Given
        Integer whatever = 5;
        Cat cat = new Cat(null, null, whatever);

        //When
        Integer ans = cat.getId();


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
