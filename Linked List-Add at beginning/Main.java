import java.util.Scanner;

public class Main
{
	Node head;
    class Node
    {
    	int data;
        Node next;

        Node(int n)
        {
        	data=n;
        	next=null;
        }
    }
    
    public void insert_element(int x)
    {
    	Node new_node=new Node(x);
        Node temp = head;
        
        if(head == null)
        {
        	head=new_node;
        }
        else
        {
        	new_node.next = head;
            head = new_node;
        }
    }
    
    public void printlist()
    {
    	Node temp = head;
        while(temp!=null)
        {
        	System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	Main l = new Main();
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
        	int element =sc.nextInt();
            l.insert_element(element);
        }
        l.printlist();
        System.out.print(n+" ");
	}
}
