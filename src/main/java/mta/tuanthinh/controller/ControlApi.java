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

import mta.tuanthinh.entity.Control;
import mta.tuanthinh.services.ControlService;

@RestController
@RequestMapping("/api/control")
public class ControlApi {
	@Autowired
	private ControlService controlService;
	
	@GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Control> findAll(){
		return controlService.findAll();
	}
	
	@GetMapping(value = "/id/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Control findById(@PathVariable Long id){
		return controlService.findById(id);
	}
	
	@PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Control save(@RequestBody Control control) {
		return controlService.save(control);
	}
	
	@PutMapping(value = "/edit", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Control update(@RequestBody Control control) {
		return controlService.save(control);
	}
	
	@DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String deleteById(@PathVariable Long id) {
		return controlService.deleteById(id);
	}
}
