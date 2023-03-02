import java.util.Arrays;  

public class MajorityElement1 
{  

public int findMajorEle(int arr[])  
{  
int size = arr.length;  

Arrays.sort(arr);  
int count = 1;  
for(int i = 1; i < size; i++)  
{  
    if(arr[i] == arr[i - 1])  
    {   
        count = count + 1;  
    }  
    else  
    {  

        if(count > (size / 2))  
        {  
            return 1;  
        }  
        count = 1;  
    }  
}  
if(count > (size / 2))  
{  
    return 1;  
}  

return -1;  

}  

public static void main(String[] argvs)   
{   
    MajorityElement1 obj = new MajorityElement1();  
    int arr[] = {5, 1, 1, 1, 1, 1, 4, 9, 1, 0, 1, 2};  
    int s = arr.length;  
    System.out.println("For the input array.");  
    for(int i = 0; i < s; i++)  
    {  
        System.out.print(arr[i] + " ");  
    }  
    System.out.println();  
    int ans = obj.findMajorEle(arr);  
    if(ans != -1)  
    {  
    System.out.println("The majority element is: " + ans);   
    }  
    else  
    {  
        System.out.println("The majority element is not found.");   
    }  
    
    System.out.println("\n");  
    

    
}  
}