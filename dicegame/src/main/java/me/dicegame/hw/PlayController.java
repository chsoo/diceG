package me.dicegame.hw;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.dicegame.game.Dice;

@Controller
public class PlayController {
	//사람, 알파고, 주사위 객체 만들어야지
	ArrayList<Integer> human = new ArrayList<Integer>();
	ArrayList<Integer> alphago = new ArrayList<Integer>();
	Dice dice1 = new Dice(); 
	Dice dice2 = new Dice(); 
	
	@RequestMapping("/play")
	public String showConfigure
		(@RequestParam(value="roll", required=false) String roll, Model model) {
		
		//play.jsp에서 roll버튼 누를때마다 저장됨.
		human.add(dice1.roll());
		alphago.add(dice2.roll());
		
		//jsp로 값 보내주기
		model.addAttribute("alphago", alphago);
		model.addAttribute("human", human);
		
		//찍어보기
		System.out.println(dice1.roll());
		System.out.println(dice2.roll());
		for (int i : human) {
			System.out.println(human);
		}
		
		
		return "play";
	}
	
}
