package leetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    	List<Integer> list = new ArrayList();
        double ans = 0;
    	int i=0,j =0;
    	while(i<nums1.length&&j<nums2.length)
    	{
    		if(nums1[i]<nums2[j])
    		{
    			list.add(nums1[i]);
    			i++;
    		}
    		else
    		{
    			list.add(nums2[j]);
    			j++;
    		}
    	}
    	if(list.size()%2==0)
    	{
    		return (list.get(list.size()/2)+list.get(list.size()/2+1))/2;
    	}
    	else return list.get(list.size()/2+1);
    	
    }
	public static void main(String[] args)
	{
		
		findMedianSortedArrays(nums1, nums2)
	}
}
