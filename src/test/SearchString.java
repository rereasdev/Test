
package test;

//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;

public class SearchString {
//    public static boolean useList(String[] arr, String targetValue) {
//	return Arrays.asList(arr).contains(targetValue);
//    }
//    
//    public static boolean useSet(String[] arr, String targetValue) {
//	Set<String> set = new HashSet<>(Arrays.asList(arr));
//	return set.contains(targetValue);
//    }
//    
    public static boolean useLoop(String[] arr, String targetValue) {
	for(String s: arr){
            if(s.equals(targetValue))
                    return true;
	}
	return false;
    }
    
    public static int useLoopindex(String[] arr, String targetValue) {
        int a = 0;
	for(int i = 0; i < arr.length; i++){
            boolean equals = arr[i].equalsIgnoreCase(targetValue);
            if(equals == true){
                a = i;
                break;
            }
        }
        return a;
    }
    
    public static boolean search2D(String[][] arr, String targetValue) {
        for (String[] arr1 : arr) {
            for (String arr11 : arr1) {
                if (arr11.equals(targetValue)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String search2Dindex(String[][] arr, String targetValue) {
        int a = 0;
        int b = 0;
	for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                boolean la = arr[i][j].equalsIgnoreCase(targetValue);
                if(la ==true){
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        String c = a+" "+b;
        return c;
    }
    public static void main(String[] args) {
	String[] arr = new String[] {"Asu",  "gege", "efi", "dede", "abe", "aka"};
        String[][] arr2 = new String[][] {{"asu", "gege"}, {"efi", "dede"}};
        
//	//use list
//	long startTime = System.nanoTime();
//	for (int i = 0; i < 100000; i++) {
//		useList(arr, "A");
//	}
//	long endTime = System.nanoTime();
//	long duration = endTime - startTime;
//	System.out.println("useList:  " + duration / 1000000);
// 
//	//use set
//	startTime = System.nanoTime();
//	for (int i = 0; i < 100000; i++) {
//		useSet(arr, "A");
//	}
//	endTime = System.nanoTime();
//	duration = endTime - startTime;
//	System.out.println("useSet:  " + duration / 1000000);
 
	//use loop
//	startTime = System.nanoTime();
//	for (int i = 0; i < 100000; i++) {
//		useLoop(arr, "AF");
//	}
//	endTime = System.nanoTime();
//	duration = endTime - startTime;
//	System.out.println("useLoop:  " + duration / 1000000);

        System.out.println(useLoop(arr, "efi"));  
        System.out.println(useLoopindex(arr, "efi"));
//        
        System.out.println(search2D(arr2, "asu"));
        System.out.println(search2Dindex(arr2, "asu"));
    }
}
