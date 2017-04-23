package BinarySearch;

public class BinarySearch {
    private int[] arr;

    public BinarySearch(int[] arr){this.arr = arr;}

    public int search(int target){
        if(arr.length == 0){
            return -1;
        }
        int min = 0;
        int max = arr.length -1;
        int guess;
        while(min <= max){
            guess = (max + min)/2;
            if(arr[guess] == target){
                return guess;
            }else if (arr[guess] < target){
                min = guess + 1;
            }else{
                max = guess - 1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] testArray = new int[]{1,2,3,6,8,10,15,18,20,25};
        BinarySearch testSearch = new BinarySearch(testArray);
        System.out.println(testSearch.search(1));
        System.out.println(testSearch.search(2));
        System.out.println(testSearch.search(3));
        System.out.println(testSearch.search(6));
        System.out.println(testSearch.search(8));
        System.out.println(testSearch.search(10));
        System.out.println(testSearch.search(15));
        System.out.println(testSearch.search(18));
        System.out.println(testSearch.search(20));
        System.out.println(testSearch.search(25));
        System.out.println(testSearch.search(7));
    }


}
