
public class SeperateChainingHashSymbolTable<Key, Value> {
	
	
	private int m;						// Empty hash table size
	private LinkedList<Key, Value>[] ll;
	
	public SeperateChainingHashSymbolTable() {
		this.m = 5;
		ll = (LinkedList<Key, Value>[]) new LinkedList[m];
		for (int i = 0; i<m; i++) {
			ll[i] = new LinkedList<Key, Value>();
		}
	}
	public SeperateChainingHashSymbolTable(int m) {
		this.m = m;
		ll = (LinkedList<Key, Value>[]) new LinkedList[m];
		for (int i = 0; i<m; i++) {
			ll[i] = new LinkedList<Key, Value>();
		}
	}
	
	private int hash(Key key) {
		return (((MyString)key).hashCode() & 0x7fffffff) % m;
	}
	
	public Value get(Key key) {
		return (Value) ll[hash(key)].get(key);
	}
	
	
	public void put(Key key, Value val) {
		ll[hash(key)].insert(key, val);
	}
	
	
	public void keys() {
		for (int i = 0; i < m; i++) {
			for (Object s : ll[i].keys()) {
				System.out.println(hash((Key) s) + " " + ((MyString)s).printLetter() + " " + get((Key) s));
			}
		}
	}
	
	



	
}


