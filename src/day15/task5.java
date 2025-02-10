package day15;
class Node
{
	
  int data ;
  Node next;
  
  public Node(int data)
  {
	  this.data=data;
	  next=null;

  }
}

class LinkedList{
	
	Node head = null;
	Node tail = null;
	
	
	public void insert(int data)
	{
		Node nn  = new Node(data); 
		if(head==null)
		{
			head=nn;
			tail=nn;
		}
		else {
			tail.next=nn;
			tail=nn;
		}
	}
	
	public void traverse()
	{
		Node  temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	
	}
	
	
	public void insertAtHead(int data)
	{
		Node nn = new Node(data);
		if(head==null)
		{
			head=tail=nn;
		}
		nn.next=head;
		head=nn;
	}
	
	public void insertAtPosition(int data,int pos)
	{
		Node temp = head;
		Node nn = new Node(data);
		if(pos==1)
		{
			insertAtHead(data);
		}
		for(int i=1;i<pos-1 && temp!=null;i++)
		{
			temp=temp.next;
			
		}
		
		nn.next=temp.next;
		temp.next=nn;
		if(nn.next==null)
		{
			tail=nn;
		}
	
	}
	
	public int search(int data)
	{
		Node temp=head;
		int i=0;
		while(temp!=null)
		{
			i++;
			if(temp.data==data)
			{
				System.out.println("search found..");
				return i;
			}
			
			
		}
		return -1;
	}
	
	public void reverse()
	{
		Node current ;
		Node pre = null;
		Node next ;
		current = head;
		
		while(current!=null)
		{
			next=current.next;
			current.next=pre;
			pre=current;	
			current=next;
		}
		
	}
	public void delete(int data)
	{
		Node temp = head;
		Node pre = null;
		while(temp!=null) {
			if(temp.data==data)
			{
				if(pre==null)
				{
					temp=temp.next;
				}
				else {
					pre.next=temp.next;	
				} 
				
				if(temp==tail)
				{
					tail=pre;
					return;
				}
			}
			
			
		}
		
		System.out.println("not found");
		
	}
	
}

public class task5 {
public static void main(String args[])
{
	LinkedList l = new LinkedList();
	l.insert(0);
	l.insert(10);
	l.insert(20);
	l.traverse();
	
	l.insertAtHead(20);
	l.traverse();
	l.insertAtPosition(40,1);
	
}
}
