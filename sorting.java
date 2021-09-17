class main{
    public static void main(String[] args){
        int[] arr =new int[]{5,3,7,2,6,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                int temp = 0;
                if(arr[i]> arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
