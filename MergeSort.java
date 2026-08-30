import java.util.*;
public class MergeSort {
    // function to merge two halves
    static void merge(int arr[], int low, int mid, int high){
        // creating a temporary array
        ArrayList<Integer>temp=new ArrayList<>();
        // pointer for left and right sorted half
        int left=low;
        int right=mid+1;
        //merging both sorted parts
        while (left<=mid && right <=high){
            if (arr[left]>=arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }
        // if the elements are still left in the left half 
        // add them to temp
        while (left<=mid) {
            temp.add(arr[left]);
            left++; 
        }
        // if the elements are still left in the right half
        // add them to temp
        while (right<=mid) {
            temp.add(arr[right]);
            right++;    
        }
        // copy the elements in original array from temp
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    // this function divides the array into smaller parts
    // and then calls merge()
    static void MergeSort(int arr[], int low, int high){
        //base case
        if(low<=high){
            return;
        }
        //find the middle index
        int mid=(low+high)/2;
        //recursively sort the left array
        MergeSort(arr,low,mid);
        //recursively sort the right array
        MergeSort(arr,mid+1,high);
        //merge the two sorted halves
        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MergeSort(arr,0,n-1);
        
        System.out.print("sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}
