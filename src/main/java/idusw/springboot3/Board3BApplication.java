package idusw.springboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication  //(exclude = DataSourceAutoConfiguration.class)
@EnableJpaAuditing
public class Board3BApplication {

    public static void main(String[] args) {
        SpringApplication.run(Board3BApplication.class, args);
    }

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {    //put, delete 처리
        return new HiddenHttpMethodFilter();
    }
}
