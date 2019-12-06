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

import mta.tuanthinh.entity.KhachHang;
import mta.tuanthinh.services.KhachHangService;;

@RestController
@RequestMapping("/api/khach-hang")
public class KhachHangApi {
	@Autowired
	private KhachHangService khachHangService;
	
	@GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<KhachHang> findAll(){
		return khachHangService.findAll();
	}
	
	@GetMapping(value = "/id/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public KhachHang findById(@PathVariable Long id){
		return khachHangService.findById(id);
	}
	
	@PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
	public KhachHang save(@RequestBody KhachHang khachHang) {
		return khachHangService.save(khachHang);
	}
	
	@PutMapping(value = "/edit", produces = {MediaType.APPLICATION_JSON_VALUE})
	public KhachHang update(@RequestBody KhachHang khachHang) {
		return khachHangService.save(khachHang);
	}
	
	@DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String deleteById(@PathVariable Long id) {
		return khachHangService.deleteById(id);
	}
}
