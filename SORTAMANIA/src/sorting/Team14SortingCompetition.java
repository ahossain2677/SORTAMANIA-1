package sorting;
import java.util.Random;
import java.util.Arrays;
public class Team14SortingCompetition {

	public static void main(String[]args) {
		int[] list = new int[10000];
		int[][] list2 = new int[1000][1000];
		generateNum(list2);
		//generateNum(list);
		bubbleSort(list);
		//printIntArray(list);
		//System.out.println(ChallangeOne(list));
		//System.out.println(Arrays.deepToString(list2));
	}
	public static int ChallangeOne(int[] list) {
		//bubbleSort(list);
		if(list.length % 2 == 1) {
			return list[list.length/2];
		}
		return (list[list.length/2] + list[(list.length/2)-1])/2;
	}
	public static int ChallangeTwo(String[] list, String theString)
	{
		bubbleSort(list);
		for(int i = 0; i < list.length; i++)
		{
			if(list[i].compareTo(theString) == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int ChallengeFour(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
			}
		}
	}
	public static void bubbleSort(int[]list1) {
		for(int i = 0; i < list1.length-1; i++) {
			for(int j = i+1; j < list1.length; j++) {
				if(list1[i] > list1[j]) {
					int temp = list1[j];
					list1[j] = list1[i];
					list1[i] = temp;
				}
			}
		}
	}
	public static void bubbleSort(String[]list1) {
		for(int i = 0; i < list1.length-1; i++) {
			for(int j = i+1; j < list1.length; j++) {
				if(list1[i].compareTo(list1[j]) < 0) {
					String temp = list1[j];
					list1[j] = list1[i];
					list1[i] = temp;
				}
			}
		}
	}
	
	public static void printIntArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	
	public static void generateNum(int[]list) {
		for(int i = 0; i < list.length; i++) {
			Random rand = new Random();
			int  n = rand.nextInt(10000) + 1;
			list[i] = n;
		}
	}
	
	public static void generateNum(int[][]list) {
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j <list[i].length; j++) {
				Random rand = new Random();
				int  n = rand.nextInt(10000) + 1;
				list[i][j] = n;
			}
		}
		System.out.println("finished");
	}
}


