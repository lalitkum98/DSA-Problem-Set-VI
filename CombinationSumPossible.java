package ProblemSetVI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CombinationSumPossible {
		//correct solution but not in order
		public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
			Set<ArrayList<Integer>> output = new HashSet<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> outputtemp = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> temp = new ArrayList<Integer>();
			if (a.size()== 0)
				return outputtemp;
			Collections.sort(a);	
			generate(a, output, new ArrayList<Integer>(), 0,b, 0);
			outputtemp.addAll(output);
			return outputtemp;
		}
		
		public void generate(ArrayList<Integer> a, Set<ArrayList<Integer>> output, ArrayList<Integer> temp, int start, int T, int sum )
		{
			if(sum==T){
				output.add(new ArrayList<Integer>(temp));
				System.out.println(output);
				return;
			}
			if(sum>T ){
				return;
			}
			for (int i = start; i < a.size(); i++)
			{
				temp.add(a.get(i));
				sum = sum+a.get(i);
				generate(a, output, temp, i, T, sum);
				sum = sum - a.get(i);
				temp.remove(temp.size() - 1);	
			}
		}
		public static void main(String arg[]) {
			CombinationSumPossible ss = new CombinationSumPossible();
			ArrayList<Integer> a = new ArrayList<Integer>();
			Integer array[]={8,10,6,11,1,16,8};
			a.addAll(Arrays.asList(array));
			System.out.println(ss.combinationSum(a, 28));
		}
	}

// correct solution with output in perfect order
/*public class Solution {
    ArrayList<ArrayList<Integer>> res;
    ArrayList<Integer> a;
    int size;
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
	    res=new ArrayList<ArrayList<Integer>>();
	    this.a=a;
	    size=a.size();
	    ArrayList<Integer> temp=new ArrayList<Integer>();
	    Collections.sort(a);
	    temp.add(a.get(0));
	    for(int i=1;i<a.size();i++)
	    {
	        if(a.get(i)!=a.get(i-1))
	        temp.add(a.get(i));
	    }
	    this.a=temp;
	    temp=new ArrayList<Integer>();
	    subsets(b,temp,0);
	    return res;
	}
	public void subsets(int target,ArrayList<Integer> cur,int index)
	{
	    if(target==0)
	    {
	        res.add(new ArrayList<>(cur));
	        return;
	    }
	   if(target<0 || index>=a.size())
	   return;
	    cur.add(a.get(index));
	    subsets(target-a.get(index),cur,index);
	    cur.remove(cur.size()-1);
	    subsets(target,cur,index+1);
	}
}*/

