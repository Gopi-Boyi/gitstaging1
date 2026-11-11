//class Hello{

        /*public static void main(String args[]) {
        
            System.out.println("Krishna");

        }*/


// Recursive fibonacci method

    /*   public static int Rec(int n ){
        if(n<=1){
            return n;
        }
            return Rec(n-1) + Rec(n-2);

       }
       public static void main (String args[]){

            int j = 5;
            for (int i=0; i<j; i++){
                System.out.println(Rec(i)+ "");
            }*/

           
           /* public static void main ( String[] args){
                int i = 10;
                System.out.println(i++);
                 System.out.println(++i);
                  System.out.println(i--);
                   System.out.println(--i);*/


 // Left Shift                   
           /* public static void main ( String[] args){

                System.out.println(10<<2);
                System.out.println(10<<3);
                System.out.println(10<<4);
                System.out.println(10<<5);
                System.out.println(10<<6);

            }*/

  //Right Shift         
            /* public static void main ( String[] args){

                System.out.println(10>>2);
                System.out.println(10>>3);
                System.out.println(10<<4);
                System.out.println(10<<5);
                System.out.println(10<<6);
             }  */
// Relational 

              /*  public static void main (String[] args){

                  int a = 10;
                  int b = 20;

                    System.out.println("a>b:"+ (a<b));

                }*/

//Bitwise operators

                  /*  public static void main (String[] args){
                        int a = 3;
                        int b = 6;
                        int c = 4;
                        System.out.println(a<b&a>c);

                    }*/
//Bitwise or operator

        // GETTING ODD NUMBERS//

/*class Hello{
    public static void main(String[] args){
        int num = 20;
        for(int i=1; i<=20; i++){
             if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}*/

// SCANNER IN JAVA //TAKING INPUT FORM USER


/*import java.util.Scanner;
class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Your age : ");
        int  num = sc.nextInt();
        System.out.print("Enter Your salary : ");
        double  salary = sc.nextDouble();
        sc.close();
    }
}*/

// COMMAND LINE  ARUGUMENTS //

/*class Hello{
    public static void main(String[] arg){
        double x = Double.parseDouble(arg[0]);
        double y = Double.parseDouble(arg[1]);
         double result = x+y;
        System.out.println(result);

    }
} */

//CONCATENATING THE VALUES//
/*
class Hello{
    public static void main(String[] args){
        String name = "Ramm";
        String naem = "Santhu";
        String no = "Chamduu";
        System.out.println(String.valueOf(name) + String.valueOf(naem) + String.valueOf(no));
    }
}   

class Hello{
    public static void main(String[] args){
        int x = 2;
        int y = 3;
        System.out.println(String.valueOf(x) + String.valueOf(y));
    }
}  
*/

 //SWAPING //

 /*
class Hello{
    public static void main (String[] args){
        int a = 5;
        int b = 9;
        System.out.println("Before swaping : " + "a : " + a + " b : "+ b);
         a=a+b-(b=a);
       // int temp = a;
       // a = b;
        //b = temp;
        System.out.println("After swaping :" + "a : " + a + " b : "+ b);


    }
}
*/
class Hello{
    public static void main(String[] args){

   final int n = 23;
    n = 25;
    System.out.println(n);
}
}