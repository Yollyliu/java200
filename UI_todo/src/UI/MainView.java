package UI;

import com.zzpublic.zwing.Label;
import com.zzpublic.zwing.View;
import core.Repository;
import core.TodoList;

import javax.swing.*;
import javax.swing.text.Element;


public class MainView extends View {
    private TodoList list;
    private final static int paddingNormal=10;
    private final static int cellHeight=50;

    private Label titleLable;

    @Override
    protected void init(){
        super.init();
        list= Repository.todoList;
    }

    @Override
    protected void initSubviews() {
        super.initSubviews();

        titleLable=new Label();
        titleLable.setLocation(paddingNormal,paddingNormal);
        titleLable.setSize(this.getWidth()-2*paddingNormal,cellHeight);
        titleLable.setText(list.getTitle());
        titleLable.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(titleLable);

    }

//    protected void initSubview(){
//        super.initSubviews();
//
//
//        titleLable=new Label();
//        titleLable.setLocation(paddingNormal,paddingNormal);
//        titleLable.setSize(this.getWidth()-2*paddingNormal,cellHeight);
//        titleLable.setText(list.getTitle());
//        titleLable.setHorizontalAlignment(SwingConstants.CENTER);
//        this.add(titleLable);
//    }

}
