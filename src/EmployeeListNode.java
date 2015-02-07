/**
 * One object of class stores a node that holds the pointers to data and the
 * next node.
 */
class EmployeeListNode implements Cloneable {
	private Employee data; // Holds whatever data is in each node
	private EmployeeListNode next; // Holds the reference to the next node
									// in the List
	/**
	 * returns data pointer
	 */
	Employee getData() {
		return data;
	}

	/**
	 * setter for data pointer
	 */
	void setData(Employee newData) {
		data = newData;
	}

	/**
	 * returns the pointer to the next node
	 */
	EmployeeListNode getNext() {
		return next;
	}

	/**
	 * sets the next node pointer
	 */
	void setNext(EmployeeListNode newNext) {
		next = newNext;
	}

	/**
	 * Constructs a new EmployeeListNode object that refers to "d". "d" can be
	 * any class of Object
	 */
	public EmployeeListNode(Employee d) {
		data = d;
		next = null;
	}

	/**
	 * Constructs a new EmployeeListNode object that refers to "d" as its data
	 * and refers to "n" as its next one in the List.
	 */
	public EmployeeListNode(Employee d, EmployeeListNode n) {
		data = d;
		next = n;
	}

	/**
	 * returns the data in this EmployeeListNode, in String format
	 */
	@Override
	public String toString() {
		return data.toString();
	}
	
	/**
	 * Constructs a cloned deep copy of a EmployeeListNode
	 */
	public Object clone() {
		EmployeeListNode copy;
		try {
			copy = (EmployeeListNode)super.clone();
			copy.setData((Employee)data.clone());
			if ( next != null){
				copy.setNext((EmployeeListNode)next.clone());
			}
		} catch (CloneNotSupportedException e) {
			copy = null;
		}
		return copy;
	}
}
