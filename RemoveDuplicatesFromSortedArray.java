package impArraypgs;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] ar = {1,2,2,3,4,4,5};
		System.out.println(Arrays.toString(ar));
		int x=0;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]!=ar[x])
				x++;
			ar[x]=ar[i];
		}
		int[] br = new int[x+1];
		for(int i=0;i<br.length;i++)
		{
			br[i]=ar[i];
		}
		System.out.println("Duplicates Removed: "+Arrays.toString(br));
	}
}
