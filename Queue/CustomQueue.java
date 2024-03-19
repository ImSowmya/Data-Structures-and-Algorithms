public class CustomQueue 
{
    private int [] data;
    private static final int DEFAULT_SIZE = 4;

    int end = 0;

    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size)
    {
        this.data = new int[size];
    }

    public boolean isFull()
    {
        return end == data.length;
    }
    public boolean isEmpty()
    {
        return end == 0;
    }

    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++)
        {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception
    {
        if (isEmpty()) 
        {
            throw new Exception("Queue is empty");            
        }
        return data[0];
    }

    public void display()
    {
        for (int i = 0; i < end; i++)
        {
            System.out.print(data[i]+" -> ");
        }
        System.out.print("End");
    }

    public static void main(String[] args) throws Exception
    {
        CustomQueue q = new CustomQueue(5);
        q.insert(3);
        q.insert(2);
        q.insert(1);
        q.insert(0);
        q.insert(4);

        q.display();

        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();

        q.display();
    }
}
