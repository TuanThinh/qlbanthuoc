package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.KhachHang;

public interface KhachHangService {
	List<KhachHang> findAll();
	KhachHang findById(Long id);
	KhachHang save(KhachHang khachhang);
	KhachHang update(KhachHang khachhang);
	String deleteById(Long id);
}
