public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        // Accessing a valid index, avoid out of bound error
        System.out.println(arr[0]); 
        System.out.println(arr[4]);
    }
}