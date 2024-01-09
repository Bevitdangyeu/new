package Data;
import Data.Subject;
import java.util.Scanner;
import Data.SinhVien;
public class LopHoc {
	private String id;
	private int count=0;
	public SinhVien sv[]=new SinhVien[40];
	private static Scanner sc =new Scanner(System.in);
	public LopHoc(String id) {
		this.id=id;
	}
	public String getIdLopHoc() {
		return id;
	}
	public void setidLopHoc(String id) {
		this.id=id;
	}
	// Hàm nhập thông tin lớp học
	public void layThongTinLopHoc() {
		System.out.println("Mã lớp học là: "+ id);
	}
	// hàm nhập thông tin sinh viên
	public void inputSinhVien() {
		String id;
		System.out.print("Nhập vào mã số sinh viên: ");
		id=sc.nextLine();
		System.out.print("Nhập vào tên sinh viên: ");
		String name;
		name=sc.nextLine();
		sv[count]=new SinhVien(id,name);
		count++;
		// Sau khi hàm này được thực hiện thì một sinh viên sẽ được thêm vào mảng sv;
	}
	// hàm xuất danh sách mảng sinh viên
	public void outputArrSV() {
		for(int i=0;i<count;i++) {
			sv[i].getInfoSV();
		}
	}
	
	
		

}
