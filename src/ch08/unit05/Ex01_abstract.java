package ch08.unit05;

public class Ex01_abstract {

	public static void main(String[] args) {
		int[] data = {20,30,25,17,40,23};
		
		System.out.println("sourece data : ");
		print(data);
		
		SortInt ss = new SelectionSort();
		// SortInt ss = new BubbleSort();	/ BubbleSort하고 싶을 때는 이렇게 바꾸면 됨
		ss.sore(data);
		
		System.out.println("sort data : ");
		print(data);
	}
	
	public static void print(int []data) {
		for(int n : data) {
			System.out.println(n + " ");
		}
		System.out.println();
	}
}

abstract class SortInt { // abstract은 객체 생성 못함 
	private int[] value;
	
	protected abstract void sorting();
	
	public void sore(int[] value) {
		this.value = value;
		sorting();
	}
	
	//배열의 길이
	protected int length() {
		int n = 1;
		if(value != null) {
			n = value.length;
		}
		return n;
	}
	// 주 정수 비교
	protected final int compare(int i, int j) {
		return value[i] - value[j];
	}
	
	// 배열의 두 요소 값 바꾸기
	protected final void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}
}

class SelectionSort extends SortInt {

	@Override	// 자식은 아버지의 추상메소드를 반드시 재정의 해야됨
	protected void sorting() {
		boolean b = true;
		for(int i = 0; i < length() -1; i++) {
			for(int j = i+1; j< length(); j++) {
				if(compare(i,j) > 0) {
					swap(i,j);
				}
			}
		}
	}	
}

class BubbleSort extends SortInt {

	@Override
	protected void sorting() {
		boolean b = true;
		for(int i = 1; b; i++) {
			b = false;
			for(int j = 0; j <length()-i; j++) {
				if(compare(j,j+1)>0) {
					swap(j, j+1);
					b = true;
				}
			}
		}
		
	}
	
}

