import java.util.Comparator;
class SelectionShort implements Comparator<Double> {

	@Override
	public int compare(Double arg0, Double arg1) {
		  int diff = Double.compare(arg0, arg1);
		return diff;
	}


}

public class SelecttionSort {
	
static <T> void selectionSort(T[] arr, Comparator<T> c) {
	for(int i=0; i<arr.length-1; i++) {
	  for(int j=i+1; j<arr.length; j++) 
		 {
		 if(c.compare(arr[i], arr[j]) > 0) 
		 {
		    T temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		 }
     }
		
	}
	
		
}


	public static void main(String[] args) {
		
		
		SelectionShort selectionShort = new SelectionShort();
		
		
          Double [] arr= {56.3,65.4,41.4,43.4};
          SelecttionSort.selectionSort(arr,selectionShort);
          
          for(Double ele:arr)
          {
        	  System.out.println(ele);
          }
          
	}

}
