package com.wildSchool.challenge;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}
	@RequestMapping(value = "/")
	@ResponseBody
	public String nameDoctor(){

		return "<ul><li><a href=/doctor/1>doctor 1</a></li>" +
				"<li><a href=/doctor/2>doctor 2</a></li>" +
				"<li><a href=/doctor/3>doctor 3</a></li>" +
				"<li><a href=/doctor/4>doctor 4</a></li></ul>";

	}

	@RequestMapping(value = "/doctor/1")
	@ResponseBody
	public String nameDoctor1(){

		return "William Hartnell";

	}
	@RequestMapping(value = "/doctor/2")
	@ResponseBody
	public String nameDoctor2(){

		return "Patrick Troughton";

	}
	@RequestMapping(value = "/doctor/3")
	@ResponseBody
	public String nameDoctor3(){

		return "Jon Pertwee";

	}
	@RequestMapping(value = "/doctor/4")
	@ResponseBody
	public String nameDoctor4(){

		return "Tom Baker";

	}



}
