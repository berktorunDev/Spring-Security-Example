package securing.webapp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableAutoConfiguration
public class WebSecurityConfig {

        // This class is a Spring configuration class for configuring web security.

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

                // This method configures the security filter chain for HTTP requests.

                http
                                .authorizeHttpRequests((requests) -> requests
                                                .requestMatchers("/", "/home").permitAll() // Allow access to '/' and
                                                                                           // '/home' without
                                                                                           // authentication.
                                                .anyRequest().authenticated()) // Require authentication for all other
                                                                               // requests.

                                .formLogin((form) -> form
                                                .loginPage("/login") // Specify the custom login page.
                                                .permitAll()) // Allow access to the login page without authentication.

                                .logout((logout) -> logout.permitAll()); // Allow users to log out and access this
                                                                         // feature without authentication.

                return http.build();
        }

        @Bean
        public UserDetailsService userDetailsService() {

                // This method defines user details for authentication.

                UserDetails user = User.withDefaultPasswordEncoder()
                                .username("user") // Set the username.
                                .password("password") // Set the password.
                                .roles("USER") // Assign the 'USER' role to the user.
                                .build();

                return new InMemoryUserDetailsManager(user); // Create an in-memory user details manager with the
                                                             // defined user.
        }
}
