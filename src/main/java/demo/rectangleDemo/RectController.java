package demo.rectangleDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RectController {
    List<Rectangle> historyList = new ArrayList<>();
    @Autowired
    RectangleService rectangleService;

    @GetMapping("/")
    public String index() {
        return "rectangle";
    }

    @GetMapping("//calculation")
    public String calcPerimAr(String w, String l, Model m) {
        try {
            double widht = Double.parseDouble(w);
            double lenght = Double.parseDouble(l);
            Rectangle r = new Rectangle(widht, lenght);
            m.addAttribute("rectPerimetr");
            m.addAttribute("rectArea");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            m.addAttribute("Error", e.getMessage());
        }
        return "rect_result";

    }
    @GetMapping("/history")
    public String showHistory(Model m) {
        m.addAttribute("message",rectangleService.getRectangleList());

        return "history";
    }

}
