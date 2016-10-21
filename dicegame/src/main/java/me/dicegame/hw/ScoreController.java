package me.dicegame.hw;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.dicegame.game.Entry;

@Controller
public class ScoreController {
	
	@RequestMapping("/score")
	public String showScore() {
		
	
		
		return "score";
	}
}
