package co.team.library.qna.command;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.team.library.comm.Command;
import co.team.library.qna.service.QnaService;
import co.team.library.qna.serviceImpl.QnaServiceImpl;
import co.team.library.qnavo.QnaVO;

public class QnaInput implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		QnaService dao = new QnaServiceImpl();
		QnaVO vo = new QnaVO();
		try {			
			vo.setId("id");
			vo.setTitle("title");
			vo.setContent("content");
			vo.setWdate(Date.valueOf("wdate"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		int n = dao.qnaInsert(vo);
		if(n != 0) {
			request.setAttribute("message", "정상입력");
		} else {
			request.setAttribute("message", "입력실패!");
		}
		return "qna/qnaMessage";
	}

}
