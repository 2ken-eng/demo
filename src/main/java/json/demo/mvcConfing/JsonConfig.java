package json.demo.mvcConfing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * Create By C on 2020-07-02
 *
 * @author changtao
 */


@Configuration
public class JsonConfig {


    @Bean
    ObjectMapper objectMapper() {

        ObjectMapper om = new ObjectMapper();


        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH/mm/ss"));
        return om;


    }


}
