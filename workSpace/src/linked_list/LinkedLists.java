package linked_list;

public interface LinkedLists {
	public void insert(int data);

	public void insertInto(int position, int data);

	public void deleteByKey(int key);

	public String printList(LinkedList list);

	public LinkedList reorderList(LinkedList list);
}
