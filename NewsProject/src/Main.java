/**
 * This contains a main method used for testing the project.
 * It brings out the original JSON file and converts it using functions
 * from the GSON library.
 */
/*Assumptions made:
* Computers that are running this program have Gson installed*/
import com.google.gson.Gson;
import java.util.*;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;


public class Main {
    public static void main(String [] args) throws Exception {
        //Practice version: Convert something to the file's JSON format
        /*Subcategory s = new Subcategory(1122, "subcategory one", 1, 1, 1, 1, "/");
        Subcategory s2 = new Subcategory(1122, "subcategory two", 1, 1, 1, 1, "/");
        Category c = new Category("category", 1, 1, 0, 1123, 1);
        c.addToSubcategory(s);
        c.addToSubcategory(s2);
        DoAppApp doApp = new DoAppApp(42, 612, "doapp", "never");
        Debug deb = new Debug("generated", "server");
        Resource r = new Resource(doApp, deb);
        r.addToCategory(c);
        Gson gson = new Gson();
        System.out.println(gson.toJson(r));*/


        /*1.Download JSON file from a website and convert into an object of the Resource class*/
        String jsonData = "";
        String line = "";
        Gson gson = new Gson();
        //Code from: https://stackoverflow.com/questions/7467568/parsing-json-from-url
        URL url = new URL("http://content.mobilelocalnews.com/2284/4000/content.gz");
        InputStreamReader reader = new InputStreamReader(url.openStream(), Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(reader);
        //Error: com.google.gson.JsonSyntaxException: java.lang.IllegalStateException:
        //Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $
        Resource newResource = gson.fromJson(br,Resource.class);
        List<Category> categories = (ArrayList) newResource.getCategory();
        //This for loop tests and sees what the category list outputs. This is based on its custom toString method
       /*for(int i = 0; i < categories.size(); i++){
            System.out.println(categories.get(i).toString());
        }*/
        /*2. Get a list of all of the subcategories. These will be represented by strings that
        * contain their name, last letter of their name, id, and category id*/
        /*2.1. Create a new list of Strings called "Subcategory list". This array will have
        * List<String[]> subcategories = new ArrayList<String>();
        * 2.2. Go through every category in the Resource object's list of categories
        *
        * for(int i = 0; i < categories.size(); i++){
        * //Get current category id so that all subcategory strings know their category id
        * int categoryID = categories.get(i).getID();
        * List<Subcategory> currSubcategories = categories.get(i).getSubcategory();
        *
        * 2.3. Go through every subcategory in the current category's list of subcategories
        * for(int j = 0; j < currSubcategories.size(); j++){
        * String currName = currSubcategories.get(j).getName();
        * String currID = currSubcategories.get(j)
        * //Convert the subcategory strings into an array with every necessary parameter inside
        * //Name = currElement[0], ID = currElement[1], categoryID = currElement[2]
        * String[3] currElement = {currName, currID, categoryID};
        * subcategories.add(currElement);
        * }
        * }
        * */

        /*3. Sort this list by the last letter of each subcategory's name. Change into a string and output the contents.
        * 3.1 Sort. This is from https://stackoverflow.com/questions/4699807/sort-arraylist-of-array-in-java
        *
        *  Collections.sort(subcategories,new Comparator<String[]>() {
            public int compare(String[] strings, String[] otherStrings) {
                //Compares the last letter (subcategories[1]) of the name with other last letters
                return strings[1].compareTo(otherStrings[1]);
            }
             });
        * 3.2 Print out the specified contents.
        *
        * System.out.println("Subcategories" + "\n");
        * for(int i = 0; i < subcategories.size(); i++){
        *  String[3] currElement = subcategories.get(i);
        *  String currString = convertToString(currElement[0], currElement[1], currElement[2]);
        *  System.out.println(currString + "\n");
        *  }*/
    }

    public String convertToString(String name, String id, String c_id){
        String newString = name + " (last letter: " + name.charAt(name.length()-1) + " , id:" + id + " , category id: " + c_id + ")";
        return newString;
    }
}

