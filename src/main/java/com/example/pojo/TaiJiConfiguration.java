package com.example.pojo;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Configuration
@EnableConfigurationProperties(TaiJiProperties.class)
public class TaiJiConfiguration {
	
	@Autowired 
	private TaiJiProperties TJProperties;
	
	public void setConfig() {
		
		InetAddress inetAddress =  TJProperties.getRemoteAddress();
		
		String username =  TJProperties.getSecurity().getUsername();
		String password =  TJProperties.getSecurity().getPassword();
		
		List<String> list =  TJProperties.getSecurity().getRoles();
		
		System.out.println("TaijConfiguration:=>"+"inetAddress:"+inetAddress+"username:"+username
				+"list:"+list);
	}
}