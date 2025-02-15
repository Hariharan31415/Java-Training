package day22;

class MaxHeap{
	
	int heap[];
	int size;
	
	public MaxHeap(int capacity)
	{
		heap = new int[capacity];
		size = 0;
	}
	public void heapifyDown(int index)
	{
		int leftchild = 2*index+1;
		int rightchild = 2*index+2;
		int lar = index;
		if(leftchild<size && heap[leftchild]>heap[lar])
		{
			lar=leftchild;
		}
		if(rightchild<size && heap[rightchild]>heap[lar])
		{
			lar=rightchild;
		}
		
		if(lar!=index)
		{
			
			swap(index,lar);
			heapifyDown(lar);
			
		}
		
		
	}
	
	
	public void swap(int index , int lar )
	{
		int temp =heap[index];
		heap[index]=heap[lar];
		heap[lar]=temp;
		
	}
	public void buildHeap(int arr[])
	{
		heap = arr;
		size=arr.length;
		for(int i=(size/2)-1;i>=0;i--)    // heapify down 
		{
			heapifyDown(i);
			
		}
	}
	public void printHeap()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(heap[i]+" ");
		}
	}
	
	public void insert(int val) {
	    if (size == heap.length) {
	        System.out.println("Heap full");
	        return; // Exit to prevent overflow
	    }
	    
	    heap[size] = val; // Insert value at the next available index
	    size++; // Increase the heap size
	    
	    heapifyup(size - 1); // Restore heap property
	}

	public void heapifyup(int index)
	{
		while(index > 0 && heap[index]>heap[index-1]/2)
		{
			swap(index,(index-1)/2);
			index=(index-1)/2;
		}
	}
	
	public void delete() {
		if(size==0)
		{System.out.println("heap if empty");return;}
		heap[0]=heap[size-1];
		size--;
		heapifyDown(0);
		
	}
	
}
public class task1 {
public static void main(String args[])
{

	MaxHeap h = new MaxHeap(10);
	int arr[] = {10,50,30,20,40,60,70,90};  // unsorted array to build a heap 
	h.buildHeap(arr);
	h.printHeap();
	h.insert(100);
	h.printHeap();
	System.out.println("delete");
	h.delete();
	h.printHeap();
	
}
}
