package ua.epicwasa.sltexample.controller;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class State {

    private boolean fontIsLarge = false;
    private boolean fontIsBlue = false;
    private boolean fontIsBold = false;
    private boolean fontIsItalic = false;

}
