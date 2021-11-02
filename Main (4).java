/******************************************************************************
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	    public void Arr(){

    		System.out.print("Entre no of strings to concat: ");
    		Scanner sca = new Scanner(System.in);
    		int num = sca.nextInt();
    		String [] arr = new String[num];
    		
            System.out.println("Entre the strings: ");
            for(int i=0; i<num; i++){
    		     
    		     System.out.print("String"+ (i+1) +": ");
    		     arr[i] = sca.next();
    		}
    		System.out.print("\nAfter concatinating the strings: ");
    		for(int j=0; j<num; j++){
    		    String line = arr[j].concat(" ");
       		    System.out.print(line);
    		}
	    }
	    public void sub(){
	        System.out.print("Entre the string: ");
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        for(int i=0; i<str.length(); i++){
	            for(int j=i+1; j<=str.length(); j++){
	                System.out.println(str.substring(i,j));
	            }
	        }
	    }
    	public void cop(){
    	    System.out.print("Entre the string: ");
	        Scanner sca = new Scanner(System.in);
	        String stri = sca.nextLine();
	        System.out.println("Copy of the string: "+ stri);
    	}
        public static void main (String[] args) throws Exception {
            Main m1 = new Main();
            Main m2 = new Main();
            Main m3 = new Main();
            m1.Arr();
            System.out.print("\n\nDo you want to continue ? - press y/n: ");
            Scanner sc1 = new Scanner(System.in);
            String a = sc1.nextLine();
            if(a =="n"){
            }
            else{
                m2.sub();
            }
            System.out.print("\n\nDo you want to continue ? - press y/n: ");
            Scanner sc2 = new Scanner(System.in);
            String b = sc2.nextLine();
            if(b =="n"){
            }
            else{
                m3.cop();
            }
            
            
        }
    }







