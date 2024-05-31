public class Ex29_StudentWithConstructorOverloading {
    private String name;
    private int rollNo;
    private int[] marks=new int[5];

    public Ex29_StudentWithConstructorOverloading(String name,int rollNo,int[] marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    public Ex29_StudentWithConstructorOverloading(int rollNo,int[] marks){
        this.name="name";
        this.rollNo=rollNo;
        this.marks=marks;
    }
    public Ex29_StudentWithConstructorOverloading(int[] marks){
        this.name="name";
        this.rollNo=-1;
        this.marks=marks;
    }
    public Ex29_StudentWithConstructorOverloading(){
        this.name="name";
        this.rollNo=-1;
        this.marks=new int[5];
    }

    public int totalMarks(){
        int sum=0;
        for(int i: marks){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Ex29_StudentWithConstructorOverloading s1=new Ex29_StudentWithConstructorOverloading("Akash",1,new int[]{98,88,78,87,82});
        System.out.println("Name: "+s1.name+" Roll No: "+s1.rollNo+" Total marks: "+s1.totalMarks() );

        Ex29_StudentWithConstructorOverloading s2=new Ex29_StudentWithConstructorOverloading(2,new int[]{97,84,72,88,81});
        System.out.println("Name: "+s2.name+" Roll No: "+s2.rollNo+" Total marks: "+s2.totalMarks() );

        Ex29_StudentWithConstructorOverloading s3=new Ex29_StudentWithConstructorOverloading(new int[]{95,84,76,83,83});
        System.out.println("Name: "+s3.name+" Roll No: "+s3.rollNo+" Total marks: "+s3.totalMarks() );

        Ex29_StudentWithConstructorOverloading s4=new Ex29_StudentWithConstructorOverloading();
        System.out.println("Name: "+s4.name+" Roll No: "+s4.rollNo+" Total marks: "+s4.totalMarks() );

        Ex29_StudentWithConstructorOverloading s5=new Ex29_StudentWithConstructorOverloading("Nicky",5,new int[]{98,89,88,89,84});
        System.out.println("Name: "+s5.name+" Roll No: "+s5.rollNo+" Total marks: "+s5.totalMarks() );
    }
    
}
