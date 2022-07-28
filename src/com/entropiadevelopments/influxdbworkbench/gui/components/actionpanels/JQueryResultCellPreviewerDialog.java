package com.entropiadevelopments.influxdbworkbench.gui.components.actionpanels;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JQueryResultCellPreviewerDialog extends JDialog 
{
	private JTextArea textArea;
	

	/**
	 * Create the dialog.
	 */
	public JQueryResultCellPreviewerDialog() 
	{
		setAlwaysOnTop(true);
		setTitle("Preview Cell Value");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			getContentPane().add(scrollPane, BorderLayout.NORTH);
		}
		{
			textArea = new JTextArea();
			textArea.setWrapStyleWord(true);
			textArea.setLineWrap(true);
			textArea.setEditable(false);
			getContentPane().add(textArea, BorderLayout.CENTER);
		}
	}

	public void setPreview(String title, String value)
	{
		this.setTitle(title);
		textArea.setText(value);
	}
}
