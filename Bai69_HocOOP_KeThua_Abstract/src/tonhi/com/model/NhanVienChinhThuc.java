package tonhi.com.model;

public class NhanVienChinhThuc extends NhanVien {
	
	public NhanVienChinhThuc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienChinhThuc(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

	public void tinhLuong() {
		System.out.println("Nhân viên chính thức tính lương");
	}

}
