class Solution {
    public void sortColors(int[] arr) {
        int i=0, j=0, k= arr.length -1, temp;
        while(j <=k){
        if(arr[j] == 0){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
        
        else if(arr[j] == 1){
            j++;
        }
        
        else{
            temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k--;
        }
    }
    }
}