class main{
    public static void main(String[] args){
        
        // in case of no dup
        int count=0;
        int arr[] = new int[]{1,4,5,9,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==9){
                System.out.println(count);
            }
            else{
                count++;
            }
        }
        
        //incase of duplicates
        //case 1
        int count1= 0;
        int arr1[] = new int[]{1,5,5,8,9};
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==5){
                System.out.println(count1);
                break;
            }
            else{
                count1++;
            }
        }
        
        // case 2 (all the occurance)
        int count2= 0;
        int arr2[] = new int[]{1,5,5,8,9};
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==5){
                // count2++;
                System.out.println(count2);
                count2++;
            }
            else{
                count2++;
            }
        }
    }
}

