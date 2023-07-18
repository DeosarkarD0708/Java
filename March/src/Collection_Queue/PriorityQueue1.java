package Collection_Queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	
	public static void main(String[]args) {
		
		PriorityQueue PQ = new PriorityQueue();
		PriorityQueue PQ1 = new PriorityQueue();
		
		
		PQ.add('D');
		PQ.add('T');
		PQ.add('O');
		PQ.add('S');
		
		System.out.println(PQ.offer('K'));
		
		System.out.println(PQ);
		//PQ.offer(null);
		System.out.println(PQ.offer('r'));
		System.out.println(PQ);
		
		//element
		System.out.println(PQ.element());
	//	System.out.println(PQ1.element());//no such element exception
		
		//peek
		System.out.println(PQ.peek());
		System.out.println(PQ1.peek());//null
		
		//remove
		System.out.println(PQ.remove());
		//System.out.println(PQ1.remove());//no such element exception
		System.out.println(PQ);
		
		//poll
		System.out.println(PQ.poll());
		System.out.println(PQ);
		System.out.println(PQ1.poll());//null
		
		for(Object obj : PQ) {
			System.out.println(obj);
		}
			
	}

}
