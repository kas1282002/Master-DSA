import java.util.*;
public class leaderboardrank{
    public static int kthlargest(int arr[],int k){
        PriorityQueue<Integer>minheap=new PriorityQueue<>();
        for(int i:arr){
            minheap.offer(i);
            if(minheap.size()>k){
                minheap.poll();
                
            }
        }
        return minheap.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter kth largest ");
        int k=sc.nextInt();
        System.out.println(kthlargest(arr,k));
    }
}