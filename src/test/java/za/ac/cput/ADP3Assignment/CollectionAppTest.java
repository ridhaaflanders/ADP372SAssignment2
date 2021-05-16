package za.ac.cput.ADP3Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import  java.util.*;

/**
 * author: Ridhaa Flanders - 218204191
 * Description: Test cases for Collection
 */
class CollectionAppTest {
    Collection<Dog> cot = new HashSet<>();
    Dog a = new Dog("alice");
    Dog b = new Dog("buster");
    Dog c = new Dog("celine");

    @BeforeEach
    void setUp()
    {
        cot.add(a);
        cot.add(b);
    }

    @Test
    void addTest() // test case for collection add
    {
        cot.add(c);
        assertEquals(3,cot.size());
    }

    @Test
    void removeTest() // test case for collection remove
    {
        cot.remove(a);
        assertEquals(1,cot.size());
    }

    @Test
    void findTest() // test case for collection find
    {
        boolean found = false;
        cot.add(c);
        for (int i = 0; i < cot.size(); i++)
        {
            if(cot.toArray()[i].equals(c))
                {
                    found = true;
                    System.out.println("The dog " + ((Dog) cot.toArray()[i]).getName() + " was found in this list.");
                }
        }
        assertEquals(true,found);
    }

}