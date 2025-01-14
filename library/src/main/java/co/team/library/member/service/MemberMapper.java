package co.team.library.member.service;

import java.util.List;


import co.team.library.member.vo.MemberVO;

public interface MemberMapper {

	List<MemberVO> memberSelectList(); //전체리스트 (관리자 페이지)
	MemberVO memberSelect(MemberVO vo); // 한명조회 (마이페이지)
	int memberInsert(MemberVO vo); // 추가 (가입)
	int memberUpdate(MemberVO vo); // 변경 (마이페이지)
	int memberDelete(MemberVO vo); // 정보삭제 (마이페이지)
}
