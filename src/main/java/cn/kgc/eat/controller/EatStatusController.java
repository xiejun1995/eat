package cn.kgc.eat.controller;
import cn.kgc.eat.service.EatStatusService;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
@Controller
@RequestMapping("")
public class EatStatusController{
    private Logger logger=Logger.getLogger(EatStatusController.class);
    @Resource
    private EatStatusService EatStatusService;

}