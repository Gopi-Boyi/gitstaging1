class First{

            public static void main(String[] args){
                StringBuffer str=new StringBuffer("hello\t");
 System.out.println(str);
//string buffer methodss
System.out.println(str.append("how r u"));
System.out.println(str.insert(0,"hi\t")); 
System.out.println(str.delete(3,8)); 
//  System.out.println(str.reverse()); 
System.out.println(str.indexOf("r")); 
           System.out.println(str.charAt(2)); 
System.out.println(str.substring(2)); 
 System.out.println(str.subSequence(5,8));
 }
}
/*
interface Third {

    void making();
    
}
class Second implements Third {

           public void making(){

                System.out.println( " Second will print");
            }
}
class First{
    public static void main(String[] args){
        Second Se = new Second ();
        Se.making();
    }
}*/
class Animal{

        String name;
        int speed;
        Animal(){
            return ;
        String name = "Lion";
        int speed = 400;
                    }

class Dog{

        Dog(String n, int i ){
             String name = n;
           int speed = i;
                    }

}

        void display(){
            System.out.println("Animal name : " + name + " " + " Animal speed : " + speed);
        }
}
class First{
    public static void main (String[] args){
        Animal A1 = new Animal();
        A1.display();
       
    }
}




            


