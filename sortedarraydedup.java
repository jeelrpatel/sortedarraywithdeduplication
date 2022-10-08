public class assignment1pt1 {

//using loop-join with O(mn) time complexity to find the intersection of both arrays
	
	public static void main(String[] args) {  
		int [] arr1 = { 1, 5, 6, 6, 9, 9, 9, 11, 11, 21 }; //enter the first array
        int [] arr2 = { 6, 6, 9, 11, 21, 21, 21 }; //enter second array
     
        int i, j;
        i = arr1.length; //length of the first array
        j = arr2.length; //length of the second array 
        
        
        int x; //size declaration
        	if(i < j) {
        		x = i;
        	}
        	else {
        		x = j;
        	}
        	
        int [] finalArray = new int[x]; //new array list
        int temp = 0; 
        int a = 0;
        
        
        for(i=0; i<arr1.length; i++) //use a for loops with O(mn)
        {
        	for(j=0; j<arr2.length; j++)
        	{
        		if(arr1[i]==arr2[j]) { //first array
        			if(arr2[j]!=temp && arr1[i]!= temp) { //element in first array not equal to element in second array
        				finalArray[a] = arr2[j];
        				temp = finalArray[a];
        				a++; //increment
        			}
        		}
      
        		}
        	}
        
        
        for(i=0; i<finalArray.length; i++) { //print new Array
        	if(finalArray[i]>0) {
        		System.out.print(finalArray[i] + " ");
        	}
        }

	}

}
