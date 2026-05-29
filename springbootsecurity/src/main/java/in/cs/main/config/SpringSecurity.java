package in.cs.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurity {
	
	@Bean
	public SecurityFilterChain securitychain(HttpSecurity http) {
		 http.csrf(null)
		 .authorizeHttpRequests(auth->auth
				 .requestMatchers("/auth/**").permitAll()
				 .anyRequest().authenticated()
				 );
		 
		 return http.build();
		
	}

}
