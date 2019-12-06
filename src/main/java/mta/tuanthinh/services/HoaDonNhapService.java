package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.HoaDonNhap;

public interface HoaDonNhapService {
	List<HoaDonNhap> findAll();
	HoaDonNhap findById(Long id);
	HoaDonNhap save(HoaDonNhap hoaDonNhap);
	HoaDonNhap update(HoaDonNhap hoaDonNhap);
	String deleteById(Long id);
}
