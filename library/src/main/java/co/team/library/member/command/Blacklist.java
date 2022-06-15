package co.team.library.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.team.library.comm.Command;
import co.team.library.member.service.MemberService;
import co.team.library.member.serviceImpl.MemberServiceImpl;
import co.team.library.member.vo.MemberVO;

public class Blacklist implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 블랙리스트 확인
		MemberService dao = new MemberServiceImpl();
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = dao.memberUpdateBlack();
		request.setAttribute("members", members);
		return "administrator/blacklist";
	}

}
