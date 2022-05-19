package fr.eni.tp.shifumi.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShifumiController {
	
	@GetMapping({"/","/game"})
	public String game() {
		return "game";
	}
	
	@GetMapping({"/result"})
	public String result() {
		return "result";
	}
	
}
