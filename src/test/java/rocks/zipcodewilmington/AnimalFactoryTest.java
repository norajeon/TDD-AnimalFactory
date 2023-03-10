package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_creation.AnimalFactory.createCat;


/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        // Given
//        String name = "doggo";
//        Dog dog = new Dog(null, null, null);
//        Date testDate = new Date();
//        dog.setBirthDate(testDate);
//
//        Date expectedDate = new Date();
//
//        AnimalFactory.createDog("doggo", testDate);
//
//        Assert.assertEquals("doggo", name);
//        Assert.assertEquals(expectedDate, testDate);

        String name = "doggy";
        Date date = new Date();

        Dog dog = AnimalFactory.createDog("doggy", date);

        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(date, dog.getBirthDate());

    }


    @Test
    public void createCatTest() {
        // Given
        String name = "catto";
        Cat cat = new Cat(null, null, null);
        Date expectedDate = new Date();
        cat.setBirthDate(expectedDate);

        Date actualDate = new Date();

        AnimalFactory.createCat("catto", expectedDate);

        Assert.assertEquals("catto", name);
        Assert.assertEquals(actualDate, expectedDate);

    }

}
