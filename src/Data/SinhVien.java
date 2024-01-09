package Data;

import java.util.Scanner;
import Data.LopHoc;
import Data.Subject;
import MyLibrary.utill.Mylibrary;

public class SinhVien {
	private String id;
	private String name;
	//private double gpa;
	private String idSubject;
	private String idLopHoc;
	//private SinhVien sv[];
	private int count=0;
	// làm cái phễu
	private static Scanner sc=new Scanner(System.in);
	public SinhVien(String id,String name ) {
		this.id=id;
		this.name=name;
		
		//this.idSubject=idSubject;
		//this.idLopHoc=idLopHoc;
		
		
	}
	// hàm lấy ra giá trị
	public String getIdSV() {
		return id;
	}
	public String getNameSV() {
		return name;
	}
//	public double getGpa() {
//		return gpa;
//	}
//	public String getibSubject() {
//		return idSubject;
//	}
//	public String getidLopHoc() {
//		return idLopHoc;
//	}
	public void setIdSV(String id) {
		this.id=id;// gán giá trị mới cho id
	}
	public void setNameSV(String name) {
		this.name=name;
	}
//	public void setGpa(double gpa) {
//		this.gpa=gpa;
//	}
//	public void setidSubject(String idSubject) {
//		this.idSubject=idSubject;
//	}
//	public void setidLopHoc(String idLopHoc) {
//		this.idLopHoc=idLopHoc;
//	}
	// hàm lấy thông tin sinh viên
	public void getInfoSV() {
		System.out.println("Mã số sinh viên là: "+id);
		System.out.println("Tên sinh viên là: "+name);
		//System.out.println("Mã lớp sinh viên đã đăng kí là: "+idLopHoc);
	}
	// hàm nhâp thông tin sinh viên
//	public static SinhVien inputSinhVien() {
//		String id;
//		String name;
//		double gpa;
//		id=sc.nextLine();
//		name=sc.nextLine();
//		gpa=Mylibrary.inputDouble("Nhập vào gpa của sinh viên"," Vui lòng nhập từ 0-10",0,10);
//		SinhVien x= new SinhVien(id,name);
//		return x;
//		
//	}	
}
