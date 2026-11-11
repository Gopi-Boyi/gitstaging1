/*class Car{
                String name;
                int speed;

              Car(String name, int speed) {

                  this.name = name;
                   this.speed = speed;

              } 
              void starting(){
                System.out.println("Car name: " + name );
                System.out.println("Car speed: " + speed);
              }

}
public class Oops{

                public static void main(String[] args){
                    Car c1 = new Car("BMW", 200);
                    
                    
                    c1.starting();
                }


}
/*class Parent{

              int a = 190;
              

}

class Child extends Parent{

              int a = 200;

           void display() {  
          System.out.println("The value : " + super.a ); 
          System.out.println("The value : " + a );
          
           }
}

class Oops{
      
         public static void main(String[] args){

          Child ok  = new Child();
          ok.display();

         }
        
}   */
// METHOD OVERLOADING //
/*
class Calculator{

            int add(int a, int b, int c){
             return a + b + c;
            }
             
            int add(int d, int e){
              return d+e;
            }
            double add(double a, double b){
              return a+b;
            }
            float add(float g, float h, float j){
              return g+h+j;
            }
}
class Oops
{
  public static void main (String[] args ){

    Calculator cal = new Calculator();
    System.out.println(cal.add(34, 465, 464));
    System.out.println(cal.add(348, 998));
    System.out.println(cal.add(3.463, 4.54764));
    System.out.println(cal.add(3.4f, 4.65f, 4.64f));
  } 
}*/
//SINGLE ARRAY//
/*class Oops{

        public static void main(String[] args){

          int num[] = {5, 6, 8, 9};
          for(int i=0; i<4; i++)
          {
            System.out.println(num[i]);
          }
          System.out.println(num[3]);

        }

}*/
// multidimensional array//
/*
class Oops{

      public static void main(String[] args){

        int num[][] = new int[4][5];

         for(int i=0; i<4; i++){

          for(int j=0; j<5; j++){
              num[i][j] = (int)(Math.random() * 10);

          }
          }
        for(int i=0; i<4; i++){
          for(int j=0; j<5; j++){

            System.out.print(num[i][j] + " ");
          }
          System.out.println();
        }
      }
}*/ 
        // Encapulation//
/*class Encap{

         private String name;
          private String password;

           public String getName(){

            return name;
          }

          void setName(String name){

            this.name = name;
          }

          public String getPassword(){

            return password;
          }

          void setPassword(String password){

            this.password = password;
          }
  
}
class Oops{

          public static void main (String[] args){
          
          Encap obj = new Encap();
          obj.setName("gopi");
          obj.setPassword("917793");

            System.out.print(obj.getName()+ " : " + obj.getPassword());



          }
}*/
class Oops{

  public static void main (String[] args){

    int num[][] =  new int[4][];
    num[0] = new int [5];
    num[0] = new int [4];
    num[0] = new int [3];
    num[0] = new int [2];
    
    for(int i=0; i<num.length; i++){
      for(int j=0; j<num[i].length; j++){
        num[i][j] = (int)(Math.random() * 10);
        
      }
      
    }
      for(int i=0; i<num.length; i++){
                  for(int j=0; j<num[i].length; j++){
                    System.out.print(num[i][j] + " ");
                    
                  }
                    System.out.println("");
    
  }
}
}












