package leetCodeSolution;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoSumSolution {

	public static int[] twoSum(int[] nums, int target) {
        //先插入哈希表
        Hashtable hash=new Hashtable(nums.length,(float)0.8);
        HashMap<Integer,Integer> map = new HashMap();
        int resultnum[] = null;
        for(int i=0;i<nums.length;i++)
        {
        	map.put(i, nums[i]);
            hash.put(nums[i]%nums.length,nums[i]);
        }
        
        //按序查找
        int j = 0;
        while(j!=nums.length)
        {
        	if(nums[j]<target)
        	{
        		int num = target - nums[j];
        		if(!hash.containsKey(num%nums.length))
        		{
        			j++;
        			continue;
        		}
        		else 
        		{
        			Enumeration enum1=((Hashtable) hash.get(num%nums.length)).elements();
        			
        			while(enum1.hasMoreElements())
        			{
        				int num1 = (int)enum1.nextElement();
            			if(num1==num)
            			{
            				resultnum[0] = j;
            				resultnum[1] = valueGetKey(map, num1);
            				break;
            			}
            			else continue;
        			}
        		}
        	}
        	else
        	{
        		j++;
        	}
        
        }
        System.out.println(resultnum);
        return resultnum;
    }
	private static int valueGetKey(Map map,int value) {
	    Set set = map.entrySet();
	    ArrayList arr = new ArrayList<>();
	    Iterator it = set.iterator();
	    int s = 0;
	    while(it.hasNext()) {
	      Map.Entry entry = (Map.Entry)it.next();
	      if(entry.getValue().equals(value)) {
	         s = (int)entry.getKey();
	        
	      }
	    }
	    return s;
	  }
	public static void main(String[] args)
	{
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		twoSum(nums,target);
	}
}
