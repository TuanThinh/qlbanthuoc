package mta.tuanthinh.entity;

public class ChiTietDonThuoc {
	private Long id;
	private HoaDon hoaDon;
	private Thuoc thuoc;
	private Integer soLuong;
	private Long donGia;
	private Long thanhTien;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
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

	public Long getDonGia() {
		return donGia;
	}

	public void setDonGia(Long donGia) {
		this.donGia = donGia;
	}

	public Long getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(Long thanhTien) {
		this.thanhTien = thanhTien;
	}
}
