package com.mgmt.ActuatorEndpoint;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "userAppInfo")
public class UserInfoEndPoint {
	
	@ReadOperation
	public UserAppInfo userAppInfo() {
		Map<String, Object> details = new LinkedHashMap<>();
		details.put("App Location", "!!MARS!!");
		details.put("Status", "Reporting from Mars! All Good");
		UserAppInfo health = new UserAppInfo();
		health.setHealthDetails(details);
		return health;
	}

}
