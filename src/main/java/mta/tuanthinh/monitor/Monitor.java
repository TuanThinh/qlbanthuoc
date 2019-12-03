package mta.tuanthinh.monitor;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Monitor {
	
	public Map<String, LinkedList<Long>> map = new HashMap<String, LinkedList<Long>>();
	
	public int convertMillisToMinute(Long millis) {
		return (int) ((millis / 1000) / 60);
	}
	
	public int countRequest(String url) {
		monitoringRequest(url);
		int countRequest = 1;
		LinkedList<Long> listTime = map.get(url);
		int sizeList = listTime.size();
		Long lastTime = listTime.get(sizeList - 1);
		for(int i = sizeList - 2; i >= 0; i--) {
			Long temp = listTime.get(i);
			int time = convertMillisToMinute(lastTime - temp);
			if(time <= 5) {
				countRequest++;
			} else break;
			if(countRequest > 2) break;
		}
		return countRequest;
	}
	
	public void monitoringRequest(String url) {
		LinkedList<Long> listTime = new LinkedList<>();
		if(map.containsKey(url)) {
			listTime = map.get(url);
			listTime.add(System.currentTimeMillis());
			map.put(url, listTime);
		} else {
			listTime.add(System.currentTimeMillis());
			map.put(url, listTime);
		}
	}
}
