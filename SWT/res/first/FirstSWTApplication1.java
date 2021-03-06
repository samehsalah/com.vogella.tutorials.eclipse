
package com.example.swt.widgets;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FirstSWTApplication {

    public static void main(String[] args) {
        Display display = new Display();

        Shell shell = new Shell(display);
        
        // the layout manager handle the layout
        // of the widgets in the container
        shell.setLayout(new FillLayout());
        
        //TODO add some widgets to the Shell
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }
}
