// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Bài 1: In ra các số từ 1 đến 10
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}

class Bai2 {
    public static void main(String[] args) {
        //Bài 2: In ra các số chẵn chia hết cho 5 từ 1-10

        for (int i = 1; i <= 10; i++)
            if (i % 5 == 0) {
                if (i % 2 == 0)
                {
                        System.out.println(i);}
            }
    }
}

class Bai3 {
    public static void main(String[] args) {
        //Bài 3: Tính dữ liệu BMI theo dữ liệu người dùng nhập vào
        //BMI = Cân nặng [kg]/ Chiều cao^2 [m2]

        Scanner scanner = new Scanner(System.in);

        //Nhập cân nặng từ người dùng
        System.out.println("Nhập cân nặng của bạn (kg):");
        double cannang = scanner.nextDouble();

        //Nhập chiều cao người dùng
        System.out.println("Nhập chiều cao của bạn (m): ");
        double chieucao = scanner.nextDouble();

        // Đóng đối tượng scanner sau khi sử dụng
        scanner.close();

        //Tính BMI
        double BMI = cannang / (chieucao * chieucao);
        System.out.println("Chỉ số BMI của bạn là: " + BMI);

        //Phân loại chỉ số BMI
        if (BMI <18.5) {
            System.out.println("Bạn thiếu cân.");
        } else if (BMI >=18.5 && BMI < 24.9) {
            System.out.println("Bạn cân đối.");
        } else if (BMI >=25 && BMI < 29.9){
            System.out.println("Bạn thừa cân.");
        } else {
            System.out.println("Bạn bị béo phì.");
        }
    }
}


class Bai4 {
    public static void main(String[] args) {
        //Bài 4: Tính giai thừa của một số nguyên do người dùng nhập vào

    Scanner scanner = new Scanner (System.in);

    //Nhập số nguyên dương n
        System.out.println("Nhập số nguyên dương n (n>0): ");
    int n = scanner.nextInt();
scanner.close();


        if (n<0) {
            System.out.println("Giai thừa không được định nghĩa cho số âm.");
        }
        else if (n==0 || n==1) {
            System.out.println("Giai thừa của số 0 hoặc 1 là 1");
        }
        else {
            long giaithua = 1;
            for (int i=2; i<=n; i++)
            {giaithua=giaithua*i;}
                System.out.println("Giai thừa của số nguyên " + n + " là: " + giaithua);
}
}
}

class Bai5 {
    public static void main(String[] args) {
// Bài 5: Tìm số lớn nhất trong mảng cho trước và vị trí của nó
// VD: Tạo mảng
        int[] mang = {11, 2, 30, 4, 5};

// Gán phần tử đầu tiên có giá trị max
        int max = mang[0];
        int vitri = 0;

// Duyệt mảng tìm số lớn nhất
        for (int i = 1; i < mang.length; i++) {
            if (mang[i] > max) {
                max = mang[i];
                vitri = i;
            }
        }
        System.out.println("Gía trị lớn nhất trong mảng là: " + max);
        System.out.println("Vị trí của giá trị lớn nhất trong mảng: " + vitri);
    }}

class Bai6 {
    public static void main(String[] args) {
// Bài 6: (optional) cho người dùng nhập vào 1 mảng và tìm max của mảng đó và vị trí của phần tử đó

Scanner scanner = new Scanner(System.in);

// Nhập số lượng phần tử của mảng
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng
    int[] mang = new int[n];

    // Nhập các phần tử của mảng từ người dùng
for (int i=0;i<n; i++) {
    System.out.println("Nhập phần tử thứ " + (i+1) + ": ");
    mang[i]=scanner.nextInt();

    // Tìm số lớn nhất và vị trí của nó trong mảng
    int max = mang[0];
    int vitri = 0;
    for (int i = 1; i < n; i++) {
        if (mang[i] > max) {
            max = mang[i];
            vitri = i;
        }
    }

    // Hiển thị số lớn nhất và vị trí của nó
    System.out.println("Số lớn nhất trong mảng là: " + max);
    System.out.println("Vị trí của số lớn nhất trong mảng là: " + vitri);

    scanner.close();
} } }

class Bai7 {
    public static void main(String[] args) {
// Bài 7: In ra 20 số Fibonacci
//tổng của hai số trước đó trong dãy. 0,1,1,2,3,5,8,...

        int n = 20; // Số lượng số Fibonacci cần in ra

        long[] fibonacci = new long[n];

        // Khởi tạo dãy Fibonacci với 0 và 1
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Tính và in ra các số Fibonacci từ số thứ 3 trở đi
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("20 số Fibonacci đầu tiên là:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}