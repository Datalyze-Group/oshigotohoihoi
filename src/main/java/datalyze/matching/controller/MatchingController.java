package datalyze.matching.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class MatchingController {

	@RequestMapping("/matching")
	public String matching(Model model) {
		model.addAttribute("title", "人材・案件自動マッチング");
		return "matching/index";
	}

}
