package day21;
class HashTable3{

	 static final int size = 10;

	 Integer table[];

	 public HashTable3() {

	 table = new Integer[size];

	 }

	 public void insert(int data) {

		 int index = hashFunc(data);
		 int i=1;
		 while(table[index] != null) {

			 index = (hashFunc(data) + i * i) % size;
		  i++;

		  if(i>=size) {

		  System.out.println("Hash Table is Filled");

		  return;

		  }

		 }

		table[index]=data;

		 }



	 public int hashFunc(int data) {

	 return data % size;

	 }

	 public void display() {

	 for(int i = 0; i < size; i++) {

	  System.out.println(i + " --" + table[i]);

	 }

	 }

	 public boolean search(int data) {

	 int index = hashFunc(data);
	 int i=1;
	 while(table[index]!=null)
	 {
		 if(table[index]==data)
		 {
			 return true;
		 }
		 
		 index = (hashFunc(data) + i * i) % size;
	     i++;
	     if(i>=size)
	     {break;}
	     
	 }
	 return false;

	 }
	 

	 public void delete(int data) {

		 int index = hashFunc(data);
		 int i=1;
		 while(table[index]!=null)
		 {
			 if(table[index]==data)
			 {
				 table[index]=null;
				 return;
			 }
			 
			 index = (hashFunc(data) + i * i) % size;
		     i++;
		     if(i>=size)
		     {break;}
		     
		 }
		
	 }

	}

	public class task11 {

	 public static void main(String[] args) {

	 HashTable3 ht = new HashTable3();

	 ht.insert(10);

	 ht.insert(20);

	 ht.insert(55);

	 ht.insert(40);

	 ht.insert(254);

	 ht.display();

	 System.out.println(ht.search(100)); 

	 System.out.println(ht.search(40));

	 System.out.println(ht.search(55));

	 ht.delete(20);
	 ht.delete(55);

	 ht.display();

	 }

	}



























