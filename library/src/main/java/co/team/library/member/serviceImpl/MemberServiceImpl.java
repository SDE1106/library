package co.team.library.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.team.library.comm.DataSource;
import co.team.library.member.service.MemberMapper;
import co.team.library.member.service.MemberService;
import co.team.library.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService{
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	
	
	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}
	@Override
	public List<MemberVO> memberBlackSelectList() {
		return map.memberBlackSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}
	
	@Override
	public int memberUpdateBlack(MemberVO vo) {
		return map.memberUpdateBlack(vo);
	}
	
	@Override
	public int memberUpdatenormal(MemberVO vo) {
		return map.memberUpdatenormal(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return map.memberDelete(vo);
	}



	
}
