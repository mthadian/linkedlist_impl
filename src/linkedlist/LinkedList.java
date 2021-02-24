
package linkedlist;
class Node{
    int value;
    Node next;  
}
public class LinkedList
{
    Node head;

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        list.addValue(1);
        list.addValue(2);
        list.addValue(3);
        list.addValue(4);
        
        list.insertNewHead(25);
        list.show();
         list.reverseList();
        list.show();
       
    }
    
    void addValue(int value)
    {
        Node node = new Node();
        node.value = value;
        //node.next = null;
        if(head==null)
        {
            head = node;
        }
        else
        {
            //scan from first node up until there is a pointer to null
            Node temporaryNode = head;
            while(temporaryNode.next!=null)
            {
                temporaryNode = temporaryNode.next;
            }
            //after finding pointer to next is null assing it to node
            temporaryNode.next = node;
        }  
    }
    void insertNewHead(int value)
    {
        Node node = new Node();
        node.value = value;
        //create a pointer to head
        node.next=head;
        head = node;
    }
    void show()
    {
        Node node = head;
        while(node.next!=null)
        {
            System.out.print(" "+node.value);
            node = node.next;
        }
        System.out.println(" "+node.value);
    }
    void reverseList()
    {
        Node pointer = head;
        Node previous=null,current = null;
        while(pointer!=null)
        {
            current = pointer;
            pointer = pointer.next;
            //reverse the link
            current.next = previous;
            previous = current;
            head = current;
        }
    }
    
}
