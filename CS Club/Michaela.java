import java.util.*;
import java.io.*;

class Michaela{
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(new File("Michaela.dat"));
        int times = read.nextInt();
        read.nextLine();
        for (int test = 0; test < times; test++)
        {
            String returnString = "";
            String wordString = read.nextLine().toUpperCase();
            for (int letter = 0; letter < wordString.length(); letter++)
            {
                char testLetter = wordString.charAt(letter);
                String morse = "-";
                if (testLetter == ' ')
                    morse += ".....";
                else
                {
                    String binaryString = Integer.toBinaryString(testLetter - 44);
                    binaryString = String.format("%8s", binaryString).replace(' ', '0');
                    System.out.println(binaryString);
                    for (int i = 3; i < binaryString.length(); i++)
                    if (binaryString.charAt(i) == '0')
                        morse += ".";
                    else
                        morse += "-";
                }
                returnString += morse + " ";
            }
            System.out.println(returnString);
        }
        read.close();
    }
}
