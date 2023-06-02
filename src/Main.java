public class Main {
    public static void main(String[] args) {
        int [] result;
        result = shejk(new int[]{13,12,11,10,9,8,7,6,5,4,3,2});
        for (int a:result) {
            System.out.print(" " + a);
        }
    }
    public static int recursion (int m, int n){
        if (m==0) return n+1;
        else if (m>0 && n==0) return recursion(m-1, 1);
        else return recursion(m-1, recursion(m, n-1));
    }
    public static int sumNum(int n){
        if(n<10) return n;
        else return n%10 + sumNum(n/10);
    }
    public static int[] sortArr(int arr []){
        int temp;
        for (int j = 0; j< arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] shejk(int arr[]){
        int temp;
        for (int j = 0; j< arr.length/2; j++) {
            for (int i = j; i < arr.length - 1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            for (int i = j; i < arr.length - 1-j; i++) {
                if (arr[arr.length-2-i] > arr[arr.length-1-i]) {
                    temp = arr[arr.length-1-i];
                    arr[arr.length-1-i] = arr[arr.length-2-i];
                    arr[arr.length-2-i] = temp;
                }
            }
        }
        return arr;
    }
}