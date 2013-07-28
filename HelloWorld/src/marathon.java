//
class marathon {
	/*Seek() is a function that will search the string array and reorder the names based on
	 * the rank previously established previously by the rate() function.
	*/
	public static String[] seek(int[] list,int[] orderedlist, String[] names)
	{
		String rank[]=new String[list.length]; //initialize the rank array variable
		int buffer=0; //buffer for integer results from comparem()
		for(int x=0; x<names.length;x++) 
		{
			buffer=comparem(list,orderedlist, x);
			rank[x]=names[buffer];
		}
		return rank;
	}
	
	/*comparem() is a function that will search within the list of integers and the ordered list
	 * and figure out what index the ordered list belongs to.
	*/
	public static int comparem(int[] list, int[] orderedlist,int n)
	{
		int nameindex=0; //index of the name from the list to be returned
		for(int x=0; x<list.length; x++)// seek through the lists
		{
			if(list[x]==orderedlist[n])
			{
				nameindex=x;
				break;
			}
		}
		return nameindex;
	}
	
	/*Rate() is a function that will search within the array and assign a rank number
	* I added this function to separate the nested for loops. My experience in C is that nested for loops are
	* a big no-no. In Java it seems to compile but the results are unpredictable. My way of getting around this
	* was to put one for loop in one function calling another function with another for loop in it. Technically
	* its still a nested for loop but it works and I was able to order the numbers.
	*/
	public static int rate(int[] list,int location)
	{
		int rank=0; //initialize rank
		for(int x=0; x<list.length; x++) //seek through the list
		{
		//	System.out.println(x); //Debug
			if((x+1)<list.length) // As long as we are still in the bounds of the list continue
			{
				if(list[location]<list[x+1]) //If the number we're on is less than the number we are seeking then don't do anything.
				{
					//do nothing
				} else //otherwise
				{
				rank=rank+1; //Add a rank point
				}
			}
		}
	//	System.out.println("Rank: "+rank);   //Debug
		return rank-1;
	}
	
	/*Order() is a function that will search within the array and assign a rank number
	* and return an array of ordered integers from the jumbled order of integers provided in int[] list
	*/
	public static int[] order(int[] list)
	{
		int[] ordered=new int[list.length]; //make a new integer array the length of list
		int rank;
		for(int x=0; x<list.length;x++) // while x is less than the length of list
		{
		//	System.out.println("Searching list["+x+"]"+" Value: "+list[x]);
			//New Function Call to scan within the list
			rank=rate(list,x);
			ordered[rank]=list[x]; //Store the number where it should be nice and ordered in this list
		}
		return ordered; //Return an integer array
	}
	
	public static void main(String[] args) {
	String[] names={"Elana","Thomas","Hamilton", 
			"Suzie","Phill","Matt","Alex","Emma","John","James","Jane","Emily",
			"Daniel","Neda","Aaron","Kate"}; //Names for Runners
	
	int[] times={341,273,278,329,445,402,388,275,243,334,412,293,299,343,317,265}; //Times for Runners
	int[] orderofnumbs= new int[times.length]; //The ordered array of integers
	orderofnumbs=order(times); //order the integers and store the ordered list in the new ordered array
	String[] orderednames= new String[names.length];
	orderednames=seek(times,orderofnumbs,names);
	System.out.print("******************************\nBoston Marathon Results\n******************************\n\nTop 2 Runners\n******************************\n");
	for(int x=0;x<(orderednames.length-1) ;x++)
	{
		System.out.println("#"+(x+1)+": "+orderednames[x]+" ----- "+orderofnumbs[x]+" minutes.");
		if(x==1)
		{
			System.out.print("******************************\n\n Rest of the Field\n******************************\n");
		}
	}
	
	}
	

}
