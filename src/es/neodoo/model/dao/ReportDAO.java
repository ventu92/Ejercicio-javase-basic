package es.neodoo.model.dao;

import java.util.List;

import es.neodoo.model.vo.TeacherVO;

public class ReportDAO {

	public List<TeacherVO> getLstTeacher() {

		List<TeacherVO> teachers = null;

		TeacherVO teacher = null;

		teacher = new TeacherVO("x", "x");
		teachers.add(teacher);

		teacher = new TeacherVO("x", "x");
		teachers.add(teacher);

		return teachers;

	}

}
