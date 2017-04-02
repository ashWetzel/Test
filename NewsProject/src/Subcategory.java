/**
 * A class which stores the contents of the Subcategory category in the JSON file.
 * These are nested inside each instance of a Category.
 */
import java.util.*;

public class Subcategory {
    /*Attributes*/
    private String id;
    private String subcategory_type_id;
    private List<String> Device;
    private String order;
    private String metered;
    private String name;
    private String path;
    private String live;


    /*Methods*/
    private Subcategory() {}

    public Subcategory(String id, String name, String s_id, String order, String live, String metered, String path){
        this.id = id;
        this.name = name;
        this.subcategory_type_id = s_id;
        this.order = order;
        this.live = live;
        this.metered = metered;
        this.path = path;
        this.Device = new ArrayList<String>();
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void getDevice(String s){
        Device.add(s);
    }

    @Override
    public String toString(){
        return("Name " + name + " ID " + id);
    }
}
