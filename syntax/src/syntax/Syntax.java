package syntax;

import java.util.Arrays;

public class Syntax {
	public static void main(String[] args) {
		
		Array array = new Array(); 
		int[] noNewCreate = array.getArray();
		int[] newArrayCreate = array.getArray("newArrayCreate");
		array.forInput();
		array.forInput(noNewCreate);
		array.forInput(newArrayCreate);
		
		array.forInput(new int[] {17,22,33}); //匿名数组
		
		int[] copyArray = array.getCopy(noNewCreate);
		array.forInput(copyArray); 
		
	}
}

class Array{
	private int[] noNewCreate = {1,2,3,4,5,6};
	private int[] newArrayCreate = new int[5];
	public int[] getArray(){
		return noNewCreate;
	}
	
	public int[] getArray(String s) {
		return newArrayCreate;
	}
	
	public void forInput() {
		for(int item:noNewCreate) {
			System.out.println(item);
		}
	}
	public void forInput(int[] array) {
		for(int item:array) {
			System.out.println(item);
		}
	}
	
	public int[] getCopy(int[] array) {
		int[] tmpArray = Arrays.copyOf(array,array.length);
		return tmpArray;
	}
	
}

/******************************************/
/*
int[] a = new int[100];
等同于 c++ 的 int *a = new int[100];

*/
/******************************************/
