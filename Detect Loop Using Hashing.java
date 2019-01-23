

//https://ide.geeksforgeeks.org/4Uk6raOELN

import java.util.HashMap;
import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
class GFG {
    static HashMap<Integer,Node> hm=new HashMap<Integer,Node>();
    static boolean detectLoop(Node head)
    {
        int x=1;
        while(head!=null)
        {
            if(!hm.containsValue(head.next))
            {
              hm.put(x,head);
              x++;
            }
            else
             return true;
             head=head.next;
        }
        return false;
    }
	public static void main (String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		
		head.next.next.next.next=new Node(5);
		head.next.next.next=head.next.next;
		if(detectLoop(head))
		 System.out.println("Loop");
		else
		 System.out.println("Not Loop");
	}
}
