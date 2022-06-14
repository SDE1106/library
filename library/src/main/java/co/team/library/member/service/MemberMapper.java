package co.team.library.member.service;

import java.util.List;


import co.team.library.member.vo.MemberVO;

public interface MemberMapper {
	List<MemberVO> memberSelectList(); //전체리스트 (관리자 페이지)
	List<MemberVO> memberBlackSelectList(); //블랙전체리스트
	MemberVO memberSelect(MemberVO vo); // 한명조회 (마이페이지)
	int memberInsert(MemberVO vo); // 추가 (가입)
	int memberUpdate(MemberVO vo); // 변경 (마이페이지)
	int memberUpdateBlack(MemberVO vo); // 블랙리스트 추가
	int memberUpdatenormal(MemberVO vo); // 블랙리스트를 정상으로
	int memberDelete(MemberVO vo); // 정보삭제 (마이페이지)
}
