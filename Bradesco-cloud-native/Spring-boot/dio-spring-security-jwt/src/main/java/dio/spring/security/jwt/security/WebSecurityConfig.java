package dio.spring.security.jwt.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private static final String[] SWAGGER_WHITELIST = {
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**"
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .headers().frameOptions().disable()
                .and()
                .cors().and().csrf().disable()
                .addFilterAfter(new JWTFilter(), UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests()
                // Configuração correta e mais explícita das autorizações
                .requestMatchers(new AntPathRequestMatcher("/v2/api-docs")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/swagger-resources")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/swagger-resources/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/configuration/ui")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/configuration/security")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/swagger-ui.html")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/webjars/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/h2-console/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/login", HttpMethod.POST.name())).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/users", HttpMethod.POST.name())).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/users", HttpMethod.GET.name())).hasAnyRole("USERS", "MANAGERS")
                .requestMatchers(new AntPathRequestMatcher("/managers")).hasRole("MANAGERS")
                .anyRequest().authenticated()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        return http.build();
    }

    @Bean
    public ServletRegistrationBean<WebServlet> h2servletRegistration() {
        ServletRegistrationBean<WebServlet> registrationBean = new ServletRegistrationBean<>(new WebServlet());
        registrationBean.addUrlMappings("/h2-console/*");
        return registrationBean;
    }
}
