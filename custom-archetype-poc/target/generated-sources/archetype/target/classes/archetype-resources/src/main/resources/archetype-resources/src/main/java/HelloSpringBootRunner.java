#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${symbol_dollar}package;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @Author Manoja Sahu
 * 
 * This class is the sample spring boot runner. Replace this class with your logic.
 * 
 * */
@SpringBootApplication
public class HelloSpringBootRunner {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootRunner.class, args);
	}

}
