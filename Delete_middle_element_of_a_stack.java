
//User function Template for Java

/*class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int mid = ((sizeOfStack + 1) / 2) - 1;
        s.remove(mid);
    } 
}
OR
*/

class Solution
{
    public void delete(Stack<Integer>s,int sizeOfStack, int midInd)  
    {
        if(sizeOfStack==0)
            return;
        int el=s.pop();
        delete(s,sizeOfStack-1,midInd);
        if(midInd!=sizeOfStack)
        {
            s.add(el);
        }
    }
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        delete(s,sizeOfStack,(sizeOfStack+1)/2);
    }
        
}