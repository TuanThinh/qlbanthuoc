package mta.tuanthinh.entity;

import java.util.List;

public class NhaCungCap {
	private Long id;
	private String tenNCC;
	private String diaChi;
	private String dienThoai;
	private String website;
	private String email;
	private String quocGia;
	private List<Thuoc> listThuoc;
	private List<HoaDonNhap> listHoaDonNhap;
	
	public List<Thuoc> getListThuoc() {
		return listThuoc;
	}

	public void setListThuoc(List<Thuoc> listThuoc) {
		this.listThuoc = listThuoc;
	}

	public List<HoaDonNhap> getListHoaDonNhap() {
		return listHoaDonNhap;
	}

	public void setListHoaDonNhap(List<HoaDonNhap> listHoaDonNhap) {
		this.listHoaDonNhap = listHoaDonNhap;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenNCC() {
		return tenNCC;
	}

	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	
}
