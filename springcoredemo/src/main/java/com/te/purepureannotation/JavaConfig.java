package com.te.purepureannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean(name = { "player", "athlete" })
	public Players getPlayer() {
		return new Players();
	}

	@Bean(name = { "football", "soccer" })
	public Football getGame() {
		Football soccer = new Football(getPlayer());
		return soccer;
	}

}
