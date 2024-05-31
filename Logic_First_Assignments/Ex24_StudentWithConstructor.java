public class Ex24_StudentWithConstructor {
    private String name;
    private int rollNo;
    private int[] marks=new int[5];

    public Ex24_StudentWithConstructor(String name,int rollNo,int[] marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public int totalMarks(){
        int sum=0;
        for(int i: marks){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Ex24_StudentWithConstructor s1=new Ex24_StudentWithConstructor("Akash",1,new int[]{98,88,78,87,82});
        System.out.println("Name: "+s1.name+" Roll No: "+s1.rollNo+" Total marks: "+s1.totalMarks() );

        Ex24_StudentWithConstructor s2=new Ex24_StudentWithConstructor("Bala",2,new int[]{97,84,72,88,81});
        System.out.println("Name: "+s2.name+" Roll No: "+s2.rollNo+" Total marks: "+s2.totalMarks() );

        Ex24_StudentWithConstructor s3=new Ex24_StudentWithConstructor("Chandru",3,new int[]{95,84,76,83,83});
        System.out.println("Name: "+s3.name+" Roll No: "+s3.rollNo+" Total marks: "+s3.totalMarks() );

        Ex24_StudentWithConstructor s4=new Ex24_StudentWithConstructor("Jeeva",4,new int[]{68,58,98,57,52});
        System.out.println("Name: "+s4.name+" Roll No: "+s4.rollNo+" Total marks: "+s4.totalMarks() );

        Ex24_StudentWithConstructor s5=new Ex24_StudentWithConstructor("Nicky",5,new int[]{98,89,88,89,84});
        System.out.println("Name: "+s5.name+" Roll No: "+s5.rollNo+" Total marks: "+s5.totalMarks() );
    }
    
}
