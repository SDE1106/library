package co.team.library.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.team.library.comm.Command;
import co.team.library.member.service.MemberService;
import co.team.library.member.serviceImpl.MemberServiceImpl;
import co.team.library.member.vo.MemberVO;

public class Login implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberServiceImpl();
		HttpSession session = request.getSession();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = dao.MemberSelect(vo);
		
		if(vo != null) {
			session.setAttribute("id", vo.getId());
			session.setAttribute("name", vo.getName());
			/* request.setAttribute("message", vo.getName()+"님 환영합니다!"); */
			return "home/home";
		}else {
			request.setAttribute("message", "아이디 또는 패스워드가 일치하지 않습니다.");
		}
		
		
		
		return "member/login";
	}

}
