
public class Ex25_Stack {
    private int size;
    private int [] arr1;
    private int tos;

    public Ex25_Stack(int size){
        this.size=size;
        arr1=new int[size];
        tos= -1;
    }
    
    public void push(int a){
        if(tos==size-1){
            System.out.println("Stack is full!");
        }
        else{
            arr1[++tos]=a;
            System.out.println(a+" is pushed into the stack");
        }
    }

    public void pop(){
        if(tos>=0){
            System.out.println(arr1[tos--]+" is popped");
            arr1[tos+1]=0;
        }else{
            System.out.println("Stack is empty!");
        }
    }

    public void display(){
        System.out.print("The elements in the stack are ");
        for(int i:arr1){
            if(i!=0){
            System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}