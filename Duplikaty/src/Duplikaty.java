
public class Duplikaty {
	public static void main(String[] args){
	String word = new String("aa");
	
	char[] arr = word.toCharArray();
	int length = arr.length;
	boolean times = false;
	for(int i=0 ; i<length;i++ )
	{
		int k = word.indexOf(arr[i]);
		int l = word.lastIndexOf(arr[i]);
		if(k==l)
		{
			System.out.println(arr[i]);
			times=true;
			break;
		}
	}
	if(!times){System.out.println("there is no non repeating character in String");}

	}
}
