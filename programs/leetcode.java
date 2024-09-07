public class leetcode {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] arr = new int[n];
        
        int xor = 0; // Initialize a variable to keep track of the XOR of all elements
        
        for (int i = 0; i < n; i++) {
            xor ^= pref[i];
            arr[i] = xor; // Set the current element in arr to the current XOR value
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] pref = {5, 2, 0, 3, 1};
        
        int[] arr = findArray(pref);

        for (int i = 0; i < pref.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
