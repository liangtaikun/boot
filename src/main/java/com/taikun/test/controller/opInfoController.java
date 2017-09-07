package com.taikun.test.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taikun.test.dao.T01PsnEntityRepository;
import com.taikun.test.entity.T01PsnEntity;


@RestController
public class opInfoController {
	@Autowired
	private T01PsnEntityRepository t01PsnEntityRepository;
	private final Logger logger=  LogManager.getLogger(opInfoController.class.getName());
	//private final Logger logger = Logger.getLogger(opInfoController.class);
	@RequestMapping(value = "/test")
	public String test(Map<String, Object> map, HttpSession session) {
        System.err.println("nia");
		map.put("state", 0);
		session.setAttribute("user", "1234");
		map.put("userId", 102);
		return "/index.jsp";
	}
	@RequestMapping(value = "/OpInfo/findOpInfo", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> findOpInfo(@RequestBody String pid) {
		logger.info("工号："+pid);
		T01PsnEntity t01PsnEntity = t01PsnEntityRepository.findByPid(pid);
		Map<String, Object> map = new HashMap<String, Object>();
		if (t01PsnEntity != null && "2".equals(t01PsnEntity.getT01persontype())) {
			// 判断是否人员状态是否有效
			if ("2".equals(t01PsnEntity.getT01status()) || "3".equals(t01PsnEntity.getT01status())) {
				map.put("t01PsnEntity", t01PsnEntity);
				
			} else {
				map.put("msg", 1);//工号失效
			}
		} else {
			map.put("msg", 0);//工号无权限或不存在
		}
		return map;
	}
}
