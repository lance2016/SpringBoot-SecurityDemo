package com.lance;

import com.lance.entity.Msg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	@RequestMapping("/index")
	public String index(Model model) {
		Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
		model.addAttribute("msg", msg);
		return "index";
	}

	@RequestMapping("test")
	public String test(){
		return "test";
	}

	@RequestMapping("login")
	public String login(){
		return "login";
	}

}
