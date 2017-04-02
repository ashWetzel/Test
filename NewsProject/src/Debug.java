/**
 * A class which stores the contents of the Debug category in the JSON file.
 * It only has primitives for its data types.
 */
public class Debug {
    /*Attributes*/
    private String generated;
    private String server;
    /*Methods*/
    private Debug() {}

    public Debug(String generated, String server){
        this.generated = generated;
        this.server = server;
    }
}
