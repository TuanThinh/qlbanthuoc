package mta.tuanthinh.entity;

import java.io.Serializable;

public class SanPham extends BaseEntity implements Serializable {
	
	private Long id;
	private String tenSp;
	private String manHinh;
	private String heDieuHanh;
	private String cameraSau;
	private String cameraTruoc;
	private String cpu;
	private String ram;
	private String boNhoTrong;
	private String theSim;
	private String dungLuongPin;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public String getManHinh() {
		return manHinh;
	}
	public void setManHinh(String manHinh) {
		this.manHinh = manHinh;
	}
	public String getHeDieuHanh() {
		return heDieuHanh;
	}
	public void setHeDieuHanh(String heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}
	public String getCameraSau() {
		return cameraSau;
	}
	public void setCameraSau(String cameraSau) {
		this.cameraSau = cameraSau;
	}
	public String getCameraTruoc() {
		return cameraTruoc;
	}
	public void setCameraTruoc(String cameraTruoc) {
		this.cameraTruoc = cameraTruoc;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getBoNhoTrong() {
		return boNhoTrong;
	}
	public void setBoNhoTrong(String boNhoTrong) {
		this.boNhoTrong = boNhoTrong;
	}
	public String getTheSim() {
		return theSim;
	}
	public void setTheSim(String theSim) {
		this.theSim = theSim;
	}
	public String getDungLuongPin() {
		return dungLuongPin;
	}
	public void setDungLuongPin(String dungLuongPin) {
		this.dungLuongPin = dungLuongPin;
	}
	
}
