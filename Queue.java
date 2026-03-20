import java.util.Scanner;
public class Queue {

    int q_size;
    int front;
    int rear;
    int[] queueElements;

    Queue(int size){
        this.q_size = size;
        front = 0;
        rear = -1;
        queueElements = new int[size]; 
    }

    Scanner sc = new Scanner(System.in);

    void enqueue(){
        //before inserting queue, we need to check whether the quesi s full or not 
        if(rear == q_size - 1  ){
            System.out.println("Queue is Overflow!!!!");
            return;
        }

        else{
            System.out.print("Enter an element into Queue: \n");
            int element = sc.nextInt();
            queueElements[++rear] = element;
            System.out.println(element+" Added to the Queue successfully!!!!");

        }
    }

    void deque(){
        if(front > rear){
            System.out.println("Que is underflow!!!");
            return;
        }
        else{
            int removed = queueElements[front++];
            System.out.println(removed +" removed from the  queue sucessfully!!!");
        }
    }

    void peek(){
        if (front > rear){
            System.out.println("Que is undeflow");
        }
        else{
            System.out.println("Top elemment of the queue is : " +queueElements[rear]);

        }
    }

    void front(){
        if(front > rear){
            System.out.println("Queue is underflow!!!!!");
        }
        else{
            System.out.println("Front element of the queue is : "+queueElements[front]);
        }
    }
    void display(){
        if(front > rear){
            System.out.println("Queue is undeflow!!!!");
        }
        else{
            System.out.print("Queue elements are : \n");
            for(int i= front; i<= rear ; i++){
                System.out.println(queueElements[i]);
            }
        }
    }

        // menu
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the size of the queue: ");
        int size  = sc.nextInt();

        Queue q =new Queue(size);

        while(true){
            System.out.println("==========Que Operation==========");
            System.out.println(" 1. Insert \n2. Delete \n3.Pek \n4.Front \n5.Display \n6.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1: q.enqueue();
                break;
                case 2: q.deque();
                break;
                case 3: q.peek();
                break;
                case 4: q.front();
                break;
                case 5: q.display();
                break;
                case 6: System.out.println("Exiting from the QUEUE Operation!!!");
                               sc.close(); 
                               return;
                default: System.out.println("Enter valid choice!!!");


            }
        }
    }
        
}
