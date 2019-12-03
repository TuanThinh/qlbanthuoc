package mta.tuanthinh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@ComponentScan("mta.tuanthinh.*")
//@PropertySources({ @PropertySource("classpath:application.properties") })
@EnableCaching
public class CongNgheWebNangCaoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CongNgheWebNangCaoApplication.class, args);
	}

}
