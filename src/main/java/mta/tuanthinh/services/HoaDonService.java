package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.HoaDon;

public interface HoaDonService {
	List<HoaDon> findAll();
	HoaDon findById(Long id);
	HoaDon save(HoaDon hoaDon);
	HoaDon update(HoaDon hoaDon);
	String deleteById(Long id);
}
