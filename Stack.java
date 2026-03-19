
import java.util.Scanner;
public class Stack {

    int size;
    int top;
    int[] stackElements;

    // initialization of instance varibales

    Stack ( int size){
        this.size = size ;
        top = -1;
        stackElements = new int[size];

    }
    
    Scanner sc  =new Scanner(System.in);

    //push or insert an leemtnin to stack 

    void push(){
        if(top == size-1){
            System.out.println("Stack is already full!!!! space not available!!!");
                }
            else{

             System.out.println("Enter an elemtn to push into stack: ");
             int element = sc.nextInt();
             stackElements[++top] = element;  
             System.out.println(element + "added successfully into the stack"); 

            }        
    }

    // pop() elemetn from the stack 

    void pop(){
        if(top == -1){
            System.out.println("Stackk is emepty!!!");
        }
        else{
            int removved = stackElements[top--];
            System.out.println(removved+" popped from the stack!!!");
        }

        }
        //top or peek value fof the stack 

        void peek(){
            if (top == -1){
                System.out.println("Stack is emepty!!!");

            }
            else{
                System.out.println("Top of the stack element: "+stackElements[top]);
            }
        }

        //display elements from the stack

        void display(){
            if(top == -1){
                System.out.println("There is no elements in the stack to display!!!");
            }
            else{
                System.out.println("Elements in the stack: ");
                for(int i= top; i>= 0; i--){
                    System.out.println(stackElements[i]);
                }
            }
        }

        public static void main(String[] args) {
            
            Scanner sc  = new Scanner(System.in);

            System.out.println("Enter the size ofthe stack: ");
            int size = sc.nextInt();

            Stack s =new Stack(size);
            
            
            while(true){
                System.out.println("========Stack Operations Menu=========");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. peek");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.println("Enter your choice: ");

                int choice  = sc.nextInt();

                switch(choice){
                    case 1: s.push();
                    break;
                    case 2: s.pop();
                    break;
                    case 3: s.peek();
                    break;
                    case 4: s.display();
                    break;
                    case 5: System.out.println("Exited from the stack operations!!!");
                    return;
                    default : System.out.println("Invlaid choce enetr valid choice!!!!");
                }



            }

        }
    }


