
package test;

public class SearchString2 {
    public static boolean useLoop(String[] arr, String targetValue) {
	for(String s: arr){
            if(s.equalsIgnoreCase(targetValue))
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
                if (arr11.equalsIgnoreCase(targetValue)) {
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
 
        System.out.println(useLoop(arr, "Efi"));  
        System.out.println(useLoopindex(arr, "efi"));
     
        System.out.println(search2D(arr2, "asu"));
        System.out.println(search2Dindex(arr2, "asu"));
    }
}
