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

import mta.tuanthinh.entity.HoaDon;
import mta.tuanthinh.services.HoaDonService;;

@RestController
@RequestMapping("/api/hoa-don")
public class HoaDonApi {
	@Autowired
	private HoaDonService hoaDonService;
	
	@GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<HoaDon> findAll(){
		return hoaDonService.findAll();
	}
	
	@GetMapping(value = "/id/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public HoaDon findById(@PathVariable Long id){
		return hoaDonService.findById(id);
	}
	
	@PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
	public HoaDon save(@RequestBody HoaDon hoaDon) {
		return hoaDonService.save(hoaDon);
	}
	
	@PutMapping(value = "/edit", produces = {MediaType.APPLICATION_JSON_VALUE})
	public HoaDon update(@RequestBody HoaDon hoaDon) {
		return hoaDonService.save(hoaDon);
	}
	
	@DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String deleteById(@PathVariable Long id) {
		return hoaDonService.deleteById(id);
	}
}
