import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số lượng phần tử");
        int num = Integer.parseInt(sc.nextLine());
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("mời bạn nhập phần tử thứ " + (i + 1));
            String str = sc.nextLine();
            arr[i] = str;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println("Mời bạn nhập chuỗi");
        String s = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (s.equals(arr[i])){
                System.out.println(s +" ở vị trí số "+i);
            }
        }
    }
}