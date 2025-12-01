import java.util.*;
import java.io.File;
public class PostFixRunner {
    public static void main(String[] args) throws Exception{
        Scanner file = new Scanner(new File("data.dat"));
        while (file.hasNextLine()) {
            String line = file.nextLine();
            PostFix pf = new PostFix(line);
            System.out.println(pf);
        }
    }
}
