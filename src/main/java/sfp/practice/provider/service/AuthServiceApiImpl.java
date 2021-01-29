package sfp.practice.provider.service;


public class AuthServiceApiImpl implements AuthServiceApi {

	@Override
	public String getToken(String role) {
		return role + "-token";
	}
}
