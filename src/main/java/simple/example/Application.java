package simple.example;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder().bannerMode(Mode.OFF).sources(Application.class).run(args);
	}

}
