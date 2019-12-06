package mta.tuanthinh.entity;

import java.util.Date;
import java.util.List;

public class HoaDon {
	private Long id;
	private KhachHang khachHang;
	private Date ngayDat;
	private Date ngayGiao;
	private String tinhTrang;
	private Long thanhToan;
	private List<ChiTietDonThuoc> listThuoc;

	public List<ChiTietDonThuoc> getListThuoc() {
		return listThuoc;
	}

	public void setListThuoc(List<ChiTietDonThuoc> listThuoc) {
		this.listThuoc = listThuoc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	public Date getNgayGiao() {
		return ngayGiao;
	}

	public void setNgayGiao(Date ngayGiao) {
		this.ngayGiao = ngayGiao;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public Long getThanhToan() {
		return thanhToan;
	}

	public void setThanhToan(Long thanhToan) {
		this.thanhToan = thanhToan;
	}
}
