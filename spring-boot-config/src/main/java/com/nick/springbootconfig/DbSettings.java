package com.nick.springbootconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties("db")
public class DbSettings {

	private String connection;
	private String host;
	private int port;   //type safety during start up
	
	@Override
	public String toString() {
		return "DbSettings [connection=" + connection + ", host=" + host + ", port=" + port + "]";
	}
}
