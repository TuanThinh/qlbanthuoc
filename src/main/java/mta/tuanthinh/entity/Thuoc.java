package mta.tuanthinh.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Thuoc implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String hinhAnh;
	private String tenThuoc;
	private String chucNang;
	private Date ngaySanXuat;
	private Date hanSuDung;
	private String ghiChu;
	private NhaCungCap nhaCungCap;
	private Integer soLuongTon;
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
		return hinhAnh;
	}

	public void setHinhANh(String hinhANh) {
		this.hinhAnh = hinhANh;
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

	public String getNgaySanXuat() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(ngaySanXuat);
	}

	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public String getHanSuDung() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(hanSuDung);
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

	public Integer getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(Integer soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	
}
