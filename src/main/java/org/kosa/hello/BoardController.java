package org.kosa.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")

public class BoardController {
	@GetMapping("/list")
	public void list() {
		System.out.println("board.list() 함수 호출");
	}
}
