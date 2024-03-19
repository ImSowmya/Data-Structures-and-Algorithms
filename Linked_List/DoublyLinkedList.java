public class DoublyLinkedList
{
    Node head;
    
    private class Node
    {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node prev, Node next)
        {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null)
        {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val)
    {
        if (head == null)
        {
            insertFirst(val);
        }
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        Node node = new Node(val);
        node.next = null;
        node.prev = last;
        last.next = node;
    }
    
    public void insertOnIndex(int val, int index)
    {
        if (head == null)
        {
            insertFirst(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i<index; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(val, temp, temp.next);
        temp.next = node;
        if (node.next.prev != null)
        {
            node.next.prev = node;
        }
    }

    public void display()
    {
        Node temp = head;
        // Node last = null;
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            // last = temp;
            temp = temp.next;
        }
        System.out.print("End");
        // System.out.println();
        // while(last != null)
        // {
        //     System.out.print(last.value+" -> ");
        //     last = last.prev;
        // }
        // System.out.print("Start");
    }

    public static void main(String[] args) 
    {
        DoublyLinkedList l = new DoublyLinkedList();

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
    }
}