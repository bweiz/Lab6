

public class LinkedList<Key, Value> {
	
	public Node<Key, Value> head;
	public Node<Key, Value> cur;
	public int size;
	
	public static class Node<Key, Value> {
		public Key key;
		public Value value;
		public Node<Key, Value> next;
		
		public Node(Key key, Value val) {
			this.key = key;
			this.value = val;
			this.next = null;
		}
	}
	
	public LinkedList() {
		head = null;
		cur = head;
	}
	
	public Value getCurData() {
		if (cur != null) {
			return cur.value;
		} else {
			return null;
		}
	}
	
	public boolean nextData() {
		if (cur != null) {
			cur = cur.next;
		} 
		return (cur != null); // no next data, at end of list
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insert(Key key, Value val) {
		Node<Key, Value> oldhead = head;
		head = new Node<Key, Value>(key, val);
		head.next = oldhead;
		cur = head;
		size++;
	}
	
	public Value get(Key key) {
		Node<Key, Value> var = head;
		if (head.key == key) {
			return var.value;
		} while (var.next.next != null && var.next != key) {
			var = var.next;
		} return var.value;
	}
	
	
	public void printListDataType(LinkedList<Key, Value> list) {
		list.GoToHead();
		if (list.cur.key.getClass() == Double.class) {
			System.out.println("The data type of the data in this linked list is Double");
		} else if (list.cur.key.getClass() == String.class) {
			System.out.println("The data type of the data in this linked list is String");

		}
	}
	public void delete() {
		head = head.next;
		cur = head;
		size--;
	}
	
	public boolean atEndOfList() {
		if (cur == null) {
			return true;
		} else {
			return false;
		}
	} 
	
	public void GoToHead() {
		cur = head;
	}

	public Key[] keys() {
		Object[] keys = new Object[size];
		Node x = head;
		for(int i = 0; i<size; i++) {										// Create array of keys unordered
			keys[i] = x.key;
			x = x.next;
		}
		return (Key[]) keys;														// Return ordered array
	}
	

	
}