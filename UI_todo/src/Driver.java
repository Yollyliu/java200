import UI.MainView;
import com.sun.org.apache.regexp.internal.RE;
import com.zzpublic.zwing.ViewFlow;
import com.zzpublic.zwing.Window;
import core.Repository;

import javax.swing.text.View;

public class Driver {
    public static void main(String[] args) {
//        Repository.todoList.setTitle("Learning Plan");
        Repository.buildItems();


        MainView view=new MainView();
        ViewFlow viewFlow=new ViewFlow();
        viewFlow.push(view);
        Window window=new Window(viewFlow);
        window.setVisible(true);
        window.setResizable(true);



    }
}
