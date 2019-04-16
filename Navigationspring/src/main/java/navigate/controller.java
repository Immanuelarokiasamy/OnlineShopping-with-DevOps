package navigate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class controller {
		@RequestMapping(value="/navig")

		public String navigate(Model m)
		{
			m.addAttribute("name","Immanuel");
			return "navig";
		}
		@RequestMapping(value="/regist")
        public String loginshow(Model n)
		{
			n.addAttribute("name","user");
			return "login";
		}
}
