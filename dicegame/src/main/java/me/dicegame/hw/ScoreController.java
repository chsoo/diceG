package me.dicegame.hw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScoreController {

	@RequestMapping("/score")
	public String showConfigure() {
		
		
		return "score";
	}
}
