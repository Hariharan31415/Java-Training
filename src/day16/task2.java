package day16;

class Node1{
	Node1 next;
	int data;
	
	Node1(int data)
	{
		this.data=data;
		next=null;
	}	
}

class CircularList{
	
	Node1 head=null;
	Node1 tail = null;
	
	public void insertAtBeg(int data)
	{
		Node1 nn = new Node1(data);
		if(head==null)
		{
			head=nn;
			tail=nn;
			tail.next=head;
		}
		nn.next=head;
		head=nn;
		tail.next=head;
		
	}
	
	public void insertAtEnd(int data)
	{
		Node1 nn = new Node1(data);
		if(head==null)
		{
			head=nn;
			tail=nn;
			tail.next=head;
		}
		else {
			tail.next=nn;
			nn.next=head;
		}
		
	}
	
	public void traverse() {
		
		if(head==null)
		{
			System.out.println("empty..");
		}
		Node1 temp = head;
		do {
			System.out.println(temp.data+"->");
			temp=temp.next;
		}while(temp!=head);
		
	}
	
	public void delete(int data)
	{
		
		Node1 current = head;
		Node1 pre = null;
		if(head==null)
		{System.out.println("empty");
		return;
		}
		
		if(head.data==data)
		{
			if(head==tail)
			{
				head=tail=null;
			}
			else {
				
				head=head.next;
				tail.next=tail;
			}
			return ;
		}
		
	
		do {
			pre = current;
			current=current.next;
			if(current.data==data)
			{
				pre.next=current.next;
			}
			if(current==tail)
			{
				tail=pre;
				pre.next=head;
			}
			
		}while(current!=tail);
		
	}
	
}

public class task2 {
public static void main(String args[])
{
	CircularList l = new CircularList();
	l.insertAtBeg(18);
	l.insertAtBeg(20);
	l.traverse();
	System.out.println("finished");
	l.insertAtEnd(50);
	l.traverse();
	System.out.println("finished");
	l.delete(50);
	l.traverse();
	System.out.println("fghjk");
	}
}
