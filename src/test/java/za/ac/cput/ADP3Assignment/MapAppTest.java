package za.ac.cput.ADP3Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author: Ridhaa Flanders - 218204191
 * Description: Test cases for Map
 */
class MapAppTest {
    Map<Integer,Dog> dogs = new HashMap<>();
    Dog a = new Dog("alice");
    Dog b = new Dog("buster");
    Dog c = new Dog("celine");

    @BeforeEach
    void setUp()
    {
        dogs.put(0,a);
        dogs.put(1,b);
    }

    @Test
    void  addTest() // test case for map add
    {
        dogs.put(3,c);
        assertEquals(3,dogs.size());
    }

    @Test
    void removeTest() // test case for map remove
    {
        dogs.remove(1);
        assertEquals(1,dogs.size());
    }

    @Test
    void findTest() // test case for map find
    {
        dogs.put(2,c);
        boolean found = false;
        for (int i = 0; i < dogs.size(); i ++)
        {
            if(c.getName().equals(dogs.get(i).getName()))
            {
                found = true;
                System.out.println("The dog " + dogs.get(i).getName() + " was found in this list.");
                break;
            }
        }
        assertEquals(true,found);
    }


}