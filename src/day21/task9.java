package day21;

import java.util.LinkedList;
import java.util.LinkedList;

class HashTable1{

 static final int size = 10;

 LinkedList<Integer> table[];

 public HashTable1() {

 table = new LinkedList[size];

 for(int i = 0; i < size; i++) {

  table[i] = new LinkedList();

 }

 }

 public void insert(int data) {

 int index = hashFunc(data);

 table[index].add(data);

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

 return table[index].contains(data);

 }

 public void delete(int data) {

 int index = hashFunc(data);

 table[index].remove((Integer)data);

 }

}

public class task9{

 public static void main(String[] args) {

 HashTable1 ht = new HashTable1();

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