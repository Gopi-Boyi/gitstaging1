/*class Array{
  public static void main(String[] args){
    int num[]={1, 4, 5, 6,};
    for(int i = 0; i<4; i++){
      System.out.println(num[i] + " ");
    }
    
  }
}*/
                  //MULTI DIMENSIONAL ARRAY//
/*class Array{

    public static void main(String[] args){
        int num[][] = new int[5][6];
        for(int i=0; i<5; i++){
            for(int j=0; j<6; j++){
              num[i][j] = (int)(Math.random() * 5);
            }
        }
        for(int i=0; i<5; i++){

          for(int j=0; j<6; j++){
            System.out.print(num[i][j] + " ");
          }
          System.out.println("");
        }


    }
}*/
        //JAGGED ARRAY//
        /*
class Array{
              public static void main (String[] args){
                int num[][]=new int[3][];

                num[0] = new int[4];
                num[1] = new int[3];
                num[2] = new int[2];
                for(int i=0; i<num.length; i++){
                  for(int j=0; j<num[i].length; j++){
                    num[i][j] = (int)(Math.random() * 100);
                    
                  }
                }
                for(int i=0; i<num.length; i++){
                  for(int j=0; j<num[i].length; j++){
                    System.out.print(num[i][j] + " ");
                    
                  }
                    System.out.println("");
              }
            

}}*/

    //ARRAY OBJECTS//
    /*
    
class Student{

          String name;
          int age;
          int marks;
}
class Array{

  public static void main(String[] args){

            Student s1= new Student();
            s1.name = "Rajuu";
            s1.age = 23;
            s1.marks = 88;

            Student s2= new Student();
            s2.name = "Ramuu";
            s2.age = 21;
            s2.marks = 86;

            Student s3= new Student();
            s3.name = "Ravii";
            s3.age = 28;
            s3.marks = 78;
            
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        //for(int i=0; i<students.length;i++){
        //  System.out.println(students[i].name + " " + students[i].age + " " + " " + students[i].marks);
       
        for(Student stud : students)
        {
          System.out.println(stud.name + " : " + stud.age+ " " + stud.marks);
        }
        
  }
}*/

//CONSTRUCTOR
class Person{
           
           String name;
           int age;

         Person(){ //default constructor
           
           this. name = "Gopi";
           this. age = 34;
           
           } 
             Person(String name, int age){ // parameterized constructor
           
              this.name = name;
              this.age = age;
            
           }

           void display(){
            System.out.println("Name :" +  name + " Age :" + age);
           }
           
}
class Array{

          public static void main(String[] args){
           Person obj1 = new Person();
            obj1.display();
            Person obj2 = new Person("Ramu", 23);
            obj2.display();
         
          }
}