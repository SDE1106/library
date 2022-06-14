package co.team.library.member.service;

import java.util.List;

import co.team.library.member.vo.MemberVO;



public interface MemberService {
	List<MemberVO> memberSelectList(); //전체리스트
	MemberVO MemberSelect(MemberVO vo); // 한명조회
	int memberInsert(MemberVO vo); // 추가
	int memberUpdate(MemberVO vo); // 변경
	int memberDelete(MemberVO vo); // 정보삭제
}
