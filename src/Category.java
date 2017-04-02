/**
 * A class which stores the contents of the Category category in the JSON file.
 * Each Category has a bunch of primitive data such as id and a list of Subcategories
 * that fall under it.
 */
import java.util.*;

public class Category {
    /*Attributes*/
    private String name;
    private String do_app_app_id;
    private String category_type_id;
    private String order;
    private String id;
    private List<Subcategory> Subcategory;
    private String live;
    /*Methods*/
    private Category(){}

    public Category(String name, String order, String c_id, String d_id, String id, String live){
        this.name = name;
        this.order = order;
        this.category_type_id = c_id;
        this.do_app_app_id = d_id;
        this.id = id;
        this.live = live;
        this.Subcategory = new ArrayList<Subcategory>();
    }

    public String getId(){
        return id;
    }

    public List<Subcategory> getSubcategory(){
        return Subcategory;
    }

    public void addToSubcategories(Subcategory sub){Subcategory.add(sub);
    }

    /*This method prints off the category alongside all of its subcategories*/
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name " + name + " ID "+ id + "\n");
        int i = 0;
        for(Subcategory s: Subcategory){
            sb.append("Subcategory " + i + " " + s + "\n");
            i++;
        }
        return sb.toString();
    }

}
