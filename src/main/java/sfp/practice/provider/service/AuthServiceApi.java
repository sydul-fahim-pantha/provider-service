package sfp.practice.provider.service;

import org.springframework.stereotype.Service;

@Service 
public interface AuthServiceApi {

	public String getToken(String role); 
}
