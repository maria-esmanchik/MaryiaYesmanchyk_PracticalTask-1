import java.util.Arrays;

public class app {

	public static void main(String[] args) {
		int[] trip_miles = {100, 390, 500, 30, 732, 15, 93, 138};
		Car mycar = new Car();	
		mycar.power_reserve = 380;
		mycar.start();
		Car car = new Car("Tesla");
		car.power_reserve = 260;
		car.pessengerAmount(5);
		car.start();
		car.isEnoughFuel(785);
		car.voluemFuel();		
				
		int max_p_r;
		max_p_r = (mycar.power_reserve > car.power_reserve) ? mycar.power_reserve : car.power_reserve; 
		System.out.println("It's max power reserve for car " + max_p_r);
		
		for(int i = 0; i < trip_miles.length; i++) {
			System.out.print(trip_miles[i] + ", ");
		}
		
		System.out.println();
		Arrays.sort(trip_miles);
		System.out.print(Arrays.toString(trip_miles) + "\n");	
		
		mergeSort(trip_miles);
		
		for(int element : trip_miles) {
			System.out.print(element + ", ");
		}
	}	
	
	public static int[] mergeSort(int[] arr) {	        
        if (arr.length <= 1) {
            return arr;
        }
 	        
        int[] first = new int[arr.length / 2];
        int[] second = new int[arr.length - first.length];	        
        System.arraycopy(arr, 0, first, 0, first.length);
        System.arraycopy(arr, first.length, second, 0, second.length);
 	        
        mergeSort(first);
        mergeSort(second);
 
        merge(first, second, arr);
        return arr;
    }
	
	private static void merge(int[] first, int[] second, int[] result) {       
        int iFirst = 0;         
        int iSecond = 0;       
        int iMerged = 0; 
       
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[iMerged] = first[iFirst];
                iFirst++;
            } else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }        
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }
}
