package day21;
class HashTable{

static final int size = 10;

Integer table[];



public HashTable() {

table = new Integer[size];

}



public void insert(int data) {
int index = hashFunc(data);

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


public class task8 {



public static void main(String[] args) {

HashTable ht = new HashTable();



ht.insert(10);

ht.insert(20);
ht.insert(55);

ht.insert(40);

ht.insert(254);



ht.display();



System.out.println(ht.search(10)); // override by the new value so false

System.out.println(ht.search(40));

System.out.println(ht.search(55));

ht.delete(55);

ht.display();

}

}