/**
 * Created by clouway on 25.04.16.
 */
public class CatchException {

    public String sum(String a, String b) {
        String result = "";

        try {
            int value = Integer.parseInt(a) + Integer.parseInt(b);

            result = "" + value;

        } catch (NumberFormatException ex) {
            //either a or b is not a number
            result = "Invalid input";


        }
        return result;

    }
}
