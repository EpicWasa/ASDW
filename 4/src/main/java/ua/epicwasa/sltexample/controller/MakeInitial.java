package ua.epicwasa.sltexample.controller;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MakeInitial implements Command {

    private TeaFrame teaFrame;

    @Override
    public void execute() {
        teaFrame.setInitial();
    }
}
