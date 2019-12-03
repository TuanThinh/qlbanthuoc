package mta.tuanthinh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mta.tuanthinh.entity.SanPham;
import mta.tuanthinh.service.SanPhamService;

@RestController
@RequestMapping("/sanpham")
public class SanPhamController {
	@Autowired
	private SanPhamService sanPhamService;

	@GetMapping(value = "/all", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<SanPham> geList() {
		return (List<SanPham>) sanPhamService.findAll();
	}

	@GetMapping(value = "/id/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public SanPham getSanPhamById(@PathVariable Long id) {
		return sanPhamService.findById(id);
	}

	@GetMapping(value = "/tensp/{tensp}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<SanPham> getUserByUsername(@PathVariable String tensp) {
		return sanPhamService.findByTenSp(tensp);
	}

	@PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8"})
	public SanPham addSanPham(@RequestBody SanPham sanPham) {
		return sanPhamService.save(sanPham);
	}

	@PutMapping(value = "/edit", produces = { MediaType.APPLICATION_JSON_VALUE })
	public SanPham updateSanPham(@RequestBody SanPham sanPham) {
		return sanPhamService.updateSanPham(sanPham);
	}

	@DeleteMapping(value = "/delete/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String deleteSanPham(@PathVariable Long id) {
		return sanPhamService.deleteById(id);
	}
}
