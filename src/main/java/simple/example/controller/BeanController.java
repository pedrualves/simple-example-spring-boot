package simple.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import simple.example.bean.Bean;

@RestController
public class BeanController {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	Bean home() {
		Bean a = new Bean();
		a.setAbc("123");
		a.setNum(321);
		return a;
	}

	@PostMapping("/teste/post")
	Bean testePost(@RequestBody Bean bean) {
		return bean;
	}

	@GetMapping("/teste/get")
	String testeGet(@RequestParam(required = false) String param) {
		return param;
	}

	@GetMapping("/teste/outro/{param}/get")
	String testeGet2(@PathVariable String param) {
		return param;
	}

}
