package com.entropiadevelopments.influxdbworkbench.gui.components.actionpanels;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class JQueryResultCellPreviewerDialog extends JDialog {

	private JTextArea textArea ;
	/**
	 * Create the dialog.
	 */
	public JQueryResultCellPreviewerDialog() 
	{
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			getContentPane().add(scrollPane, BorderLayout.NORTH);
		}
		{
			textArea = new JTextArea();
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setEditable(false);
			getContentPane().add(textArea, BorderLayout.CENTER);
		}
	}

	public void setPreview(String title, String value)
	{
		setTitle(title);
		textArea.setText(value);
	}
}
