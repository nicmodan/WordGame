import java.io.File;
import java.util.Scanner;


public class WordGame {
    public static void main(String[] args)throws Exception{
        System.out.println("in this gussing game you have 10 to guess the name of the movie");
        File file = new File("project1.txt");
        Scanner scanner = new Scanner(file);
        int counte = 0;
        String[] wordline;
        wordline = new String[200];
        wordline[0] = scanner.nextLine();
       while(scanner.hasNextLine()){
           counte++;
           wordline[counte] = scanner.nextLine();
       }

       int randome = (int) (Math.random() * counte ) + 1;
        String d="_";
        String x = wordline[randome];
        int end = x.split("").length;
        String[] g;
        g = new String[end];
        args = new String[end];
        String[] letter;
        int i;
        letter = new String[end];
        for ( i = 0;i<x.length(); i++){
            int j = 1;
            j += i;
            letter[i]= x.substring(i,j);
            args[i] = letter[i];
            g[i]=d;
          //  args[i] = g ;
        }
        System.out.println(" "+ String.join(" ",g));

/**
 *
  */

       Scanner inpute = new Scanner(System.in);
       String[] split;
       split = new String[end];
       String y;
       y = inpute.nextLine();
       int add;
       int z;
       for (int p = 9;p>0;p--){

           System.out.println("you have "+ p +" trials" );
           for (z = 0;z < y.split("").length;z++){
               int v = 1;
               v +=z;
               split[z]= y.substring(z,v);
               for(add = 0;add<x.split("").length;add++){
                   if(split[z].equals(letter[add])){
                       args[add] = split[z];
                       g[add] = args[add];
                   }
                   else{
                       args[add] = d;
                   }
//another if statmen will be here
               }
           }
           String one = String.join(" ",g);
           String two = String.join(" ",letter);
           if (!one.equals(two)) {
               System.out.println(" "+ String.join(" ",g));
           }
           else {
               System.out.println(String.join(" ",g) +" is the name of the movie" );
               System.out.println("you just finished ");
               break;
           }
           y = inpute.nextLine();
       }
    }
}
