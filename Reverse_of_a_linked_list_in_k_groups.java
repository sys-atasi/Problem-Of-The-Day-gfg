/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        Node prev=null;
        Node cur=node;
        Node next=null;
        int count=0;
        while(cur!=null && count<k)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            count++;
        }//Your code here
        if(node!=null)
        {
            node.next=reverse(next,k);
        }
        return prev;
    }
}
