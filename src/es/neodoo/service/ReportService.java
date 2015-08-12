package es.neodoo.service;

import java.util.List;

import es.neodoo.model.dao.ReportDAO;
import es.neodoo.model.vo.TeacherVO;

public class ReportService {

	public void generate() {

		// Obtenemos el listado de profesores
		ReportDAO reportDAO = new ReportDAO();
		List<TeacherVO> teachers = reportDAO.getLstTeacher();

		// Generamos el informe con el listado obtenido
		doReport(teachers);

	}

	public void doReport(List<TeacherVO> teachers) {

		// TODO

	}

}
