package me.dicegame.hw;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.dicegame.game.Entry;

@Controller
public class ScoreController {
	private ArrayList<Entry> scores;
	
	
	
	
	
	@RequestMapping("/score")
	public String showConfigure() {
		
		
		return "score";
	}
}
