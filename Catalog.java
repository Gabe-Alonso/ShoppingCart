import java.util.*;

public class Catalog {
    private String name;
    private ArrayList<Item> catalog = new ArrayList<Item>();

    //
    public Catalog(String nameP){
        name = nameP;
    }

    public void add(Item it){
        catalog.add(it);
    }

    public int size(){
        return catalog.size();
    }

    public Item get(int i){
        return catalog.get(i);
    }

    public String getName(){
        return name;
    }
}
