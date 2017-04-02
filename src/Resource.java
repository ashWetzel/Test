/**
 * A class which contains every category of the example JSON file
 * It doesn't have any primitive types itself. Those are in the DoApp,
 * Category, and Debug classes
 */
import java.util.*; //List class

public class Resource {
    /*Attributes*/
    private DoAppApp DoAppApp;
    private List<Category> Category;
    private Debug Debug;
    /*Methods*/
    private Resource() {}

    public Resource(DoAppApp doapp, Debug debug){
        this.DoAppApp = doapp;
        this.Category = new ArrayList<Category>();
        this.Debug = debug;
    }

    public List<Category> getCategory(){
        return Category;
    }

    public void addToCategories(Category c){
        Category.add(c);
    }
}