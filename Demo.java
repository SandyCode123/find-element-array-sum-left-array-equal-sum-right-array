// Java program to find an element 
// such that sum of right side element 
// is equal to sum of left side 
public class Demo { 
	
	// Function to compute partition 
	static int findElement(int arr[], int size) 
	{ 
		int right_sum = 0, left_sum = 0; 
      
        left_sum=0;
        right_sum=0;
      	int i=-1,j=-1;
        for(i=0,j=size-1;i<j;i++,j--){
          
          left_sum+=arr[i];
          right_sum+=arr[j];
          
          while(left_sum<right_sum && i<j){
        	  i++;
              left_sum+=arr[i];
          }
          while(right_sum<left_sum && i<j){
        	  j--;
              right_sum+=arr[j];
           }
        }
	    if(left_sum==right_sum)
			return arr[i]; 
      	else 
            return -1;
	} 
	
	// Driver 
	public static void main(String args[]) 
	{ 
		int arr[] = {1,2,3,5}; 
		int size = arr.length; 
		System.out.println(findElement(arr, size)); 
	} 
} 
// This code is contributed by Sumit Ghosh 
