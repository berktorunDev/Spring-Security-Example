package securing.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    // This class is marked as a configuration class, indicating that it contains
    // configuration for Spring.

    public void addViewControllers(ViewControllerRegistry registry) {
        // This method is used to configure simple automated controllers that render
        // views.

        // The following lines configure URL paths and map them to specific view names.
        // This means that when users access these URLs, they will be directed to the
        // corresponding views.
        // In this case, when users access '/home', they will see the 'home' view.
        registry.addViewController("/home").setViewName("home");
        // The '/' URL, which is typically the root of the web application, is also
        // mapped to the 'home' view.
        registry.addViewController("/").setViewName("home");
        // '/hello' URL is mapped to the 'hello' view.
        registry.addViewController("/hello").setViewName("hello");
        // '/login' URL is mapped to the 'login' view.
        registry.addViewController("/login").setViewName("login");
    }
}
