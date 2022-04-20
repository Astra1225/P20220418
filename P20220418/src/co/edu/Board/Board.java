package co.edu.Board;

/*<게시판>

게시글 번호 / 제목 / 내용 /작성자 / 작성일시


ArrayList<Board> 컬렉션 사용(배열대신에)
1. 글등록 2. 글수정 3. 글삭제 4. 글상세조회(글번호) 5. 전체목록 6.종료

필요한 클래스: Board, BoardApp(등록, 수정, 삭제, 상세조회, 목록) <- BoardService
BoardExe(메인 Method); <- 컨트롤 역할.
*/

public class Board {
	private String register;
	private String title;
	private String content;
	private String writer;
	private String time;
	
	
	//생성자
	public Board() {
		
	}
	public Board(String register, String title, String content, String Writer, String time) {
		
		super();
		this.register = register;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.time = time;
	}
	
	
	//메소드
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Board [register=" + this.getRegister() + ", Title=" + this.title + ", content" + this.writer + ", " + this.time+ "]";
	}
	
	
	

}
