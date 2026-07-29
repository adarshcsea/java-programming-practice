public class movingzeroes_leetcode {
    public static void main(String[]args){
        int[] arr = {0, 1, 0, 2, 0, 3};
        int j = 0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
        int[] newarr = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                continue;
            }
            else{
                newarr[j]=arr[i];
                j++;
            }
        }
        for(int i= 0; i<n; i++){
        System.out.print(newarr[i]);
        }
    }
}
