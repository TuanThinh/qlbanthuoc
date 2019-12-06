package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.Thuoc;;

public interface ThuocService {
	public List<Thuoc> findAll();

	public Thuoc findById(Long id);

	public List<Thuoc> findByTenThuoc(String name);

	public Thuoc save(Thuoc thuoc);
	
	public Thuoc update(Thuoc thuoc);

	public String deleteById(Long thuocId);
}
