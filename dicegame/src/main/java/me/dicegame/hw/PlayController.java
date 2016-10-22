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
	public int sum_human=0;
	public int sum_alphago=0;
	
	@RequestMapping("/play")
	public String showPlay
		(@RequestParam(value="roll", required=false) String roll, Model model) {
		
		//play.jsp에서 roll버튼 누를때마다 저장됨. 왜냐면 함수가 게속 도니까
		human.add(dice1.roll());
		alphago.add(dice2.roll());
		
		//jsp로 값 보내주기
		model.addAttribute("human", human);
		model.addAttribute("alphago", alphago);
		//array 마지막 값을 계속 더해줌
		sum_human += human.get(human.size()-1);
		sum_alphago += alphago.get(alphago.size()-1);
		//찍어보기
		System.out.println("sum_human"+sum_human);
		System.out.println("sum_alphago"+sum_alphago);
		
		//if (sum>29) return score, else return play
		if (sum_alphago > 29 || sum_human > 29 ) return "score";
		else return "play";

	}
	

}
