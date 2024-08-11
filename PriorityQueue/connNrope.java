import java.util.PriorityQueue;

public class connNrope {

    public static int  conn(int arr[])
    {
        int profit=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }

        while(pq.size()>= 2)
        {
            int p1=pq.remove();
            int p2=pq.remove();

            int s=p1+p2;
            pq.add(s);

            profit+=s;
        }
       return profit;
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,6};
       System.out.print( conn(arr));
    }
    
}
