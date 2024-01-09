package Data;
import MyLibrary.utill.Mylibrary;
import Data.LopHoc;
import Data.LopHoc;
import java.util.Scanner;
public class Subject {
	private String id;
	private String name;
	private int count=0;
	private LopHoc Class[]=new LopHoc[100];// khai báo 1 biến mảng sinh viên nhưng chưa khai báo số lượng
	private static Scanner sc=new Scanner(System.in);
	public Subject(String id, String name) {
		this.id=id;
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	// hàm lấy thông tin của môn học
	public void getInfoSubject() {
		System.out.println("Mã môn học là: "+id);
		System.out.println("Tên môn học là: "+name);
	}
	// hàm nhập danh sách lớp học
	public void inputLopHoc() {
		String id;
		System.out.print("Nhập mã số lớp học: ");
		id=sc.nextLine();
		Class[count]= new LopHoc(id);// tạo ra một đối tượng lớp học mới , gán đối tượng đó vào mảng
		count++;
	}
	// Hàm xuất thông tin lớp học
	public void outputLopHoc() {
		for(int i=0;i<count;i++) {
			Class[i].layThongTinLopHoc();
		}
	}
	public Subject inputSubject() {
		String id;
		String name;
		int SL;
		System.out.print("Nhập vào mã số môn học: ");
		id= sc.nextLine();
		System.out.print("Nhập vào tên môn học: ");
		name=sc.nextLine();
		Subject subject= new Subject(id,name);
		return subject;
	}
//	public void getClass(String n) {
//		for(int i=0;i<count;i++) {
//			if(n.compareTo(Class[i].getIdLopHoc())==0) {
//				Class[i].inputSinhVien();
//			}
//		}
//		
//	}
	
	
//	public void XuatTT(String n) {
//		for(int i=0;i<count;i++) {
//			if(n.compareTo(Class[i].getIdLopHoc())==0) {
//				Class[i].outputArrSV();
//			}
//	}
//	
//	}
	// Hàm xuất thông tin sinh viên
	public void XuatSV() {
		String maLop;
		System.out.print("Nhập vào mã lớp cần nhập thông tin: ");
		maLop=sc.nextLine();
		for(int i=0;i<count;i++) {
			if(maLop.compareTo(Class[i].getIdLopHoc())==0) {
				Class[i].outputArrSV();
			}
		}
	}
	// Hàm nhập thông tin sinh viên
	public void NhapSV() {
		String maLop;
		System.out.print("Nhập vào mã lớp cần xuất thông tin: ");
		maLop=sc.nextLine();
		for(int i=0;i<count;i++) {
			if(maLop.compareTo(Class[i].getIdLopHoc())==0) {
				Class[i].inputSinhVien();// Class[i] là một đối tượng của class lớp học nên nó có thể gọi hàm bên trong class đó
				// Class[i] này nó lưu trữ địa chỉ 1 mảng SinhVien mà nó quản lí khi hàm nhập sinh viên được gọi bởi class[i] này thì
				// một đối tượng SinhVien mới nó được đưa vào cái mảng có mà class[i] này đang nắm giữ 
				// khi đối tượng class này được tạo ra thì nó cũng đồng thời tạo ra 1 mảng gồm n sinh viên sau đó gán địa chỉ cho 
				// biến mảng sv[] được khai báo. 
			}
		}
	}
}