package simple.example.producers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyProducerSpring {

	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
	RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
	
//	template.convertAndSend("Hello, world!");
//	Thread.sleep(1000);
//	ctx.destroy();
	
}
