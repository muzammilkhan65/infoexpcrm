package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class mergearray {

	public static void main(String[] args) {
		
		usingArray();
	}
   
	public static void usingArray(){
		int [] array1={1,2,3};
		int [] array2={4,5,6};
		//int [] c=merge(a,b);
		
	////	public static void arraycopy(Object src, int srcPos, Object dest, int destPos,int length);

		int[] array1and2 = new int[array1.length + array2.length];
		
		System.arraycopy(array1, 0, array1and2, 0, array1.length);
		System.arraycopy(array2, 0, array1and2, array1.length, array2.length);
		for(int i=0; i<=array1and2.length-1;i++){
			int b=array1and2[i];
			System.out.println(b);
			stringmerge();
		}
	}
	
	
	public static void usingArrayList(){
		ArrayList<Object> obj=new ArrayList<>();
		obj.add(101);
		obj.add(103);obj.add(104);
        ArrayList<Object> obj1=new ArrayList<>();
        obj1.add(105);
		obj1.add(106);obj1.add(107);
      ArrayList<Object> obj2=new ArrayList<>();
      obj2.addAll(obj);
      obj2.addAll(obj1);
		for(int i=0; i<=obj2.size()-1;i++){
			System.out.println(obj2.get(i));
		}
	}
		
//	private static int[] combine(int[] array1, int[] array2) {
//		// TODO Auto-generated method stub
//		return int[];
	



	
	
	public static void stringmerge(){
		
	
	String a[] = { "A", "E", "I" };
	  String b[] = { "O", "U" };
	  List list = new ArrayList(Arrays.asList(a));
	  list.addAll(Arrays.asList(b));
	  Object[] c = list.toArray();
	  System.out.println(Arrays.toString(c));
	  sortarray();
	  
	} 
	public static void sortarray(){
		
		int Arr[]={1,2,3,4,5,6,5,4,7,8,6};
		for (int number : Arr) {
			   System.out.println("Number = " + number);
		Arrays.sort(Arr);
		
		sortarr();
		
		
	}
	
	}
public static void sortarr(){
	int arr[]={1,2,3,4,5,5,4,3,3,2,3,5,6,7,8,9,7,6,6};
	for(int number : arr){
		System.out.println("number  :" +number);
		Arrays.sort(arr);
		
		
	}
	
	
}

}
