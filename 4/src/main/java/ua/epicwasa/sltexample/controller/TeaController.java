package ua.epicwasa.sltexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.epicwasa.sltexample.repo.TeaRepo;

@Controller
public class TeaController {

    private TeaFrame teaFrame;

    private Command makeBig;
    private Command makeBlue;
    private Command makeBold;
    private Command makeInitial;
    private Command makeItalic;

    @Autowired
    public TeaController(TeaFrame teaFrame){
            this.teaFrame = teaFrame;
          makeBig = new MakeBig(teaFrame);
          makeBlue = new MakeBlue(teaFrame);
          makeBold = new MakeBold(teaFrame);
          makeInitial = new MakeInitial(teaFrame);
          makeItalic = new MakeItalic(teaFrame);
    }


    @GetMapping("/teapage")
    public String getTeaPage(Model model) {
        model.addAttribute("teas", teaFrame.getTeas());
        model.addAttribute("teaFrame", teaFrame);
        return "teapage";
    }

    @GetMapping("/teapage/changeSize")
    public String changeSize(Model model) {
        model.addAttribute("teas", teaFrame.getTeas());
        makeBig.execute();
        model.addAttribute("teaFrame", teaFrame);
        return "teapage";
    }

    @GetMapping("/teapage/changeColour")
    public String changeColour(Model model) {
        model.addAttribute("teas", teaFrame.getTeas());
        makeBlue.execute();
        model.addAttribute("teaFrame", teaFrame);
        return "teapage";
    }

    @GetMapping("/teapage/changeBold")
    public String changeBold(Model model) {
        model.addAttribute("teas", teaFrame.getTeas());
        makeBold.execute();
        model.addAttribute("teaFrame", teaFrame);
        return "teapage";
    }

    @GetMapping("/teapage/changeItalic")
    public String changeItalic(Model model) {
        model.addAttribute("teas", teaFrame.getTeas());
        makeItalic.execute();
        model.addAttribute("teaFrame", teaFrame);
        return "teapage";
    }

    @GetMapping("/teapage/setInitial")
    public String setInitial(Model model) {
        model.addAttribute("teas", teaFrame.getTeas());
        makeInitial.execute();
        model.addAttribute("teaFrame", teaFrame);
        return "teapage";
    }

}
