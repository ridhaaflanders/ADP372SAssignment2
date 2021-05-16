package za.ac.cput.ADP3Assignment;

/**
 * author: Ridhaa Flanders - 218204191
 * Description: simple object to put into collections
 */

public class Dog {
    private String name;

    public Dog()
    {
        this.name = "";
    }

    public Dog(String dame)
    {
        this.name = dame;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
