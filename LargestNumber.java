public class LargestNumber {
    public static void main(String[] args) {
        int array []={2,4,9,6,5,2,6};
        int largestno =array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] > largestno){
                largestno= array[i];
            }
        }

        System.out.println("largest no is " + largestno);
        
    }
}
