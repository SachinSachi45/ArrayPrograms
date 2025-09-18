package impArraypgs;

import java.util.Arrays;

public class CopyArrayElements {
	public static void main(String[] args) {
		int[] ar = {20,40,55,57,30};
		int[] cr = ar.clone();
//		int[] cr =Arrays.copyOf(ar, ar.length);
//		int[] cr =new int[ar.length];
//		for(int i=0;i<ar.length;i++)
//		{
//			cr[i]=ar[i];
//		}
		System.out.println(Arrays.toString(cr));
//	   for(int pr:cr)//for each loop
//		   System.out.print(pr+" ");
	}

}
