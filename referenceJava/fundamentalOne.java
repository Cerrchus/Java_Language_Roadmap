
package referenceJava;


// think of <java.util._____>
// as if there were another method in 
// your code with all the details required to  
// use the imported package that we use when we:
//
// import <import> a package <java.util._____>

import java.util.Scanner;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


/**
 *
 * @author cerrchus
 */


public class fundamentalOne {
static void introToScanner(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("give a length of any INPUT to be stored in variable 'scanned': ");
        String scanned = sc.next();
        
        System.out.println("provide only an INTEGER data type: ");
        int scannedInteger = sc.nextInt();
        
        System.out.println("provide only a BOOLEAN data type response which is to say 'true' or 'false': ");
        boolean scannedBool = sc.nextBoolean();
        
        System.out.println("Strings: ");
        String scannedString = sc.next();
        
        System.out.println("Double: ");
        double scannedDouble = sc.nextDouble();
        
        System.out.println("String scanned = " + scanned + 
                "\n int scannedInteger = " + scannedInteger + 
                "\n boolean scannedBool = " + scannedBool + 
                "\n String scannedString = " + scannedString + 
                "\n double scannedDouble = " + scannedDouble + 
                "\n And so on..");
        
        System.out.println("\n\nConvert newString into an int parseIntString\n");
        System.out.println("""
                           This will store a String and convert 
                           the String data into a value, an Int value
                           
                           String newString = sc.next();
                           int parseIntString = Integer.parseInt(newString);
                           System.out.println(parseIntString);
                           
                           Input an Int:
                           """);
        String newString = sc.next();
        int parseIntString = Integer.parseInt(newString);
        System.out.println(parseIntString);
        
        
        quit();
    }
    
    static void booleanOperatorIntroduction(){
        
        int x = 6;
        int y = 7;
        int z = 10;
        // > < == >= <= !=
        
        boolean compareXtoY;
        compareXtoY = x >= y;
        System.out.println("x: " + x + " y: " + y + " z: " + z);
        System.out.println("boolean compareXtoY;");
        System.out.println("compareXtoY = x >= y;");
        System.out.println("is x greater than or equal to y?  " + compareXtoY);
        
        // can only for this introduction compare Strings with != and ==
        
        String a = "hello";
        String b = "hellO";
        
        boolean compareAtoB;
        compareAtoB = a != b;
        System.out.println("String a = \"hello\";");
        System.out.println("String b = \"hellO\";");
        System.out.println("boolean compareAtoB;");
        System.out.println("compareAtoB = a != b;");
        System.out.println("Is " + a + " equal to " + b + "?  " + compareAtoB);
        
        quit();
    }
    
    static void andOrNOTintroduction(){
        int x = 6;
        int y = 33;
        int z = 90;
        
        boolean compareWithAnd = x > y && z < y;
        System.out.println(compareWithAnd);
        
        boolean compareWithOr = x > y || z < y;
        System.out.println(compareWithOr);
        
        boolean compareWithNot = !(x > y || z < y);
        System.out.println(compareWithNot);
        
        quit();
    }
    
    static void ifElseIfElseIntroduction(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if(s.equals("hola")){
            // start of the 'if block' 
            System.out.println("muy buenas");
        }
        
        else if (s.equals("adios")){
            System.out.println("vaya con dios");
        }
        
        else if (s.equals("damelo")){
            System.out.println("sacalo");
        }
        
        else{
            System.out.println("the else conditional");
        }
        
        quit();
    }
    
    //_________________________________________ Demonstration of skills A_______________________________________
    
    static void simpleAgeProgram(){  
        Scanner sc = new Scanner(System.in);
        
        System.out.println("input age: ");
        String s = sc.nextLine();
        int age = Integer.parseInt(s);
        
        if( age >= 18){
            System.out.println("you are an adult");
            
            System.out.println("do you drink?: ");
            String drinks = sc.nextLine();
            
            if(drinks.equals("yes")){
                System.out.println("Me too");
            }
            
            else{
                System.out.println("That's cool, I enjoy a drink every so often.");
            }
        }
        
        else if(age >= 13){
            System.out.println("you are a teenager");
        }
        
        else{
            System.out.println("you are a kid");
        }
        
        quit();
    }
    
