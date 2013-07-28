//
class marathon {

	public static int biggestnumber(int[] list)
	{
		int bigvalue=0;
		for(int x=0; x<list.length;x++)
		{
			
		}
		
		return bigvalue;
	}
	
	public static int[] order(int[] list)
	{
		int[] ordered=new int[list.length]; //make a new integer array the length of list
		int rank=0; //Set a rank variable
		for(int x=0; x<list.length;x++) // while x is less than the length of list
		{
			System.out.println("Searching list["+x+"]"+" Value: "+list[x]);
			for(int n=0;n<list.length;n++)
			{
				if(list[x]==list[n])
				{
					System.out.println("Same Number!");
				} else if(list[x]>list[n])
				{
					rank=rank+1;
				}
				if(rank>list.length-1)
				{
					System.out.println("Error: Out of Bounds");
				} else
				{
					ordered[rank]=list[x];
				}
			}
		}
		return ordered;
	}
	
	public static void main(String[] args) {
	String[] names={"Elana","Thomas","Hamilton", 
			"Suzie","Phill","Matt","Alex","Emma","John","James","Jane","Emily",
			"Daniel","Neda","Aaron","Kate"}; //Names for Runners
	int[] times={341,273,278,329,445,402,388,275,243,334,412,293,299,234,317,265}; //Times for Runners
	int[] orderofnumbs= new int[times.length];
	orderofnumbs=order(times);
	
	for(int x=0; x<orderofnumbs.length;x++)
	{
		System.out.println("#"+(x+1)+". "+orderofnumbs[x]);
	}
	}
	

}
