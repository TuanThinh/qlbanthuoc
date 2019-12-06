package mta.tuanthinh.entity;

public class ChiTietHoaDonNhap {
	private Long id;
	private HoaDonNhap hoaDonNhap;
	private Thuoc thuoc;
	private Integer soLuong;
	private Long giaNhap;
	private Long thanhTien;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HoaDonNhap getHoaDonNhap() {
		return hoaDonNhap;
	}

	public void setHoaDonNhap(HoaDonNhap hoaDonNhap) {
		this.hoaDonNhap = hoaDonNhap;
	}

	public Thuoc getThuoc() {
		return thuoc;
	}

	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public Long getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(Long giaNhap) {
		this.giaNhap = giaNhap;
	}

	public Long getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(Long thanhTien) {
		this.thanhTien = thanhTien;
	}
}
