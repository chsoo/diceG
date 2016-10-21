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
		model.addAttribute("alphago", alphago);
		model.addAttribute("human", human);
		
		//찍어보기
		System.out.println("human-"+dice1.roll());
		System.out.println("alphago-"+dice2.roll());
		/*for (int i : human) {
			System.out.println("human:"+human);
			System.out.println("alphago:"+alphago);
			//arraylist의 모든 변수들의 합을 구하고, 29 넘으면 딴대로 리턴 시켜야지
			if (human.get(i) != null) {
				sum_human += human.get(sum_human);
				sum_alphago += alphago.get(sum_alphago);
			}
			System.out.println("sum_human:"+sum_human);
			System.out.println("sum_alphago:"+sum_alphago);
		}*/
		Sum_alphago();
		Sum_human();
		System.out.println("sum_human"+sum_human);
		//if (sum>29) return score, else return play
		if (sum_alphago > 29) return "score";
		else return "play";
	}
	public int Sum_human () {
		for(int i=0 ; i<human.size() ; i++) {
			sum_human += human.get(i);
		}
		return sum_human;
	}
	public int Sum_alphago() {
		for(int i=0 ; i<human.size() ; i++) {
			sum_alphago += alphago.get(i);
		}
		return sum_alphago;
	}
	
}
