package array.practice.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array30_NextPermutation {
	
	 static List<Integer> nextPermutation(int N, int arr[]){
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i = 0; i<N;i++){
	            list.add(arr[i]);
	        }
	        int index = -1;
	        for(int i = N-2;i>=0;i--){
	            if(list.get(i)<list.get(i+1)){
	                index = i ;
	                break;
	            }
	        }if(index==-1){
	            Collections.reverse(list);
	            return list;
	        }
	        for(int i = N-1 ; i>index ; i--){
	            if(list.get(i)>list.get(index)){
	                Collections.swap(list, i , index);
	                break;
	            }
	        }
	        List<Integer> sublist = list.subList(index+1,N);
	        Collections.reverse(sublist);
	        
	        return list;
	        
	    }
	public static void main(String[] args) {
	 int arr[] = {1, 2, 3, 6, 5, 4};
	 int n =  arr.length;
	 List<Integer> list =nextPermutation(n, arr);
	 System.out.println(list);
	}
}
