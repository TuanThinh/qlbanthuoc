package mta.tuanthinh.entity;

import java.util.Date;
import java.util.List;


public class HoaDonNhap {
	private Long id;
	private NhaCungCap nhaCungCap;
	private Date ngayNhap;
	private Long thanhTien;
	private List<ChiTietHoaDonNhap> listChiTietHoaDonNhap;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public Long getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(Long thanhTien) {
		this.thanhTien = thanhTien;
	}

	public List<ChiTietHoaDonNhap> getListChiTietHoaDonNhap() {
		return listChiTietHoaDonNhap;
	}

	public void setListChiTietHoaDonNhap(List<ChiTietHoaDonNhap> listChiTietHoaDonNhap) {
		this.listChiTietHoaDonNhap = listChiTietHoaDonNhap;
	}
	
}
