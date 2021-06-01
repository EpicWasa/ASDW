package ua.epicwasa.sltexample.controller;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.epicwasa.sltexample.entity.Tea;
import ua.epicwasa.sltexample.repo.TeaRepo;

@Getter
@Setter
@Service
public class TeaFrame {

    @Autowired
    private TeaRepo teaRepo;

    private Iterable<Tea> teas;

    private State state;

    private Memento memento;

    public Iterable<Tea> getTeas(){
        return teaRepo.findAll();
    }

    public TeaFrame(){
        this.state = new State();
        this.memento = new Memento();
        this.memento.setState(new State());
    }

    public void setInitial(){
        this.state = this.memento.getState();
        this.memento.setState(new State());
    }

    public void setFontIsLarge(){
        this.state.setFontIsLarge(!this.state.isFontIsLarge());
    }

    public void setFontIsBold(){
        this.state.setFontIsBold(!this.state.isFontIsBold());
    }

    public void setFontIsItalic(){
        this.state.setFontIsItalic(!this.state.isFontIsItalic());
    }

    public void setFontIsBlue(){
        this.state.setFontIsBlue(!this.state.isFontIsBlue());
    }
}
