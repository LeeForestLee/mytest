package cn.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.springboot.entity.Notice;
import cn.springboot.service.NoticeService;

@RestController  //这里返回的是json格式
//@Controller
public class NoticeController {
	
	//注入
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		
		return noticeService.findAll();
	}
	
	/*//分页
	@PostMapping("/findByPage")
	public Map<String, Object> findByPage(@RequestParam("page")Integer page,@RequestParam("rows")Integer rows){
		
		
		Map<String, Object> map = noticeService.findByPage(page, rows);
		
		return map;
		
	}*/

}
