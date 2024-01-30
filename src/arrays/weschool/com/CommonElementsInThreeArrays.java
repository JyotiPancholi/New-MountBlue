package arrays.weschool.com;

public class CommonElementsInThreeArrays {

	public static void main(String[] args) {
		int array1[] = {2, 4, 8};
        int array2[] = {2, 3, 4, 8, 10, 16};
        int array3[] = {4, 8, 14, 40};
        int i=0,j=0,k=0;
        while (array1.length>i && array2.length>j && array3.length>k) {
			if (array1[i]==array2[j] && array2[j]==array3[k]) {
				System.out.println(array1[i]);
				i++;
				j++;
				k++;
			}else if (array1[i]<array2[j]) {
				i++;
			}else if (array2[j]<array3[k]) {
				j++;
			} 
			else {
				k++;
			}
		}
	}
}
