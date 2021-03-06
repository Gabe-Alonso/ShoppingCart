import java.util.*;

//Written by Gabe

//Creates an arraylist that stores items and gives outside access to the items within the catalog,
//along with being able to give the name and size of the catalog
public class Catalog {
    private String name;
    private ArrayList<Item> catalog = new ArrayList<Item>();

    //Builds a catalog with a given name
    public Catalog(String nameP){
        name = nameP;
    }

    //Adds an item to the end of the catalog
    public void add(Item it){
        catalog.add(it);
    }

    //Returns the size of the catalog
    public int size(){
        return catalog.size();
    }

    //Returns the item at a given index within the catalog
    public Item get(int i){
        return catalog.get(i);
    }

    //Returns the name of the catalog
    public String getName(){
        return name;
    }
}
