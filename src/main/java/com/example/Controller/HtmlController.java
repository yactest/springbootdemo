package com.example.Controller;

import com.example.dao.City;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author rongrong
 * @version 1.0
 * @description:
 * @date 2019/12/28 21:32
 */
@Controller
public class HtmlController {

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @ResponseBody
    public City index(){
        City result = new City();
        result.setCity("绵阳");
        result.setWea("阴天");
        result.setTem("5℃");
        result.setTem1("10℃");
        result.setTem2("2℃");
        return result;
    }
}