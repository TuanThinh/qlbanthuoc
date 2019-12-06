package mta.tuanthinh.services;

import java.util.List;

import mta.tuanthinh.entity.Control;

public interface ControlService {
	List<Control> findAll();
	Control findById(Long id);
	Control save(Control control);
	Control update(Control control);
	String deleteById(Long id);
}
