public static int toeplizMatrix(int[][] input1)
    {
        int sum=1;
	    int r=input1.length;
	    int c=input1[0].length;
	    for(int i=0;i<r-1;i++)
	    {
	        for(int j=0;j<c-1;j++)
	        {
	            if(input1[i][j]==input1[i+1][j+1])
	            {
	                sum=1;
	            }
	            else
	            {
	                sum=sum+1;
	            }
	        }
	    }
        return sum;
    }
