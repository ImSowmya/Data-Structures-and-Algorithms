package LinkedList;
public class LinkedList
{

    private Node head;
    private Node tail;
    private int size;

    public LinkedList()
    {
        this.size = 0;
    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

    // INSERTION 

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null)
        {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val)
    {
        if (tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertOnIndex(int val, int index)
    {
        if (index == 0)
        {
            insertFirst(val);
            return;
        }
        if (index == size)
        {
            insertLast(val);
            return;
        }
        
        Node temp = head;
        for(int i=1; i<index; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // DELETION

    public void deleteFirst()
    {
        head = head.next;
        if (head == null)
        {
            tail = null;
        }
        size --;
    }

    public void deleteLast()
    {
        if (size <= 1)
        {
            deleteFirst();
            return;
        }
        Node secondLast = get(size-2);
        secondLast.next = null;
        tail = secondLast;
        size --;
    }

    public void deleteOnIndex(int index)
    {
        if (index == 0)
        {
            deleteFirst();;
            return;
        }
        if (index == size-1)
        {
            deleteLast();
            return;
        }
        Node prev = get(index-1);
        prev.next = prev.next.next;
        size--;
    }

    // FIND THE NODE OF VALUE

    public Node find(int value)
    {
        Node temp = head;
        while(temp.next != null)
        {
            if (temp.value == value)
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // GET THE NODE IN INDEX

    public Node get(int index)
    {
        Node temp = head;
        for (int i=0; i<index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    // DISPLAY THE LINKED LIST

    public void display()
    {
        Node i = head;
        while(i != null)
        {
            System.out.print(i.value+" -> ");
            i = i.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) 
    {
        LinkedList l = new LinkedList();

        l.insertFirst(1);
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);

        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(3);
        l.insertLast(4);
        l.insertLast(5);

        l.insertOnIndex(0, 5);
        l.display();

        l.deleteFirst();
        l.display();
        l.deleteLast();
        l.display();
        l.deleteOnIndex(4);
        l.display();
    }
}