package lab2;
/**
 * Your Lab1 solution
 * @Author pree.t
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class lab2main {
    // We need to replace comma "," in the csv with "||" 

    public static void main(String args[]) throws IOException {
        Vector<UniData> myUni = new Vector<UniData>();
        System.out.println("Program start!");
       
        
        // Parsing a CSV file into Scanner class constructor  
        String bigFile = "lab2/QS-World-University-Rankings-2017_full.csv";
        String smallFile = "lab2/QS-World-University-Rankings-2017_small.csv";
        Scanner sc = new Scanner(new File(bigFile)); 
         
        sc.useDelimiter(",");   //sets the delimiter pattern  

        // Skip the header 
        sc.nextLine();
        while (sc.hasNextLine()) {  
            UniData u = new UniData(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
            myUni.add(u);
            sc.nextLine();
        }  // end while loop
        
        // Line 14"Nanyang Technological University, Singapore (NTU) Exception in thread "main" java.util.InputMismatchException
        sc.close();  //closes the scanner  

        // let insert new instance
        UniData newUni = new UniData();
        newUni.setCity("Chiang Mai");
        myUni.add(newUni);
        setUniNameToLowercase(myUni);
        printAll(myUni);
        System.out.println("Program terminate properly!");
    } // end main
    public static void printAll(Vector<UniData> ds_uni){   
        for (int i = 0; i < ds_uni.size(); i++) {
            if(ds_uni.get(i) != null)
                System.out.println(ds_uni.get(i).toString());
        }
    }
    public static void setUniNameToLowercase(Vector<UniData> ds_uni){
        
        for (int i = 0; i < ds_uni.size(); i++) {
            if(ds_uni.get(i).getUniName() != null)
                ds_uni.get(i).setUniName((ds_uni.get(i).getUniName().toLowerCase()));
        }
    }
}// end class Main