    static void arrayIndroduction(){
        String[] StringArray = new String[5];
        StringArray[0] = "yoyo";
        StringArray[1] = "yoyoyo";
        StringArray[2] = "yoyoyoyo";
        StringArray[3] = "yoyoyoyoyo";
        StringArray[4] = "yoyoyoyoyoyo";
        
        int[] nums = {2,3,54,6,6};
        double[] nums2 = {2.0, 3.0};
        
        System.out.println(nums[4]);
        System.out.println(nums2[0]);
        
        String x = StringArray[4];
        System.out.println(x);
        
        quit();
    }
    
    static void forLoopIntroduction(){
        
        Scanner sc = new Scanner(System.in);
        
        int crumbs = 1;
        int count = 0;
        
        int[] trail = {1,2,5,4,5,6,7,8,5,0,0};
        String[] names = new String[5];
        
        // define an int i to 0,  
        // while i is less than or equal to 10 do this,
        // at the end of each iteration add 1 to the defined int i
        for (int i = 0; i <= 10; i++){
            System.out.println("there were " + crumbs + " crumbs");
            crumbs = crumbs + 1;
            System.out.println("nows there are " + crumbs + " crumbs");
        }
        
        // how to set the number of iterations to the length of an array with .length
        for (int i = 0; i <= trail.length; i++){
            System.out.println("there were " + crumbs + " crumbs");
            crumbs = crumbs + 1;
            System.out.println("nows there are " + crumbs + " crumbs");
        }
        
        // how to find specific values in an array by setting a conditional in the 
        // array and having it compare the iteration number therefore the value 
        // of that index of the array to the thing you want which in this case is 5s
        for (int i = 0; i < trail.length; i++){
            
            if (trail[i] == 5){
                System.out.println("Found 5 at " + i);
            }
            
            else{
                System.out.println("nothing at " + i);
            }
        }
        
        for(int element:trail){
            System.out.println(element + " at index " + count);
            count = count + 1;
        }
       
            
        
        for(int i = 0; i < names.length; i++){
        
            System.out.println("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }
        
        for(String n:names){
            System.out.println(n);
            if(n.equals("hello")){
                break;
            }
        }
        
        quit();
    }
    
    static void whileLoopIntroduction(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int count = 0;
        while(x != 10) {
            System.out.println("Type 10..");
            System.out.println("Type a number: ");
            x = sc.nextInt();
            count++;
        }
        System.out.println("you tried " + count + " times" );
        
        quit();
    }
    
    static void doWhileIntroduction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int x;
        int y = 0;
        
        do{
            System.out.println("Type a number: ");
            x = sc.nextInt();
        } while(x != 10);
        
        do{
            System.out.println(y);
            y += 1;
        }while(y != 10);
        
        quit();
    }
    
    
    //  Notice the related java utilities 
    // (java.util) imports at the top which pertain to the following methods
    static void HASHSETintroduction(){
        
        boolean x;
        
        int y;
        
        Set<Integer> t = new HashSet<Integer>(); // not chronologically ordered set
        t.add(5); // note there is 5 added twice
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-10);
        t.add(6000);
        
        System.out.println(t);
        
        t.remove(5);
        
        System.out.println(t); //removes both 5s
        
        x = t.contains(0);
        y = t.size();
        
        System.out.println("contains 5: " + x + "; size: " + y);
        
        t.clear();
        
        System.out.println(t);
        
        quit();
    }
    
    static void TREESETintroduction(){
        
        boolean x;
        
        int y;
        
        Set<Integer> t = new TreeSet<Integer>(); //appears to chronologize set contents
        t.add(5); // note there is 5 added twice
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-10);
        t.add(6000);
        
        System.out.println(t);
        
        t.remove(5);
        
        System.out.println(t); //removes both 5s
        
        x = t.contains(0);
        y = t.size();
        
        System.out.println("contains 5: " + x + "; size: " + y);
        
        t.clear();
        
        System.out.println(t);
        
