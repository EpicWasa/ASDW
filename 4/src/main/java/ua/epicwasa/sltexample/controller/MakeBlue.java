package ua.epicwasa.sltexample.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class MakeBlue implements Command {

    private TeaFrame teaFrame;

    @Override
    public void execute() {
        teaFrame.setFontIsBlue();
    }

}
