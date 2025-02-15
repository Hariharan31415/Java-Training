package day21;
class HashTable4{

static final int size = 10;
static final int P = 7;

Integer table[];



public HashTable4() {

table = new Integer[size];

}


int hash2(int data)
{
	return P - data % P;
}

public void insert(int data) {
int index = hashFunc(data);
int i=1;

while(table[index]!=null)
{
	index= (hashFunc(data)+i*hash2(data))%size;
 	i++;
 	if(i>=size)
 	{
 		System.out.println("table full");
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

return table[index] != null && table[index] == data;

}


public void delete(int data) {

int index = hashFunc(data);

if(table[index] != null && table[index] == data){

table[index] = null;

}

}

}


public class task12 {



public static void main(String[] args) {

HashTable4 ht = new HashTable4();



ht.insert(10);

ht.insert(20);
ht.insert(55);

ht.insert(40);

ht.insert(254);



ht.display();






}

}