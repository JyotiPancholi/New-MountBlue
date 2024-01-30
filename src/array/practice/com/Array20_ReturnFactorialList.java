package array.practice.com;

import java.util.ArrayList;
import java.util.Collections;

public class Array20_ReturnFactorialList {
	 static ArrayList<Integer> factorial(int N){
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(1);
	        while(N>1){
	            
	            int carry = 0, res, size = list.size();
	            for(int i=0; i<size; i++){
	                res = list.get(i) * N + carry;
	                list.set(i,res % 10);
	                carry = res / 10;
	            }
	            
	            while(carry != 0){ 
	                list.add(carry % 10);
	                carry /= 10;
	            }
	            
	            N--;
	        }
	        
	        Collections.reverse(list);
	        return list;
	    }
	 public static void main(String[] args) {
		ArrayList<Integer> list = factorial(5);
		System.out.println(list);
	}
}