        quit();
    }
    
    static void LINKEDHASHSETintroduction(){
        
        boolean x;
        
        int y;
        
        Set<Integer> t = new LinkedHashSet<Integer>(); 
        // appears to set contents by value 
        // 0-9 and then length of value in characters
        
        t.add(5); // note there is 5 added twice
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-10);
        t.add(6000);
        
        System.out.println(t);
        
        t.remove(5);
        
        System.out.println(t); //removes both 5s
        
        x = t.contains(0);
        y = t.size();
        
        System.out.println("contains 5: " + x + "; size: " + y);
        
        t.clear();
        
        System.out.println(t);
        
        quit();
    }
    
    static void ARRAYLISTintroduction(){
        
        boolean x;
        
        int y;
        
        ArrayList<Integer> t = new ArrayList<Integer>(); 
        // appears to set contents by value 
        // 0-9 and then length of value in characters
        
        t.add(5); // note there is 5 added twice
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-10);
        t.add(6000);
        
        System.out.println(t);
        
        t.remove(5);
        t.set(0, 6000);
        t.subList(1,5);
        t.get(4);
        
        System.out.println(t); //removes both 5s
        System.out.println(t.subList(1, 5));
        
        x = t.contains(0);
        y = t.size();
        
        System.out.println("contains 5: " + x + "; size: " + y);
        
        t.clear();
        
        System.out.println(t);
        
        quit();
    }
    
    //  Notice the related java utilities 
    // (java.util) imports at the top which pertain to the following methods
    static void HASHMAPintroduction(){
        
        Map m = new HashMap();
        
        m.put("crumb", 5);
        m.put("miga", 10);
        m.put("flour", 15);
        m.put("harina", 20);
        m.put("buenos dias", "hola");
        m.put(666, 1010011010);
        
        //notice
        m.put(1,1);
        m.put(1, 2);
        
        System.out.println(m);
        System.out.println(m.get("miga"));
        
        //notice
        System.out.println(m.get("hola"));
        
        System.out.println(m.get("buenos dias"));
        System.out.println(m.get(666));
        
        quit();
    }
    
    static void LINKEDHASHMAPintroduction(){
        
        Map m = new LinkedHashMap();
        
        m.put("crumb", 5);
        m.put("miga", 10);
        m.put("flour", 15);
        m.put("harina", 20);
        m.put("buenos dias", "hola");
        m.put(666, 1010011010);
        
        //notice
        m.put(1,1);
        m.put(1, 2);
        
        m.containsValue(666);  // boolean return from function()
        
        boolean x = m.containsKey(5);
        boolean y = m.containsKey("crumb");
        boolean z = !(m.containsKey(5));
        
        
        System.out.println(m);
        System.out.println(m.get("miga"));
        
        //notice
        System.out.println("m.get('hola'): " + m.get("hola"));
        System.out.println("m.get(5): " + m.get(5));
        System.out.println("m.containsKey(5): " + x);
        System.out.println("m.containsKey('crumb'): " + y);
        System.out.println("!(m.containsKey(5)): " + z);
        
        System.out.println(m.get("buenos dias"));
        System.out.println(m.get(666));
        
        System.out.println(m.isEmpty() + " " + m);
        
        m.clear();
        
        System.out.println(m.isEmpty() + " " + m);
        
        quit();
    }
    
    static void TREEMAPintroduction(){  // BROKEN ; will come back and fix it     \M/
                                        //                 , or maybe I won't ª\_(ª-ª)_/ª
        
        Map m = new TreeMap();
        
        m.put("crumb", 5);
        m.put("miga", 10);
        m.put("flour", 15);
        m.put("harina", 20);
        m.put("buenos dias", "hola");
        m.put(666, 1010011010);
        
        //notice
        m.put(1,1);
        m.put(1, 2);
        
        m.containsValue(666);  // boolean return from function()
        
        boolean x = m.containsKey(5);
        boolean y = m.containsKey("crumb");
        boolean z = !(m.containsKey(5));
        
        
        System.out.println(m);
        System.out.println(m.get("miga"));
        
        //notice
        System.out.println("m.get('hola'): " + m.get("hola"));
        System.out.println("m.get(5): " + m.get(5));
        System.out.println("m.containsKey(5): " + x);
        System.out.println("m.containsKey('crumb'): " + y);
        System.out.println("!(m.containsKey(5)): " + z);
        
        System.out.println(m.get("buenos dias"));
        System.out.println(m.get(666));
        
        System.out.println(m.isEmpty() + " " + m);
        
        m.clear();
        
        System.out.println(m.isEmpty() + " " + m);
        
        quit();
    }
    
    //_________________________________________ Demonstration of skills B_______________________________________
    
    static void simpleMapManipulationProgram(){
        
        Map m = new HashMap();
        
        String str = "Hello World welcome to this HashMap Program I made";
        System.out.println(str);
        
        // for each character (spaces are a character) 
        // count the number of appearances of each tyoe of character used
        for(char x:str.toCharArray()){
            if(m.containsKey(x)){
                int old = (int) m.get(x);
                m.put(x, old+1);
            }
            else{
                m.put(x, 1);
            }
        }
        m.remove(' '); // remove spaces (' ')
        System.out.println(m);
        
        System.out.println("note: I removed the spaces");
        
        quit();
    }
    
    static void simpleArrayManipulationProgram(){
        
        int[] x = {0,1,2,3,4,55,6,7,8,9,11,22,33,44,505,66,77,88,99,-999};
        int y = 0;
        
        System.out.println(x);
        
        for(int i:x){
            
            if(y == 19){ 
                //note: the println vs. the print
                System.out.println(i);
            }
            else{
                System.out.print(i + ",");
            }
            y++;
        }
        
        y = y - 20;
        
        Arrays.sort(x,0,20);
        
        for(int i:x){
            
            if(y == 19){ 
                //note: the println vs. the print
                System.out.println(i);
            }
            else{
                System.out.print(i + ",");
            }
            y++;
        }
  
        quit();
    }
    
    public class objectsIntroduction{

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            
            System.out.println("Give me a sentence: ");
            String sentence = sc.next();
             int lengthOfInput = sentence.length();

            String h = "hello";
            int lengthOfH = h.length();
            
            
            
            methodOne(sentence, h, 5);
            
        }

        public static void methodOne(String str,String h, int x){
            
            System.out.println(x);
            
            x = mult2(x);
            
            System.out.println(x);
            
            for(int i = 0; i < x; i++){
                System.out.println(h + ", " + str);
            }
            
            quit();
        }
        
        public static int mult2(int x){
            
            return x * 2;
        }
        
        
    }
    
    public class classCreationIntroduction{
        
        public static void Biblioteca(String[] args){
            int x = 0;
            Libros aBook = new Libros("aBook","aAutor","aGenero",x++);
            Libros bBook = new Libros("bBook","bAutor","bGenero",x++);
            Libros cBook = new Libros("cBook","cAutor","cGenero",x++);
            
            aBook.infoDeLibros();
            bBook.infoDeLibros();
            cBook.infoDeLibros();
            
            
            int a = aBook.getId();
            int b = bBook.getId();
            int c = cBook.getId();
            System.out.println(a + " " + b + " " + c);
            
            
            cBook.setId(0);
            cBook.infoDeLibros();
            
            cBook.setId(1);
            cBook.infoDeLibros();
            
            cBook.setId(1);
            cBook.infoDeLibros();   
            
            quit();
        }
    }
    
    public class inheritanceIntroduction{
        
    }    
    
    static void selector(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What would you like to run? 0 is quit");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch(choice){
            
            case 0:
                quit();
                break;
            case 1:
                System.out.println("You've chosen: Introduction to Scanner");
                System.out.println("Continue? (y/n)");
                String cont1 = sc.nextLine();
                
                if(cont1.equals("y")){
                    introToScanner();
                }
                
                else if(cont1.equals("n")){
                    selector();
                }
                else{
                    quit();
                }
                break;
            case 2:
                System.out.println("You've chosen: Boolean Operator Introduction");
                System.out.println("Continue? (y/n)");
                String cont2 = sc.nextLine();
                
                if(cont2.equals("y")){
                    booleanOperatorIntroduction();
                }
                
                else if(cont2.equals("n")){
                    selector();
                }
                else{
                    quit();
                }
                break;
        }
    }
    
    static void quit(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Continue? (y/n)");
        String string = sc.nextLine();
        
        
        if(string.equals("y")){
            selector();
        }
        
        else{
            
        }
        
    }
    
    public static void main(String[] args){
        //introToScanner();
        //booleanOperatorIntroduction();
        //andOrNOTintroduction();
        //ifElseIfElseIntroduction();
        //simpleAgeProgram();
        //arrayIndroduction();
        //forLoopIntroduction();
        //whileLoopIntroduction();
        //doWhileIntroduction();
        //HASHSETintroduction();
        //TREESETintroduction();
        //LINKEDHASHSETintroduction();
        //ARRAYLISTintroduction();
        //HASHMAPintroduction();
        //LINKEDHASHMAPintroduction();
        //TREEMAPintroduction();________BROKEN
        //simpleMapManipulationProgram();
        //simpleArrayManipulationProgram();
        //objectsIntroduction.main(args);
        //classCreationIntroduction.Biblioteca(args);
        selector();
        
        System.out.println("done");
    }
}
