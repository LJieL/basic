package com.example.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("info")
//@Configuration也可
public class Info {
	@Value("${info.person.name}")
	private String name;
	
	@Value("${info.person.email}")
	private String email;
	
	@Value("${info.person.phone}")
	private String phone;
}