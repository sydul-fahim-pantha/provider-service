package sfp.practice.provider.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AuthConfig {
	
	@Bean(name = "eagerAuthApi")
	public AuthServiceApi getEagerAuthApi() {
		System.out.println(">>>>>>>>>>>>>>>> Eager AuthBean initialized.");
		return new AuthServiceApiImpl();
	}
	
	@Bean(name = "lazyAuthApi")
	@Lazy(true)
	public AuthServiceApi getLazyAuthApi() {
		System.out.println(">>>>>>>>>>>>>>>> Lazy AuthBean initialized.");
		return new AuthServiceApiImpl();
	}
}
