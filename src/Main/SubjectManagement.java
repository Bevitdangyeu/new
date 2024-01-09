package Main;
import Data.Subject;
import MyLibrary.utill.Mylibrary;

import java.util.Scanner;

import Data.LopHoc;
import Data.Subject;
public class SubjectManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Subject subject[]=new Subject[10];// Mảng được tạo ra ở đâu thì hàm nhập ở đó
		int count=0;
		int choice;
		do {
			System.out.println("====================================");
			System.out.println("1. Tạo danh sách môn học");
			System.out.println("2. Tạo lớp học");
			System.out.println("3. Nhập sinh viên");
			System.out.println("4. Xuất thông tin sinh viên");
			//System.out.println("====================================");
			choice=Mylibrary.inputInteger("Nhập vào lựa chọn của bạn: "," Vui lòng nhập từ 1-5",0,5);
			if( choice==1) {
				 String id;
				 System.out.print("Nhập vào id của môn học: ");
				 id=sc.nextLine();
				 String name;
				 System.out.print("Nhập vào tên môn học: ");
				 name=sc.nextLine();
				 subject[count]=new Subject(id,name);
				 count++;			
			}
			if(choice==2) {
				String maMH;
				System.out.print("Nhập vào mã môn học: ");
				maMH=sc.nextLine();
				for(int i=0;i<count;i++) {
					if(maMH.compareTo(subject[i].getId())==0) {
						subject[i].inputLopHoc();
					}
				}
			}
			if(choice==3) {
				String maMH;
				System.out.print("Nhập vào mã môn học: ");
				maMH=sc.nextLine();
				for(int i=0;i<count;i++) {
					if(maMH.compareTo(subject[i].getId())==0) {
						subject[i].NhapSV();
					}
				}
			}
			if(choice==4) {
				String maMH;
				System.out.print("Nhập vào mã môn học: ");
				maMH=sc.nextLine();
				for(int i=0;i<count;i++) {
					if(maMH.compareTo(subject[i].getId())==0) {
						subject[i].XuatSV();
					}
				}
			}
			if(choice==4) {
				for(int i=0;i<count;i++) {
					
				}
			}
				
		}while(choice !=5);

		}

}
