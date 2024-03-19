public class CircularLinkedList 
{
    private Node head;
    private Node tail;

    public CircularLinkedList()
    {
        this.head = null;
        this.tail = null;
    }
    private class Node 
    {
        int value;
        Node next;
        
        public Node(int value)
        {
            this.value = value;
        }
        // public Node (int value, Node next)
        // {
        //     this.value = value;
        //     this.next = next;
        // }
    }    

    public void insertLast(int value)
    {
        Node node = new Node(value);
        if (head == null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void deleteByValue(int value)
    {
        if (head == null)
        {
            return;
        }
        if (head == tail)
        {
            head =  null;
            tail = null;
            return;
        }
        if (head.value == value)
        {
            head = head.next;
            tail.next=head;
            return;
        }
        
        Node temp = head.next;
        Node prev = head;
        do
        {
            if (temp.value == value)
            {
                prev.next = temp.next;
                break;
            }
            else
            {
                prev = temp;
                temp = temp.next;
            }
        }while (prev != head);
    }

    public void display()
    {
        Node temp = head;
        if (temp != null)
        {
            do
            {
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            } while(temp != head);
            System.out.print("END");
        }
    }

    public static void main(String[] args) 
    {
        CircularLinkedList l = new CircularLinkedList();

        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(3);
        l.insertLast(4);
        l.insertLast(5);
        l.display();
        System.out.println();

        l.deleteByValue(1);
        l.display();
        System.out.println();

        l.deleteByValue(5);
        l.display();
        System.out.println();

        l.deleteByValue(3);
        l.display();
    }
}
