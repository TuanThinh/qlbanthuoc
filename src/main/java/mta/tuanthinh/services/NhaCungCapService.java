package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.NhaCungCap;;

public interface NhaCungCapService {
	List<NhaCungCap> findAll();
	NhaCungCap findById(Long id);
	NhaCungCap save(NhaCungCap ncc);
	NhaCungCap update(NhaCungCap ncc);
	String deleteById(Long id);
}
