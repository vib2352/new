package secondnov;

public class Missingelement {
	public static void main(String[]args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		int sum1 = ((arr[arr.length-1])*(arr[arr.length-1]))/2;
		System.out.println(sum1-sum);
	}


}
