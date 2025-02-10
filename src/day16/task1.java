package day16;

class Node{
	Node pre , next;
	int empNo;
	String name;
	float salary;
	Node(int empNo,float salary,String name)
	{
		this.empNo=empNo;
		this.salary=salary;
		this.name=name;
		pre=next=null;
	}	
}

class DoublyLinkedList
{
	Node head=null;
	Node tail=null;
	public void insert(int empNo,float salary,String name)
	{
		Node nn = new Node(empNo,salary,name);
		if(head==null)
		{
			head=nn;
			tail=nn;
			System.out.println("value inserted");
			return;
		}
		Node temp=head;
		
	     while(temp.next!=null)
	     {
	    	 temp=temp.next;
	     }

    	 temp.next=nn;
    	 nn.pre=temp;
 
    	 System.out.println("insert");
	     
	}
	
	public void traverse()
	{
		Node temp = head;
		if(head==null)
		{
			System.out.println("empty");
			return;
		}
		
		while(temp!=null)
		{
			System.out.println("("+temp.empNo+" "+temp.salary+" "+temp.name+")-->");
			temp=temp.next;
		}

	}
	
	public void insertAtPos(int empNo,float salary,String name,int pos)
	{
	    Node nn = new Node(empNo, salary, name);
        if (pos == 1) { 
            nn.next = head;
            if (head != null) {
                head.pre = nn;
            }
            head = nn;
            if (tail == null) { 
                tail = nn;
            }
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        nn.next = temp.next;
        if (temp.next != null) {
            temp.next.pre = nn;
        }
        temp.next = nn;
        nn.pre = temp;
    }
	
	public void deleteAtbeg()
	{
		if(head==null)
		{System.out.println("empty");}
		System.out.println(head.empNo);
		head=head.next;
		head.pre=null;
	}

	public void deleteAtEnd()
	{
		
		if(head==null)
		{
			System.out.println("empty");
		    return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
			
		}
		System.out.println(temp.empNo);
		temp.pre.next=null;
	}
	
	
	public void deleteAtSpecfic(int empNo)
	{
		Node temp = head;
		while(temp!=null)
		{
			if(temp.empNo==empNo)
			{
				if(temp==head)
				{
					head=temp.next;
				}
				else if(temp.pre.next == temp.next)
				{
					temp.pre.next=temp.next;
				}
				
			}
			
			temp=temp.next;
		}
		System.out.println("element not found...");
		
	}
	
	public void deleteAtPos(int pos)
	{
		if(pos<=0 && head==null)
		{
			System.out.println("invalid");	
		}
		
		Node temp = head;
		for(int i=1; i<pos && temp!=null ; i++ )
		{
			temp=temp.next;
			if(temp==null)
			{
				System.out.println("out of bound");
				return;
				
			}
			if(temp==head) {
				deleteAtbeg();
			}
			else if(temp.next==null)
			{
				deleteAtEnd();
				
			}
			else {
				temp.pre.next=temp.next;
				temp.next.pre=temp.pre;
			}
		}
	}
	
	public boolean search(int empNo)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.empNo==empNo)
			{
				return true;
			}
			
			temp=temp.next;
		}
			return false;
		}
	public void update(int old,int Nval)
	{
		Node temp = head;
		while(temp!=null)
		{
			
			if(temp.empNo==old)
			{
				temp.empNo=Nval;
			}
			temp=temp.next;
		}
		
		System.out.println("element not found");
		
	}
	
	public void searchFromEnd(int empNo)
	{
		Node temp = head;
		if(temp==null)
		{System.out.println("empty");
		return;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		while(temp!=null)
		{
			int pos=1;
			if(temp.empNo==empNo)
			{
				System.out.println("founds at position :"+pos+" "+temp.salary+" "+temp.name);
			}
			temp=temp.pre;
			pos++;
		}
		System.out.println("not found");
	}
	
	public void sort()
	{
		
		if(head==null && head.next==null)
		{
			System.out.println("no sorting");
		}
		Node i,j;
		for(i=head;i.next!=null;i=i.next)
		{
			for(j=i.next;j!=null;j=j.next)
			{
				if(j.salary<i.salary)
				{
					int tempEmp=i.empNo;
					float tempSal = i.salary;
					String tempName = i.name;
					i.empNo=j.empNo;
					i.salary=j.salary;
					i.name=j.name;
					j.empNo=tempEmp;
					j.salary=tempSal;
					j.name=tempName;
					
					
				}
			}
		}
		
	}
	
	public void minMax()
	{
		if(head==null)
		{System.out.println("empty");}
		
			float min=head.salary;
			float max = head.salary;	
			Node temp = head;
			
			while(temp!=null)
			{
				if(temp.salary<min)
				{
					min=temp.salary;
				}
					
					if(temp.salary>max)
					{
						max=temp.salary;
					}
				}
			
			
			
		}
		
		
	public float salarySum()
	{
		float sum=0;
		Node temp = head;
		while(temp!=null)
		{
			sum+=temp.salary;
			temp=temp.next;
		}
		return sum;
		
	}
	
	public void reverse()
	{
	Node temp = null ;
	Node current = head;
	while(current!=null)
	{
		temp = current.pre;
		current.pre=current.next;
		current.next=current;
		current=current.pre;
	}
	
	if(temp!=null)
	{
			
		head=temp.pre;
	}		
	}
}
public class task1 {
public static void main(String args[])
{
	 
	DoublyLinkedList dd = new DoublyLinkedList();
	dd.insert(01,1300,"hari");
	dd.insert(02,1400,"bob");
	dd.insert(03,1500,"haran");
	dd.traverse();
	dd.insertAtPos(4,1244,"hari",3);
	dd.traverse();
	dd.deleteAtbeg();
	dd.traverse();
	dd.deleteAtEnd();
	dd.traverse();
	System.out.println(dd.search(3));
	dd.update(4, 40);
	
	dd.sort();
	
	dd.minMax();
	
	System.out.println(dd.salarySum());
	


}
}
