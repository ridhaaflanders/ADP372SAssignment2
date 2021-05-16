package za.ac.cput.ADP3Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import  java.util.*;

/**
 * author: Ridhaa Flanders - 218204191
 * Description: Test cases for List
 */
class ListAppTest {
    List<Dog> dogs = new ArrayList<>();
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
    void addTest() // test case for list add
    {
        dogs.add(c);
        assertEquals(3,dogs.size());
    }

    @Test
    void removeTest() // test case for list remove
    {
        dogs.remove(a);
        assertEquals(1,dogs.size());
    }

    @Test
    void findTest() // test case for list find
    {
        dogs.add(c);
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