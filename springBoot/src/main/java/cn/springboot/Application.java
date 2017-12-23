package cn.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cn.springboot"})   //代表类是SpringBoot的启动类
public class Application {
	
	public static void main(String[] args) {
		
		//第一种方式: 运用SpringBoot应用
		//SpringApplication.run(SpringBoot_1_01.class, args);
		
		//第二种方式
		//创建SpringApplication应用对象
		SpringApplication springApplication = new SpringApplication(Application.class);
		//设置横幅模式(设置关闭)
		springApplication.setBannerMode(Banner.Mode.OFF);
		//运行
		springApplication.run(args);
		
		  
		
	}

}
