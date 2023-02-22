package homeworkrdec;

class abcpartten
{
    

// function to print a row
static int print_row(int ct, int num)
{
	// base case
	if (num == 0)
		return ct;
	System.out.print((char)(ct + 96) + " ");

	// recursively calling print_row()
	print_row(ct , num-1);
   
	return  num+ct;
	
}

// function to print the pattern
static void pattern(int n, int count, int num)
{
	// base case
	if (n == 0)
		return;
	print_row(count, num);
    count+=1;
  
	System.out.println();

	// recursively calling pattern()
	pattern(n - 1, count, num +1);
}

// Driver code
public static void main(String[] args)
{
	int n = 5;
	pattern(n, 1, 1);
}
}


