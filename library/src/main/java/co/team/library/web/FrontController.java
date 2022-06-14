package co.team.library.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.team.library.comm.Command;
import co.team.library.contact.ContactCommand;
import co.team.library.home.HomeCommand;
import co.team.library.shop.Shopgrid;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Command를 import시킬때는 내가 만든 서블릿으로 import 시킬것
	private HashMap<String, Command> map = new HashMap<String, Command>();
    

    public FrontController() {
        super();
    }

    
	 //요청과 처리 명령어를 연결하는 부분
	public void init(ServletConfig config) throws ServletException { 
		map.put("/home.do", new HomeCommand());		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 한글깨짐 방지
		String uri = request.getRequestURI(); // 요청 URI 구함
		String contextPath = request.getContextPath(); // 루트 디렉토리 정보
		String page = uri.substring(contextPath.length());; // contextPath.length()(<-이걸빼면) 이 다음부터는 들어가는게 페이지다. ,, 실제 요청 명령을 받음
		
		Command command = map.get(page); //맵에서 키를 던져주니 나한테 던져주는건 밸류(커맨드)를 돌아온다 즉 커맨드를 구한다
		String viewPage = command.exec(request, response); // exec를 찾을때 맨끝에 String이 붙어서 나오는데 돌려받는값이 스트링인걸 알수있다.
	
		if(!viewPage.endsWith(".do")) {			
			viewPage = viewPage + ".tiles";
		
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage); // Dispatcher은 권한위임.
		dispatcher.forward(request, response);
	}
}
