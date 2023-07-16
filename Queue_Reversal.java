class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        // int[]arr=new int[q.size()];
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr[i]=q.remove();
        // }
        // for(int i=arr.length-1;i>=0;i--)
        // {
        //     q.add(arr[i]);
        // }
        // return q;
        Stack<Integer>st=new Stack<>();
        while(!q.isEmpty())
        {
            st.push(q.remove());
        }
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }
        return q;
    }
    
}