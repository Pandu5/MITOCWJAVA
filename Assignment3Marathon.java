public class Assignment3Marathon{
	public static int getFirstIndex(int[] times){
		int fastestTime = times[0];
		int indexFirst = 0;
		/*---------------FILTER BOX---------------*/
		// Filtering the fastest time
		for(int i=0;i<times.length;i++){
			if(times[i]<fastestTime){
				fastestTime=times[i];
				indexFirst=i;
			}
		}
		/*-----------------------------------------*/
		 
		return indexFirst;
	}

	public static int getSecondIndex(int[] times){
		int fastest = times[getFirstIndex(times)];
		int second = times[0];
		int indexSecond = 0;
		if (getFirstIndex(times)==0) {
			second = times[1];
			indexSecond = times[1];
		}
		for(int i=0;i<times.length;i++){
			if(times[i]>fastest&&times[i]<second){
				second = times[i];
				indexSecond = i;
			}
		}
		return indexSecond;
	}

	public static void main(String[] args) {
		// DATA
		String[] names =
		{
			"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
	        "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
	        "Aaron", "Kate"
	    };

		int[] times =
		{
	        341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
	        343, 317, 265
		};
		int firstIndex = getFirstIndex(times);
		int secondIndex = getSecondIndex(times);
		System.out.println("The fastest person was " + names[firstIndex] + " with a time of " + times[firstIndex] + " minutes.");
		System.out.println("The second fastest person was " + names[secondIndex] + " with a time of " + times[secondIndex] + " minutes.");
		
	}
}