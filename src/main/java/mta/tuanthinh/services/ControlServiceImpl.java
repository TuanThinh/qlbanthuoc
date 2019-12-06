package mta.tuanthinh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mta.tuanthinh.client.HttpURLConnectionServer;
import mta.tuanthinh.entity.Control;

@Service
public class ControlServiceImpl implements ControlService{

	@Autowired
	private HttpURLConnectionServer HttpURLConnectionClient;
	@Value("${server.url}")
	private String serverURL;
	
	@Override
	public List<Control> findAll() {
		String URL = serverURL + "/api/control/all";
		try {
			return HttpURLConnectionClient.getListResult(URL, Control.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Control findById(Long id) {
		String URL = serverURL + "/api/control/id/" + id;
		try {
			return HttpURLConnectionClient.getUniqueResult(URL, Control.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Control save(Control Control) {
		String URL = serverURL + "/api/control/add";
		try {
			return HttpURLConnectionClient.PostResult(URL, Control.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Control update(Control control) {
		String URL = serverURL + "/api/control/edit";
		try {
			return HttpURLConnectionClient.PutResult(URL, Control.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String deleteById(Long id) {
		String URL = serverURL + "/api/control/delete/" + id;
		try {
			return HttpURLConnectionClient.sendDeleteRequest(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
