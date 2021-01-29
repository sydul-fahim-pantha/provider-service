package sfp.practice.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderServiceApplication.class, args);
	}
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/port")
	public String getVersion() {
		return "{\"port\":\""+port+"\"}";
	}
	
	@Autowired 
	@Qualifier("eagerAuthApi")
	private AuthServiceApi eagerAuthApi;   

	@GetMapping("/eager-auth-token")
	public String getEagerAuthToken() {
		return "{\"token\":\""+eagerAuthApi.getToken("eager")+"\"}";
	}

	@Lazy
	@Autowired 
	@Qualifier("lazyAuthApi")
	private AuthServiceApi lazyAuthApi;   

	@GetMapping("/lazy-auth-token")
	public String getLazyAuthToken() {
		return "{\"token\":\""+lazyAuthApi.getToken("lazy")+"\"}";
	}
}
