public class Continue {
    // Skipping an index using many methods like continue
    // usually works when want to skip an element in between the array
    public static void main(String[] args) {
    int[] arr={1,2,3};
    int skip=1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==skip) continue; // continue jumps to the next iteration
        System.out.println(arr[i]);
    }
}
}