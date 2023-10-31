package tester;

import java.util.Scanner;

import core.CircularQueue;


public class QueueTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("enter how many elements you store into queue : ");
			int size = sc.nextInt();
			Double[] arr = new Double[size];
			CircularQueue<Double>queue = new CircularQueue<>(size, arr);
			boolean exit=false;
			while(!exit) {
				System.out.println("Menu driven : \n"
						+ "1)Show the contents of circular queue\r\n"
						+ "2) Enqueue the data in the circular queue\r\n"
						+ "3) Access the data from the circular queue\r\n"
						+ "4)  Check how many elements are there in the circular queue\r\n"
						+ "5) Check to see if the circular queue is full?\r\n"
						+ "6) Check to see if circular queue is empty.\n"
						+ "0)Exit");
				try {
				switch(sc.nextInt()) {
				case 1:queue.display();
					break;
				case 2:System.out.println("enter element");
					queue.enqueue(sc.nextDouble());
					break;
				case 3:System.out.println("removed element is : "+queue.dequeue());
					break;
				case 4:System.out.println("total no. of elements is queue : "+queue.totalElement());
					break;
				case 5:System.out.println("Is queue full : "+queue.isFull());
					break;
				case 6:System.out.println("Is queue empty : "+queue.isEmpty());
					break;
				case 0:System.out.println("Thank you!!!");
				exit=true;
					break;
				}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
