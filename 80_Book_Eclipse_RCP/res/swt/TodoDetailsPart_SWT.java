package com.example.e4.rcp.todo.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TodoDetailsPart {
	private Text txtSummary;
	private Text txtDescription;
	private DateTime dateTime;
	private Button btnDone;

	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		Label lblSummary = new Label(parent, SWT.NONE);
		lblSummary.setText("Summary");

		txtSummary = new Text(parent, SWT.BORDER);
		txtSummary.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Label lblDescription = new Label(parent, SWT.NONE);
		lblDescription.setText("Description");

		txtDescription = new Text(parent, SWT.BORDER| SWT.MULTI| SWT.V_SCROLL);
		txtDescription.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));

		Label lblDueDate = new Label(parent, SWT.NONE);
		lblDueDate.setText("Due Date");
		
		dateTime = new DateTime(parent, SWT.BORDER);
		dateTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		new Label(parent, SWT.NONE);

		btnDone = new Button(parent, SWT.CHECK);
		btnDone.setText("Done");
	}

	@Focus
	public void setFocus() {
		txtSummary.setFocus();
	}

}