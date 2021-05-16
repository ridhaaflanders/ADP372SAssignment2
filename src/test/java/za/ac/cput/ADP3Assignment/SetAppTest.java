package za.ac.cput.ADP3Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author: Ridhaa Flanders - 218204191
 * Description: Test cases for Set
 */

class SetAppTest {
    Set<Dog> dogs = new HashSet<>();
    Dog a = new Dog("alice");
    Dog b = new Dog("buster");
    Dog c = new Dog("celine");

    @BeforeEach
    void setUp()
    {
        dogs.add(a);
        dogs.add(b);
    }

    @Test
    void addTest() // test case for set add
    {
        dogs.add(c);
        assertEquals(3,dogs.size());
    }

    @Test
    void removeTest() // test case for set remove
    {
        dogs.remove(b);
        assertEquals(1,dogs.size());
    }

    @Test
    void findTest() // test case for set find
    {
        boolean found = false;
        dogs.add(c);
        for (int i = 0; i < dogs.size(); i++)
        {
            if(dogs.toArray()[i].equals(c))
            {
                found = true;
                System.out.println("The dog " + ((Dog) dogs.toArray()[i]).getName() + " was found in this list.");
            }
        }
        assertEquals(true,found);
    }

}