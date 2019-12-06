package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.ChiTietDonThuoc;;

public interface ChiTietDonThuocService {
	List<ChiTietDonThuoc> findAll();
	ChiTietDonThuoc findById(Long id);
	ChiTietDonThuoc save(ChiTietDonThuoc entity);
	ChiTietDonThuoc update(ChiTietDonThuoc entity);
	String deleteById(Long id);
}
