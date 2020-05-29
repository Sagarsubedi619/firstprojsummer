import java.util.Scanner;

public class firstprojsummer {


    /*public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a =input.nextInt();

        System.out.println("Please enter b number: ");
        int b =input.nextInt();

        int total=a+b;
        System.out.println("total is "+ total);










    }*/

   /* public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.println("Please enter number ");
      int num= input.nextInt();
      for(int i=1;i<11;i++){
         int mul=num*i;
         System.out.println(num+ "x"+i +" = "+ mul);
      }


    }*/


    public static void main(String[] args) {

        /*String name = "Sagar";
        *//*
        char init = name.charAt(0);
        System.out.println(init);*//*

        Scanner input=new Scanner(System.in);
        System.out.println("Please eneter name");
        name=input.nextLine();
        System.out.println(name);
*/

        System.out.println("Fortune teller");

        Scanner input=new Scanner(System.in);
        System.out.println("Please pick number between 1 and 10 ");
        int choice=input.nextInt();
        if(choice<5){
            System.out.println("Enjoy the Good luck a friend brings you");
        }
        else{
            System.out.println("Your shoe selection will make you happy today");
        }



    }
}















