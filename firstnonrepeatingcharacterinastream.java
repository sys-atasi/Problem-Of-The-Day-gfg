class Solution
{
    public String FirstNonRepeating(String A)
    {
        StringBuilder ans=new StringBuilder();
        int freq[][]=new int[26][2];
        int n=A.length();
        for(int i=0;i<n;i++)
        {
            char ch=A.charAt(i);
            freq[ch-'a'][0]++;
            freq[ch-'a'][1]=i;
            int res_ch=-1;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<26;j++)
            {
                if(freq[j][0]==1 && min>freq[j][1])
                {
                    min=freq[j][1];
                    res_ch=j;
                }
                
            }
            if(res_ch==-1)
                ans.append("#");
            else
            {
                ans.append((char)(res_ch+'a'));
            }
        }
        return ans.toString();// code here
    }
}