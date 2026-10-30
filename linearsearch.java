public class linearsearch {
    public static int search(int arr[],int key){
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
               return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,3,4,7,9};
        int key=4;
        System.out.println(search(arr,key));
    }
}
