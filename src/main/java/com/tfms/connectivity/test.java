package com.tfms.connectivity;

public class test {



	public static void fun(int[][]arr){
	    
		for(int i=0;i<arr.length;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            int temp =arr[i][j];
	            arr[i][j]=arr[j][i];
	            arr[j][i]=temp;
	        }
	    }
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        int li=0;
	        int ri=arr[0].length-1;
	        while(li<=ri)
	        {
	            int temp=arr[i][li];
	            arr[i][li]=arr[i][ri];
	            arr[i][ri]=temp;
	            li++;
	            ri--;
	            
	        }
	    }
	    for(int i=2;i<=2;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		System.out.println(arr[i][j]);
	    	}
	    }
	    
	    
	}

	public static void main(String args[])
	{
	    int arr[][]= {
	       { 11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44} 
	    };
	    
	    
	}

}
