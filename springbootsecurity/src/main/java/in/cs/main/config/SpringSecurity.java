package in.cs.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

import in.cs.main.service.UserDetailServiceImpl;

@Configuration
@EnableWebSecurity
public class SpringSecurity {
	
	private static final String DaoAuthenticationProvider = null;
	@Autowired
	UserDetailServiceImpl userdetails;
	
	@Bean
	public SecurityFilterChain securitychain(HttpSecurity http) {
		 http.csrf(csrf->csrf.disable())
		 .authorizeHttpRequests(auth->auth
				 .requestMatchers("/auth/**").permitAll()
				 .anyRequest().authenticated()
				 );
		 
		 return http.build();
		
	}
	

	@Bean
	public AuthenticationProvider authProvider() {

	    DaoAuthenticationProvider authProvider =
	            new DaoAuthenticationProvider();

	    authProvider.setUserDetailsService(userdetails);
	    authProvider.setPasswordEncoder(passwordEncoder());

	    return authProvider;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		// TODO Auto-generated method stub
		return new BCryptPasswordEncoder();;
	}

}
