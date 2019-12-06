package mta.tuanthinh.entity;

import java.util.Date;
import java.util.List;

public class Thuoc {
	private Long id;
	private String hinhANh;
	private String tenThuoc;
	private String chucNang;
	private Date ngaySanXuat;
	private Date hanSuDung;
	private String ghiChu;
	private NhaCungCap nhaCungCap;
	private List<ChiTietDonThuoc> listThuoc;
	private List<ChiTietHoaDonNhap> listChiTietHoaDonNhap;

	public List<ChiTietDonThuoc> getListThuoc() {
		return listThuoc;
	}

	public void setListThuoc(List<ChiTietDonThuoc> listThuoc) {
		this.listThuoc = listThuoc;
	}

	public List<ChiTietHoaDonNhap> getListChiTietHoaDonNhap() {
		return listChiTietHoaDonNhap;
	}

	public void setListChiTietHoaDonNhap(List<ChiTietHoaDonNhap> listChiTietHoaDonNhap) {
		this.listChiTietHoaDonNhap = listChiTietHoaDonNhap;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHinhANh() {
		return hinhANh;
	}

	public void setHinhANh(String hinhANh) {
		this.hinhANh = hinhANh;
	}

	public String getTenThuoc() {
		return tenThuoc;
	}

	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}

	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public Date getHanSuDung() {
		return hanSuDung;
	}

	public void setHanSuDung(Date hanSuDung) {
		this.hanSuDung = hanSuDung;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
}
