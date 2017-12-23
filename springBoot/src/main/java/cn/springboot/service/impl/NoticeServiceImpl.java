package cn.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springboot.dao.NoticeDao;
import cn.springboot.entity.Notice;
import cn.springboot.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService {
	
	//注入
	@Autowired
	private NoticeDao noticeDao;

	@Override
	public List<Notice> findAll() {
		
		return noticeDao.findAll();
	}

}
