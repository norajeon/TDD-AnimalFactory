package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAddCat() {
        // Given
        String name = "catto";
        Date birthDate = new Date();
        Integer id = 10;
        Cat kitty = new Cat(name, birthDate, id);

        // When
        CatHouse.add(kitty);
        Cat testing = CatHouse.getCatById(id);

        // Then
        Assert.assertEquals(testing, kitty);

    }
    @Test
    public void testRemoveID() {
        // Given
        String name = "kitten";
        Date birthDate = new Date();
        Integer id = 5;
        Integer id2 = 6;
        Cat kitten = new Cat(name, birthDate, id);
        Cat kitster = new Cat(name, birthDate, id2);
        CatHouse.add(kitster);

        // When
        CatHouse.remove(id);
        Cat testing = CatHouse.getCatById(id);

        // Then
        Assert.assertEquals(testing, null);

    }

    @Test
    public void testRemoveCat() {
        // Given
        String name = "kitten";
        Date birthDate = new Date();
        Integer id2 = 7;
        Cat kitster1 = new Cat(name, birthDate, id2);
        CatHouse.add(kitster1);

        // When
        CatHouse.remove(kitster1);
        Cat testing = CatHouse.getCatById(7);

        // Then
        Assert.assertEquals(testing, null);

    }



    @Test
    public void testGetCatByID() {
        //Given
        Integer id = 5;

        Cat kitty = new Cat(null, null, id);

        CatHouse.add(kitty);

        Integer test = 5;
        Cat testingID = CatHouse.getCatById(test);

        Assert.assertEquals(kitty, testingID);

    }

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "meowster";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        Integer kitties = 1;

        // Then
        CatHouse.getNumberOfCats();

        Assert.assertEquals(CatHouse.getNumberOfCats(), kitties);

    }
}






