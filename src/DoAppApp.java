/**
 * A class which stores the contents of the DoAppApp category in the JSON file.
 * It only has primitives for its data types.
 */
public class DoAppApp {
    /*Attributes*/
    private String id;
    private String linkid;
    private String name;
    private String modified;
    /*Methods*/
    private DoAppApp() {}

    public DoAppApp(String id, String linkid, String name, String modified){
        this.id = id;
        this.linkid = linkid;
        this.name = name;
        this.modified = modified;

    }
}
