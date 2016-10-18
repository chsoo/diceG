package me.dicegame.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigureController {
	/*private ConfigureService configureService;

	@Autowired
	public void setConfigureService(ConfigureService configureService) {
		this.configureService = configureService;
	}*/
	
	@RequestMapping("/configure")
	public String showConfigure() {
		
		
		return "configure";
	}

	
}
