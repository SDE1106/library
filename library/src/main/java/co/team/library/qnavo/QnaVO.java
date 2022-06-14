package co.team.library.qnavo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QnaVO {
	private int boardNumber;
	private String id;
	private String title;
	private String content;
	private Date wdate;
	
	public int getBoardNumber() {
		return boardNumber;
	}
	public void setBoardnumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	
	
	
	
	
	
}
