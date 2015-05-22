package algorithm.sort;

public class QuickSort {
    
    private int[] numbers;
    
    public QuickSort(int[] data) {
        this.numbers = data;
    }
    
    public int partition(int start, int end) {
        int base = numbers[start];
      
        while (start < end) {
            while (start < end && numbers[end] >= base) {
                end--;
            }
            numbers[start] = numbers[end];
            while (start < end && numbers[start] <= base) {
                start++;
            }
            numbers[end] = numbers[start];   
        }    
        numbers[start] = base;
        return start;
    }
    
    public void sort(int start, int end) {
        if (start < end) {
            int result = partition(start, end);
            sort(start, result);
            sort(result+1, end);
        }
    }
    
    public static void main(String[] args) {
        int[] data = {23,41,11,24,51,6,41, 1};
        QuickSort qs = new QuickSort(data);
        qs.sort(0, data.length - 1);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            System.out.print(" ");
        }
        
    }
}


