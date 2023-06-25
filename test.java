package misc;



public class main {

	public static void main(String[] args) {
		
		String s = "A deadlock is a situation where a thread is waiting for an object lock that another thread holds, and this\r\n"
				+ "second thread is waiting for an object lock that the first thread holds (or an equivalent situation with several\r\n"
				+ "threads). Since each thread is waiting for the other thread to relinquish a lock, they both remain waiting\r\n"
				+ "forever. The threads are said to be deadlocked.\r\n"
				+ "In order for a deadlock to occur, you must have all four of the following conditions met:\r\n"
				+ "1. Mutual Exclusion: Only one process can access a resource at a given time. (Or, more accurately, there is\r\n"
				+ "limited access to a resource. A deadlock could also occur if a resource has limited quantity.)\r\n"
				+ "2. Hold and Wait: Processes already holding a resource can request additional resources, without relinquishing their current resources.\r\n"
				+ "3. No Preemption: One process cannot forcibly remove another process' resource.\r\n"
				+ "4. Circular Wait: Two or more processes form a circular chain where each process is waiting on another\r\n"
				+ "resource in the chain.\r\n"
				+ "Deadlock prevention entails removing any of the above conditions, but it gets tricky because many of these\r\n"
				+ "conditions are difficult to satisfy. For instance, removing #1 is difficult because many resources can only\r\n"
				+ "be used by one process at a time (e.g., printers). Most deadlock prevention algorithms focus on avoiding\r\n"
				+ "condition #4: circular wait. ";
		Frequency f = new Frequency(s);
		System.out.println(f.get_frequency("deadlock"));//O(n)
		System.out.println(f.get_frequency("circular"));//O(1)
		System.out.println(f.get_frequency("thread"));//O(1)
		
	
		
	
}
	
	
	
}	
