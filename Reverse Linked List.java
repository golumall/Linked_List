

//https://ide.geeksforgeeks.org/7rlBr1FbCQ

import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Reverse_Linked_List{
    static Node head;
    static void printList(Node temp)
    {
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static Node reverseList(Node temp)
    {
        Node current=temp,prev=null;
        while(current!=null)
        {
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        head=prev;
        return prev;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Node newNode,temp;
		
		head=new Node(sc.nextInt());
		temp=head;
		for(int i=2;i<=n;i++)
		{
		    newNode=new Node(sc.nextInt());
		    temp.next=newNode;
		    temp=temp.next;
		}
		printList(head);
		System.out.println();
		printList(reverseList(head));
	}
}
