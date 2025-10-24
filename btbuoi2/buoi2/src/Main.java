import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] arr = new int[100];
         System.out.println("Nhap n");
         int n = sc.nextInt();
         for(int i = 0; i<n; i++){
             arr[i] = sc.nextInt();
         }

      do{
          System.out.println("------Menu-------");
          System.out.println("1.Tính tổng các phẩn tử trong mảng");
          System.out.println("2. In ra phần tử lớn nhất, nhỏ nhất trong mảng");
          System.out.println("3.Sắp xếp lại mảng theo chiều tăng dần");
          System.out.println("4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra (Không có)");
          System.out.print("Nhập lựa chọn: ");
          int choose = sc.nextInt();
          switch(choose){
              case 1:SUM(arr,n); break;
              case 2:MAXANDMIN(arr,n); break;
              case 3:BubbleSort(arr,n);
                  for(int i = 0; i<n; i++){
                      System.out.print(arr[i] + " ");
                  }
                  break;
              case 4:checkSNT(arr,n);break;
          }

      }while(true);

    }
    public static void SUM(int []arr , int n){
        int sum= 0;
        for(int i = 0; i<n; i++){
            sum+= arr[i];
        }
        System.out.println("tong phan tu trong mang: "+ sum);
    }
    public static void MAXANDMIN(int []arr , int n){
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("phan tu lon nhat la "+ max);
        System.out.println("phan tu nho nhat la "+ min);
    }
    public static void BubbleSort(int []arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = n-i-1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
    public static boolean SNT(int n){
        if(n<2) return false;
        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void checkSNT(int []arr, int n){
        int snt = -1;
        for(int i = 0; i < n; i++){
            if(SNT(arr[i]) && snt < arr[i]){
                snt = arr[i];
            }
        }
        if(snt == -1){
            System.out.println("khong co");
        }else{
            System.out.println("so nguyen to lon nhat "+ snt);
        }
    }
}