/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the circular queue using array.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
a. Show the contents of circular queue
b. Enqueue the data in the circular queue
c. Access the data from the circular queue
d. Check how many elements are there in the circular queue.
e. Check to see if the circular queue is full?
f. Check to see if circular queue is empty.
 */

package core;

import javax.management.RuntimeErrorException;

public class CircularQueue<T> {
	private int front;
	private int rear;
	private T[] arr;
	private int size;
	
  public CircularQueue(int size,T[] arr) {
	  this.size = size;
	  this.arr =arr;
	  this.front = this.rear = -1;
  }
  
  public boolean isFull() {
	  return (rear+1) % size == front; 
  }
	
  	public void enqueue (T ele) throws Exception {
  		if(isFull()) {
  			throw new Exception("Queue is full");
  		}
  		if(front < 0) {
  			front++;
  		}
  		rear= (rear+1) % size;
  		arr[rear] = ele; 
  	}
  	
  	public boolean isEmpty() {
  		return rear==-1;
  	}
	 public T dequeue() throws Exception {
		 if(isEmpty()) {
			 throw new Exception("Queue is Empty");
		 }
		 	if(front == rear) {
		 		T ele = arr[rear];
		 		front = rear = -1;
		 		return ele;
		 	}
		 	T ele = arr[front];
		 	front = (front+1) % size;
		 	return ele;
	 }
	 public int totalElement() {
		 if(isEmpty()) {
			 return 0;
		 }
		 return Math.abs(front-rear)+1;  
	 }
	 
	 public void display() {
		 if(isEmpty()) {
			 throw new RuntimeException("Queue is Empty ");
		 }
		 for(int i=front;i<=rear; ) {
			System.out.print(arr[i]+" ");
			i = (i+1) % size;
			
		 }
		 System.out.println();
	 }
}
