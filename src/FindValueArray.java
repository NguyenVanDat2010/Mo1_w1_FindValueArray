import java.util.Scanner;
public class FindValueArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Nhập tên sv từ bàn phím: ");
        String nameOfStudent =scanner.nextLine();
        boolean isExist=false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(nameOfStudent)){
                isExist=true;
                System.out.println("Sinh viên "+nameOfStudent+" ở vị trí "+(i+1));
                break;
            }
        }
        if (!isExist){
            System.out.println("Sinh viên "+nameOfStudent+" không có trong danh sách.");
        }
    }
}
