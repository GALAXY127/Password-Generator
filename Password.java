import java.util.Scanner;
public class Password{
    
    public static String generate(int x){
        String temp ="";
        for(int i =0; i<x; i++ ){
              int temp2 = (int)(Math.random() * (127-32)) + 32;  //intervall 32-127
           temp += String.valueOf(((char)temp2));
        }
        return temp;
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of password: ");
        System.out.println(generate(sc.nextInt()));
    }
}