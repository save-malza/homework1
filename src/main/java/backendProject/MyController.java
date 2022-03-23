package backendProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@ResponseBody
	@RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(
            @RequestParam("userid") String userid,
            @RequestParam("pw") String pw) {
			if(userid.equals("abcd") && pw.equals("1234"))
				return "success";
			return null;
 
	}
}