package Test;

public class IntersectionArray {
    public static void intersect(int arr1[], int arr2[]) {
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (!flag) {
                        System.out.print(',');
                    }
                    System.out.print(arr1[i]);
                    flag = false;
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 4, 5, 6, 7 };
        intersect(arr1, arr2);
    }
}
