package json.demo.controller;

import json.demo.JsonModel.*;
import json.demo.bean.User;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Create By C on 2020-07-02
 *
 * @author changtao
 */

@RestController
public class GetUserController {


    @GetMapping("/getUser")


    private List<User> getUsers() {


        List<User> users = new ArrayList<>();


        for (int i = 0; i < 7; i++) {


            User user = new User();
            user.setId(i);

            user.setUsername("TT" + i);
            user.setAddress("address" + i);
            user.setBirthday(new Date());

            users.add(user);
        }

        return users;

    }


    /**
     * 直接把参数写在Controller的形参中。这种方式只适合 get 请求中 不适用 post 请求
     */

    @GetMapping(value = "/getParames")

    public String getPar(String userName, String UserPwd) {

        System.out.println(userName + ";" + UserPwd);


        return userName + "/" + UserPwd;

    }


    /**
     * 通过HttpServletRequest 接收， get 和 post 都可以
     */


    @GetMapping(value = "/getParames1")

    public String getPar(HttpServletRequest request) {


        Map<String, String[]> Map = request.getParameterMap();


        for (java.util.Map.Entry<String, String[]> entry : Map.entrySet()) {


            String mapkey = entry.getKey();

            String[] value = entry.getValue();


            for (String s : value) {

                System.out.println(mapkey + ':' + s.toString());
            }

            //System.out.println(entry.getKey() +',' + entry.getValue());


        }


        return request.toString();

    }


    /**
     * 通过Bean 来获取入参
     *
     * @param user
     * @return
     */

    @PostMapping("posttest")


    public User getUser(@Validated @RequestBody User user) {


        System.out.println(user.getUsername());

        return user;

    }


    @GetMapping("testData")
    public String test(Model model) {

        Map<String, Object> map = model.asMap();


        Set<String> strings = map.keySet();


        for (String s : strings) {
            System.out.println(s + map.get(s));
        }


        return "test";
    }


    /**
     * o通过注解 @RequestParam 绑定参数到请求中  required = false 时参数不存在也不会报错
     *
     * @param userName
     * @param UserPwd
     * @return
     */

    @GetMapping("/getParames2")
    public String getPar3(@RequestParam(value = "userName", required = false) String userName, @RequestParam("UserPwd") String UserPwd) {


        return userName + ':' + UserPwd;
    }


    @GetMapping(value = "/json")


    private Root getJson(Auth auth) throws Exception {


        System.out.println(auth.getLicense());

        lis01 lis01 = new lis01();


        lis01.setAid("901");
        lis01.setSid("10000098");


        list02 lis02 = new list02();


        lis02.setYljglx("test");
        lis02.setYljgxz("0kkkks");


        List<Object> lis01List = new ArrayList<>();


        lis01List.add(lis01);


        List<Object> list02List = new ArrayList<>();


        list02List.add(lis02);


        List<dataset> datasetList = new ArrayList<>();


        dataset dataset = new dataset();

        dataset.setName("row01");


        dataset.setRow(lis01List);

        datasetList.add(dataset);


        dataset dataset02 = new dataset();

        dataset02.setName("row02");


        dataset02.setRow(list02List);

        datasetList.add(dataset02);


        return Result.getRoot(datasetList);


    }


}
