package za.ac.cput.ADP3Assignment;

import java.util.*;

/**
 * author: Ridhaa Flanders - 218204191
 * Description: App designed to demonstrate Java Collection interfaces
 */
public class App 
{
    static Scanner input = new  Scanner(System.in);
    Collection<Dog> dogCollection = new HashSet<>();
    List<Dog> dogList = new ArrayList<>();
    Map<Integer,Dog> dogMap = new HashMap<>();
    Set<Dog> dogSet = new HashSet<>();
    Dog a = new Dog("alice");
    Dog b = new Dog("buster");
    Dog c = new Dog("celine");


    public void addCollection()
    {
        System.out.println("Please enter dog name");
        Dog d = new Dog(input.next());
        dogCollection.add(d);
        System.out.println("Added");
    }

    public void addList()
    {
        System.out.println("Please enter dog name");
        Dog d = new Dog(input.next());
        dogList.add(d);
        System.out.println("Added");
    }

    public void addSet()
    {
        System.out.println("Please enter dog name");
        Dog d = new Dog(input.next());
        dogSet.add(d);
        System.out.println("Added");
    }

    public void addMap()
    {
        System.out.println("Please enter key(integer)");
        int i = input.nextInt();
        System.out.println("Please enter dog name");
        Dog d = new Dog(input.next());
        dogMap.put(i,d);
        System.out.println("Added");
    }

    public void findCollection()
    {
        System.out.println("Please enter dog name: ");
        String name = input.next();
        boolean found = false;
        for (int i = 0; i < dogCollection.size(); i++)
        {
            if(((Dog)dogCollection.toArray()[i]).getName().equals(name))
            {
                found = true;
            }
        }
        if(found)
        {
            System.out.println("The dog " + name + " was found in this list.");
        }
        else
        {
            System.out.println("The dog " + name + " was not found in this list.");
        }
    }

    public void findList()
    {
        System.out.println("Please enter dog name: ");
        String name = input.next();
        boolean found = false;
        for (int i = 0; i < dogList.size(); i ++)
        {
            if(dogList.get(i).getName().equals(name))
            {
                found = true;
            }
        }
        if(found)
        {
            System.out.println("The dog " + name + " was found in this list.");
        }
        else
        {
            System.out.println("The dog " + name + " was not found in this list.");
        }
    }

    public void findSet()
    {
        System.out.println("Please enter dog name: ");
        String name = input.next();
        boolean found = false;
        for (int i = 0; i < dogSet.size(); i++)
        {
            if(((Dog)dogSet.toArray()[i]).getName().equals(name))
            {
                found = true;
            }
        }
        if(found)
        {
            System.out.println("The dog " + name + " was found in this list.");
        }
        else
        {
            System.out.println("The dog " + name + " was not found in this list.");
        }
    }

    public void findMap()
    {
        boolean found = false;
        System.out.println("Please enter Dog");
        String name = input.next();
        for(Dog d: dogMap.values())
        {
            if(d.getName().equals(name))
            {
                found = true;
            }
        }
        if(found)
        {
            System.out.println("The dog " + name + " was found in this list.");
        }
        else
        {
            System.out.println("The dog " + name + " was not found in this list.");
        }
    }

    public void removeCollection()
    {
        System.out.println("Please enter dog name: ");
        String name = input.next();
        boolean found = false;
        for (int i = 0; i < dogCollection.size(); i++)
        {
            if(((Dog)dogCollection.toArray()[i]).getName().equals(name))
            {
                dogCollection.remove(dogCollection.toArray()[i]);
                found = true;
            }
        }
        if(found)
        {
            System.out.println("The dog " + name + " was removed from list.");
        }
        else
        {
            System.out.println("The dog " + name + " was not found in this list.");
        }
    }

    public void removeList()
    {
        System.out.println("Please enter dog name: ");
        String name = input.next();
        boolean found = false;
        for (int i = 0; i < dogList.size(); i ++)
        {
            if(dogList.get(i).getName().equals(name))
            {
                dogList.remove(dogList.get(i));
                found = true;
            }
        }
        if(found)
        {
            System.out.println("The dog " + name + " was removed from list.");
        }
        else
        {
            System.out.println("The dog " + name + " was not found in this list.");
        }
    }

    public void removeMap()
    {
        System.out.println("Please enter key");
        int i  = input.nextInt();
        if(dogMap.containsKey(i))
        {
            dogMap.remove(i);
            System.out.println("The dog with the key " + i + " was removed from this list.");
        }
        else
        {
            System.out.println("The key " + i + " was not found in this list.");
        }
    }

    public void removeSet()
    {
        System.out.println("Please enter dog name: ");
        String name = input.next();
        boolean found = false;
        for (int i = 0; i < dogSet.size(); i++)
        {
            if(((Dog)dogSet.toArray()[i]).getName().equals(name))
            {
                found = true;
                dogSet.remove(dogSet.toArray()[i]);
            }
        }
        if(found)
        {
            System.out.println("The dog " + name + " was removed from list.");
        }
        else
        {
            System.out.println("The dog " + name + " was not found in this list.");
        }
    }

    public int menu()
    {
        System.out.println("\nMenu\n");
        System.out.println("Please Select Option:");
        System.out.println("1: Add to Collection \n"
                + "2: Remove from Collection \n"
                + "3: Find in Collection \n"
                + "4: Add to List \n"
                + "5: Remove from List \n"
                + "6: Find in List \n"
                + "7: Add to Set \n"
                + "8: Remove from Set \n"
                + "9: Find in Set \n"
                + "10: Add to Map \n"
                + "11: Remove from Map \n"
                + "12: Find in Map \n"
                + "13: Display \n"
                + "14: Exit");
        int choice = input.nextInt();
        System.out.print("\n");
        return choice;
    }

    public void menuControl()
    {
        while (true)
        {
           switch (this.menu())
           {
               case 1:
                   this.addCollection();
                   break;

               case 2:
                   this.removeCollection();
                   break;

               case 3:
                   this.findCollection();
                   break;

               case 4:
                   this.addList();
                   break;

               case 5:
                   this.removeList();
                   break;

               case 6:
                   this.findList();
                   break;

               case 7:
                   this.addSet();
                   break;

               case 8:
                   this.removeSet();
                   break;

               case 9:
                   this.findSet();
                   break;

               case 10:
                   this.addMap();
                   break;

               case 11:
                   this.removeMap();
                   break;

               case 12:
                   this.findMap();
                   break;

               case 13:
                   this.display();
                   break;

               case 14:
                   System.out.println("Exiting program");
                   System.exit(0);

               default:
                   System.out.println("Incorrect Value");
           }
        }
    }

    public void display()
    {
        System.out.println("Collection: ");
        for(int i = 0; i < dogCollection.size(); i++)
        {
            System.out.println(((Dog) dogCollection.toArray()[i]).getName());
        }
        System.out.println();

        System.out.println("List: ");
        for(int i = 0; i < dogList.size(); i++)
        {
            System.out.println(dogList.get(i).getName());
        }
        System.out.println();

        System.out.println("Set: ");
        for(int i = 0; i < dogSet.size(); i++)
        {
            System.out.println(((Dog) dogSet.toArray()[i]).getName());
        }
        System.out.println();

        System.out.println("Map: ");
        for(Dog d : dogMap.values())
        {
            System.out.println(d.getName());
        }
        System.out.println();
    }

    public static void main( String[] args )
    {
        App a = new App();
        a.menuControl();
    }
}
