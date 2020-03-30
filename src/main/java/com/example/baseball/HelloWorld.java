package com.example.baseball;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller		//付けることでユーザーからのサクセスを受け取ることができる
public class HelloWorld {
	@GetMapping("/")		// http://~~/に続く場所へ関連付けられる
	public String hello() {
		return "hello";		//hello.htmlをユーザーへ返す
	}
}
