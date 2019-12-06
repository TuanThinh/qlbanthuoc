package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.ChiTietHoaDonNhap;

public interface ChiTietHoaDonNhapService {
	List<ChiTietHoaDonNhap> findAll();
	ChiTietHoaDonNhap findById(Long id);
	ChiTietHoaDonNhap save(ChiTietHoaDonNhap entity);
	ChiTietHoaDonNhap update(ChiTietHoaDonNhap entity);
	String deleteById(Long id);
}
