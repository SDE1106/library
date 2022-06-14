package co.team.library.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.team.library.comm.Command;

public class AddBlacklist implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 블랙리스트 추가
		MemeberService dao = new MemeberServiceImpl();
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = dao.memberSelectList();
		
		if(members.getrentcount == 5) {			
			request.setAttribute("members", members);
		}
		return "administrator/addBlacklist";
	}

}
