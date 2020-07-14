package json.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * Create By C on 2020-07-05
 */

@ControllerAdvice
public class GlobalData {


    @ModelAttribute(value = "iniData")

    public Map<String, Object> medata() {


        Map<String, Object> map = new HashMap<>();


        map.put("name", "TT");
        map.put("age", "30");

        map.put("name", "Json");
        map.put("age", "20");


        return map;


    }

}
