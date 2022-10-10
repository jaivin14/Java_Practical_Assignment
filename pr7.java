// Name : Savaliya Jaivin P.
// ID : 21CE120

// Write a method public static int readInFile(String line, File file) that returns the
// position number of a line in the file filename or −1 if there is no such line or file.
// Assume that this file contains names of people with a name per line. Names (and
// hence lines) are listed in ascending alphabetical order in the file. We can not find the
// same line twice.

import java.io.*;
import java.util.Scanner;

public class pr7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line to search: ");
        String SearchLine = sc.nextLine();
        sc.close();
        int count = 0;
        try {
            String path = "C:\\AAA Shortcut\\Java programs\\Practical Assignment\\List.txt";
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String line;
            // reading file line by line
            int t_l=0;
            while ((line = br.readLine()) != null) {
                t_l++;
                if (SearchLine.equals(line.toString()))
                    count=t_l;
            }
            if(count<=t_l && count!=0)
            System.out.println("Line number = " + count);
            else
            System.out.println("Line number = -1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}