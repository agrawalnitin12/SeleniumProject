package naveenSeleniumClass;



public class Sdet {

	public static void main(String[] args) {

		int[][] data = new int[][]{{1001,50},{1001,68},{1002,69},{1002,68},{1004,9},{1004,13},{1005,56},{1005,96},{1005,30},{1006,46},{1006,6},{1006,48},{1007,59},{1007,30},{1007,9},{1009,79},{1010,42},{1012,37},{1013,64},{1017,55},{1018,29},{1020,60},{1020,29},{1021,44},{1022,62},{1024,2},{1025,6},{1028,5},{1029,6},{1029,82}};

		//	int len = data.length;
		int max=0;
		int total=0;
		int j=1;


		//System.out.println(len);
		for (int i=1;i<data.length;i++) 
		{	System.out.println("in "+i+"th iteration for"+data[i][j-1]+" maximum no is : "+max);
		if(data[i][j-1]==data[i-1][j-1])
		{
			max=Integer.max(data[i][j], data[i-1][j]);

		}
		else {
			total=total+max;
		}
		}
		System.out.println("Total of all maximum numbers is:"+total);
	}

}
