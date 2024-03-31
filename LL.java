public class LL {

    public static void main(String arg[])
    {
        LL list = new LL();
    }

    Node head;
    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
}
