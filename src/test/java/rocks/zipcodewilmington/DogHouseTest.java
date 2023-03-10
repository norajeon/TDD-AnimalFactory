package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `void remove(Dog dog)`


    @Test
    public void testAddDog() {
        // Given
        String name = "doggo";
        Date birthDate = new Date();
        Integer id = 5;
        Dog doggy = new Dog(name, birthDate, id);

        // When
        DogHouse.add(doggy);
        Dog testing = DogHouse.getDogById(id);

        // Then
        Assert.assertEquals(testing, doggy);

    }
    @Test
    public void testRemoveID() {
        // Given
        String name = "doggo";
        Date birthDate = new Date();
        Integer id = 5;
        Integer id2 = 6;
        Dog doggy = new Dog(name, birthDate, id);
        Dog dogster = new Dog(name, birthDate, id2);
        DogHouse.add(dogster);

        // When
        DogHouse.remove(doggy);
        Dog testing = DogHouse.getDogById(id);

        // Then
        Assert.assertEquals(testing, null);

    }

    @Test
    public void testRemoveDog() {
        // Given
        String name = "doggo";
        Date birthDate = new Date();
        Integer id2 = 7;
        Dog dogster1 = new Dog(name, birthDate, id2);
        DogHouse.add(dogster1);

        // When
        DogHouse.remove(dogster1);
        Dog testing = DogHouse.getDogById(7);

        // Then
        Assert.assertEquals(testing, null);

    }



    @Test
    public void testGetDogByID() {
        //Given
        Integer id = 5;

        Dog doggy = new Dog(null, null, id);

        DogHouse.add(doggy);

        Integer test = 5;
        Dog testingID = DogHouse.getDogById(test);

        Assert.assertEquals(doggy, testingID);

    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        Integer doggies = 1;

        // Then
        DogHouse.getNumberOfDogs();

       Assert.assertEquals(DogHouse.getNumberOfDogs(), doggies);

    }
}
