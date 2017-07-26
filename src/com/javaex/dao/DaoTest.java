package com.javaex.dao;

import java.util.List;

import com.javaex.vo.EmaillistVo;

public class DaoTest {

	public static void main(String[] args) {
		EmaillistDao dao=new EmaillistDao();
		List <EmaillistVo> list=dao.getlist();
		System.out.println(list.toString());
	}

}
