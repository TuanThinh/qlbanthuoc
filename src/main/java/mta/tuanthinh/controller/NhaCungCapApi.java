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

import mta.tuanthinh.entity.NhaCungCap;
import mta.tuanthinh.services.NhaCungCapService;;

@RestController
@RequestMapping("/api/nha-cung-cap")
public class NhaCungCapApi {
	@Autowired
	private NhaCungCapService nhaCungCapService;
	
	@GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<NhaCungCap> findAll(){
		return nhaCungCapService.findAll();
	}
	
	@GetMapping(value = "/id/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public NhaCungCap findById(@PathVariable Long id){
		return nhaCungCapService.findById(id);
	}
	
	@PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
	public NhaCungCap save(@RequestBody NhaCungCap nhaCungCap) {
		return nhaCungCapService.save(nhaCungCap);
	}
	
	@PutMapping(value = "/edit", produces = {MediaType.APPLICATION_JSON_VALUE})
	public NhaCungCap update(@RequestBody NhaCungCap nhaCungCap) {
		return nhaCungCapService.save(nhaCungCap);
	}
	
	@DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String deleteById(@PathVariable Long id) {
		return nhaCungCapService.deleteById(id);
	}
}
