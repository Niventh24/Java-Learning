public class Ex27_Queue {//implement circular buffer concept to implement queue
    private int size;
    private int [] arr1;
    private int end;
    private int start;
    private int capacity;

    public Ex27_Queue(int capacity){
        this.capacity=capacity;
        arr1=new int[capacity];
        end= -1;
        start=0;
        size=0;
    }
    
    public void enqueue(int a){
        if(capacity==size){//if cap=3 1st enqueue size=1 2nd size =2 and on third size=3  arr size(cap)==size hence array full
            System.out.println("Queue is full!");
        }
        else{
            end=(end+1)%capacity;
            arr1[end]=a;
            size++;
            System.out.println(a+" is enqueued into the queue");
        }
    }
/*Starting of program start=0 size=0 end=-1 and let capacity=3
1st iteration- end=(end+1)%capacity -> (-1+1)%3 ->0%3 ->0 
arr1[0]=a;
size++; -> 0+1-> 1
2nd iteration-start=0 size=1 end=0 and let capacity=3
end=(end+1)%capacity -> (0+1)%3 ->1%3 ->1
arr1[1]=a;
size++; -> 1+1 ->2
3rd iteration-start=0 size=2 end=1 and let capacity=3
end=(end+1)%capacity -> (1+1)%3 ->2%3 ->2
arr1[2]=a;
size++; -> 2+1 ->3
size==cap  3==3  hence queue is full
*/
    public void dequeue(){
        if(size==0){//when elements are addes size is incremented and when removed decremented hence when size==0 queue is empty
            System.out.println("Queue is empty!");
        }else{
            System.out.println(arr1[start]+" is dequeued");
            start=(start+1)%capacity;
            size--;
        }
    }

    public void display(){
        System.out.print("The elements in the Queue are ");
        int index=start;
        for(int i=0;i<size;i++){
            System.out.print(arr1[index]+" ");
            index=(index+1)%capacity;
        }
        System.out.println();
    }
}
