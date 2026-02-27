public class test5 {

    static void selectionSort(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            int minVal = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minVal]>arr[j]){
                    minVal = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minVal];
            arr[minVal] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,6,5,2,1,3};
        selectionSort(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}