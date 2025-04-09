class array
{
	public static void main(String args[])
	{
		int arraylist[]={1,2,3,4};
		int i, sum=0;
		for(i=0;i<arraylist.length;i++)
		{
		 	System.out.println(arraylist[i]);
		 	sum+=arraylist[i];
		 }
		 System.out.println("sum of array"+sum);
		 int max=arraylist[0];
		 for(i=1;i<arraylist.length;i++)
		 {
		 	if(max<arraylist[i])
		 	{
		 		max=arraylist[i];
		 	}
		 }
		 int min=arraylist[0];
		 for(i=1;i<arraylist.length;i++)
		 {
		 	if(min>arraylist[i])
		 	{
		 		min=arraylist[i];
		 	}
		 }
		 System.out.println("maximum array" +maxs);
		 System.out.println("minimum array" +min);
		
	 }
}
