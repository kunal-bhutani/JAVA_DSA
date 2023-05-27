/* in it we are creating a linked list
 * a lot of obj of  node  class give a linked list.
 * 2 special thing has to be marked in linked list (1. head 2. tail)
 * case 1 : -> if we had only one node in this case value of both head and tail is equal (head = tail) because both are pointing at a same node and next is pointing to null
 *case 2 : -> in other case the value of the head and tail is stored at the opposit end of the linked list
 *  in main class we can olny call static functions directly , that's why we use static keyword while creating menthod in class
 * but if we use call by obj (in this case call by obj of linked list) no need to write static keyword it dosen't matter whether linked list fuction
 * is static or not
 * 
 * steps include in creation of node if we have more than one node
 * 1.create new node
 * 2.new node's next = head of next node
 * 3. head = new node
 * 
 * if we have no node in starting (which will possible every time when we create a new linked list)
 *1. create a new node
 *2. head = tail of new node
 * 
 * addFirst -> Tm in it is O(1) bcz we know the address where we have to inseret
 * 
 * addLat ->
 * step 1. create new node
 * step 2. # if we have no node
 *                  head = tail = newNode; and return 
 *          # if we have node
 *                  tail.next = newNode;
 *                  tail = newNode;
 * 
 */

public class LinkedList // at the end obj of this class give uus a linked list
{
    public class Node // here we had created a constructor
    {
        int data;
        Node next; // to point next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) // we had not used static because we will call it by obj reference
    {
        // in both case empty or note we had to create a new node
        // step 1. create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2. newNode next = head
        newNode.next = head; // link

        // step 3. head = newNode
        head = newNode;

    }

    public void add(int idx , int data)
    {
        if( idx == 0) // at 0 we hade no node it help in creation
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0 ;
        while(i<idx -1 )
        {
            temp = temp.next;
            i++;
        }

        // i = idx - 1 ; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print()  // Tm is O(n)
    {
        if(head == null)
        {
            System.out.println(" ll is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        ll.addFirst(2);
        // ll.print();

        ll.addFirst(1);
        // ll.print();

        ll.addLast(3);
        // ll.print();

        ll.addLast(4);
        ll.add(4, 5);
        ll.add(5, 6);
        ll.print();


    }

}
