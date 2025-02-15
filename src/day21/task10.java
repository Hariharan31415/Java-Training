package day21;
class HashTable2{

	 static final int size = 10;

	 Integer table[];

	 public HashTable2() {

	 table = new Integer[size];

	 }

	 public void insert(int data) {

		 int index = hashFunc(data);

		 int originalIndex = index;

		 while(table[index] != null) {

		  index = (index + 1) % size;

		  if(index == originalIndex) {

		  System.out.println("Hash Table is Filled");

		  return;

		  }

		 }

		 table[index] = data;

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
	 int org = index;
	 while(table[index]!=null)
	 {
		 if(table[index]==data)
		 {
			 return true ;
		 }
		 index = (index+1) %size;
		 if(index==org)
		 {break;}
	 }
	 

	 return false;

	 }
	 

	 public void delete(int data) {

	 int index = hashFunc(data);
	 int org = index;
	 while(table[index]!=null)
	 {
		 if(table[index] ==data)
		 {
			 table[index]=null;
		 }
		 index = (index+1)%size;
		 if(org==index)
		 {break;}
	 }




	 }

	}

	public class task10 {

	 public static void main(String[] args) {

	 HashTable2 ht = new HashTable2();

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

	 ht.display();

	 }

	}



























