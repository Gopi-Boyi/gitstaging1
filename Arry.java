/*class Arry{
    public static void main(String[] args){
        int nums[] = new int[4];
        for(int i=0; i<4; i++){
            nums[i]= (int)(Math.random() * 10);
          System.out.print(nums[i] + " ");  
        }
        
    }
}
class Arry{
    public static void main(String[] args){
        int nums[][] = new int[4][5];
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                nums[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
class Arry{
    public static void main(String[] args){
        int nums[][] = new int[3][];
        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[2];

            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums[i].length; j++){
                    nums[i][j] = (int)(Math.random() * 100);
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println(" ");
            }
    }
}*/
class Student{

            String name;
            int marks;
}
class Arry{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "gopi";
        s1.marks = 56;

         Student s2 = new Student();
        s2.name = "ram";
        s2.marks = 46;

         Student s3 = new Student();
        s3.name = "raju";
        s3.marks = 45;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " " + students[i].marks + " "); 
        }
    }
}