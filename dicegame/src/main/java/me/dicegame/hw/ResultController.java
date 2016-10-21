package me.dicegame.hw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {

	@RequestMapping("/result")
	public String showResult() {
		
		
		return "result";
	}
}
