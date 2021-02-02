package org.poxiao.dao;

import org.springframework.stereotype.Component;

@Component("studentdao")
public class IStudentDao {
	public void addStudent(Student student) {
		System.out.println("增加学生。。。");
	}

}
