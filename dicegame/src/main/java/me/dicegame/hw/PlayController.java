package me.dicegame.hw;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.dicegame.game.Dice;

@Controller
public class PlayController {
	//���, ���İ�, �ֻ��� ��ü ��������
	ArrayList<Integer> human = new ArrayList<Integer>();
	ArrayList<Integer> alphago = new ArrayList<Integer>();
	Dice dice1 = new Dice(); 
	Dice dice2 = new Dice(); 
	
	@RequestMapping("/play")
	public String showConfigure
		(@RequestParam(value="roll", required=false) String roll, Model model) {
		
		//play.jsp���� roll��ư ���������� �����.
		human.add(dice1.roll());
		alphago.add(dice2.roll());
		
		//jsp�� �� �����ֱ�
		model.addAttribute("alphago", alphago);
		model.addAttribute("human", human);
		
		//����
		System.out.println(dice1.roll());
		System.out.println(dice2.roll());
		for (int i : human) {
			System.out.println(human);
		}
		
		
		return "play";
	}
	
}
