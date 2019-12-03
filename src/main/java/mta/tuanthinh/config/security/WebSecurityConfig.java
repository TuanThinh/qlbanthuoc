package mta.tuanthinh.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	@Qualifier("userDetailServiceImpl")
	private UserDetailsService userDetailsService;
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/static/**", "/assets/**", "/images/**", "/vendors/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().headers().frameOptions().sameOrigin().and().
		   authorizeRequests().and().httpBasic().disable();
		
		http
			.authorizeRequests()
				.antMatchers("/login", "/logout", "/sanpham/**").permitAll()
				.antMatchers("/", "/home", "/chat-message", "/map", "/caching").access("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
				.antMatchers("/manager-user").access("hasRole('ROLE_ADMIN')")
				.anyRequest().authenticated()
				.and()
			.exceptionHandling()
				.accessDeniedPage("/403")
				.and()
			.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/sign-in")
				.usernameParameter("username")
				.passwordParameter("password")
				.defaultSuccessUrl("/home", true)
				.failureUrl("/login?error=true")
				.and()
			.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login")
				.deleteCookies("JSESSIONID")
				.invalidateHttpSession(true)
				.and()
			.rememberMe()
				.key("uniqueAndSecret").tokenValiditySeconds(86400);
			
			
	}
	
}
