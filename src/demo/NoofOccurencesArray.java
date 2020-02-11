package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class NoofOccurencesArray {

	public static void main(String[] args) {
int[]arr1={10,12,13,14,12,13,11,10,10,13,15,15};
HashSet<Integer> hs=new HashSet<Integer>();
for(int i=0;i<=arr1.length-1;i++){
	hs.add(arr1[i]);
	}
Iterator<Integer> itr=hs.iterator();
while(itr.hasNext()){
	int c=(Integer)itr.next();
	int counter=0;
	
	for(int i=0;i<=arr1.length-1;i++){
		if(c==arr1[i]){
			counter++;
		}
	}
	System.out.println(c+" : "+counter);
}

}

}
