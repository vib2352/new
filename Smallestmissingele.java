package secondnov;

public class Smallestmissingele {
	public static void main(String[]args) {
	int arr[] = {1,2,3,4,5,6,7,8,9};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]+1==arr[i+1])
		{
			continue;
		}
		else {
			System.out.println(arr[i]+1);
			break;
		}
	}
	}

}
