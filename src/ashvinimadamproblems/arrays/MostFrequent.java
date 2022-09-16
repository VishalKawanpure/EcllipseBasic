package ashvinimadamproblems.arrays;

public class MostFrequent {
	
	public static void main(String[] args) {
		
		int mostfrequent=0;
		int element=0;
		
		int a[]= { 1,2,3,4,5,2,2,2,2};
		
		
		for(int i=0; i<a.length; i++) {
			
			int count=1;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					count++;
				}
			}
			if(mostfrequent<count) {
				
				mostfrequent=count;
				
				element=a[i];
				
			}
			
			
		}
		System.out.println(element+" >>>>>"+mostfrequent);	
		
	}

}
