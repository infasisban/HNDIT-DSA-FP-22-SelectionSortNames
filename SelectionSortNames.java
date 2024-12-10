package infas;
import java.util.Arrays;
public class SelectionSortNames {

	public static void main(String[] args) {
		 String[] names = {"Anna", "Jack", "Bob"};
	        
            selectionSort(names);

	       System.out.println("Sorted Names: " + Arrays.toString(names));
	    }

	    public static void selectionSort(String[] names) {
	        int n = names.length;
	        for (int i = 0; i < n - 1; i++) {
	         
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	             
	                if (names[j].compareTo(names[minIndex]) < 0) {
	                    minIndex = j;
	                }
	            }
	         
	            String temp = names[minIndex];
	            names[minIndex] = names[i];
	            names[i] = temp;
	        }

	}

}
