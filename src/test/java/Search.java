import io.appium.java_client.android.AndroidKeyCode;

/**
 * Created by sumanth on 17/10/17.
 */
public class Search extends Test1 {
    private static Search searchinstance;
    public static Search getInstance() {
        if (searchinstance == null) {
            searchinstance = new Search();
        }
        return searchinstance;
    }
    public void searchByName() throws InterruptedException {

    }

}
