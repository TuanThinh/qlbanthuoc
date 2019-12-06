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

import mta.tuanthinh.entity.ChiTietDonThuoc;
import mta.tuanthinh.services.ChiTietDonThuocService;;

@RestController
@RequestMapping("/api/chi-tiet-don-thuoc")
public class ChiTietDonThuocApi {
	@Autowired
	private ChiTietDonThuocService chiTietDonThuocService;
	
	@GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<ChiTietDonThuoc> findAll(){
		return chiTietDonThuocService.findAll();
	}
	
	@GetMapping(value = "/id/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ChiTietDonThuoc findById(@PathVariable Long id){
		return chiTietDonThuocService.findById(id);
	}
	
	@PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ChiTietDonThuoc save(@RequestBody ChiTietDonThuoc chiTietDonThuoc) {
		return chiTietDonThuocService.save(chiTietDonThuoc);
	}
	
	@PutMapping(value = "/edit", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ChiTietDonThuoc update(@RequestBody ChiTietDonThuoc chiTietDonThuoc) {
		return chiTietDonThuocService.save(chiTietDonThuoc);
	}
	
	@DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String deleteById(@PathVariable Long id) {
		return chiTietDonThuocService.deleteById(id);
	}
}
