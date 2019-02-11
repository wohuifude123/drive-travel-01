package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 这里的@RestController   相当于@ResponseBody + @Controller
 */
@RestController
public class TripController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloSpringBoot(){
        return "Hello SpringBoot!";
    }

    /**
     * 城市列表接口
     * @return
     */
    @RequestMapping(value = "/trip/api/city",method = RequestMethod.GET)
    public JSONObject tripCity(){
        JSONObject createJSONObject = createCityJsonObject();
        return createJSONObject;
    }

    /**
     * 推荐路书接口
     * @return
     */
    @RequestMapping(value = "/trip/api/recommend",method = RequestMethod.GET)
    public JSONObject tripRecommend(){
        JSONObject createJSONObject = createCityJsonObject();
        return createJSONObject;
    }

    private JSONObject createCityJsonObject() {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonCity = new JSONObject();
        jsonObject.put("code", "0000");
        jsonObject.put("message", "处理成功");
        jsonObject.put("sign", null);

        jsonCity.put("id", 1);
        jsonCity.put("caption", "路书描述");

        jsonObject.put("data", jsonCity);

//        System.out.println(jsonObject.toString());
        return jsonObject;
    }

}



