public class Ex23_Student {
    private String name;
    private int rollNo;
    private int[] marks=new int[5];

    public int totalMarks(){
        int sum=0;
        for(int i: marks){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Ex23_Student s1=new Ex23_Student();
        s1.name="Akash";
        s1.rollNo=1;
        s1.marks[0]=98;
        s1.marks[1]=88;
        s1.marks[2]=78;
        s1.marks[3]=87;
        s1.marks[4]=82;
        System.out.println("Name: "+s1.name+" Roll No: "+s1.rollNo+" Total marks: "+s1.totalMarks() );
        Ex23_Student s2=new Ex23_Student();
        s2.name="Bala";
        s2.rollNo=2;
        s2.marks[0]=97;
        s2.marks[1]=84;
        s2.marks[2]=72;
        s2.marks[3]=88;
        s2.marks[4]=81;
        System.out.println("Name: "+s2.name+" Roll No: "+s2.rollNo+" Total marks: "+s2.totalMarks() );
        Ex23_Student s3=new Ex23_Student();
        s3.name="Chandru";
        s3.rollNo=3;
        s3.marks[0]=95;
        s3.marks[1]=84;
        s3.marks[2]=76;
        s3.marks[3]=83;
        s3.marks[4]=83;
        System.out.println("Name: "+s3.name+" Roll No: "+s3.rollNo+" Total marks: "+s3.totalMarks() );
        Ex23_Student s4=new Ex23_Student();
        s4.name="Jeeva";
        s4.rollNo=4;
        s4.marks[0]=68;
        s4.marks[1]=58;
        s4.marks[2]=98;
        s4.marks[3]=57;
        s4.marks[4]=52;
        System.out.println("Name: "+s4.name+" Roll No: "+s4.rollNo+" Total marks: "+s4.totalMarks() );
        Ex23_Student s5=new Ex23_Student();
        s5.name="Nicky";
        s5.rollNo=5;
        s5.marks[0]=98;
        s5.marks[1]=89;
        s5.marks[2]=88;
        s5.marks[3]=89;
        s5.marks[4]=84;
        System.out.println("Name: "+s5.name+" Roll No: "+s5.rollNo+" Total marks: "+s5.totalMarks() );
    }
    
}
