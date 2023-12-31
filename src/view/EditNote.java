package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.EditNoteController;
import model.Note;


@SuppressWarnings("serial")
public class EditNote extends JFrame {

	// Attributes
	private JTextField textFieldTitle;
	private JTextField textFieldPosition;
	private JTextArea textAreaContent;
	private JButton btnSave = new JButton("Save");
	private JButton btnCancel = new JButton("Cancel");
	private Note note;
	private EditNoteController editNoteController;


	
	// Getters and setters
	public EditNoteController getEditNoteController() {
		return editNoteController;
	}

	public void setEditNoteController(EditNoteController editNoteController) {
		this.editNoteController = editNoteController;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public JTextField getTextFieldTitle() {
		return textFieldTitle;
	}

	public void setTextFieldTitle(JTextField textFieldTitle) {
		this.textFieldTitle = textFieldTitle;
	}


	public JTextField getTextFieldPosition() {
		return textFieldPosition;
	}

	public void setTextFieldPosition(JTextField textFieldPosition) {
		this.textFieldPosition = textFieldPosition;
	}


	public JTextArea getTextAreaContent() {
		return textAreaContent;
	}

	public void setTextAreaContent(JTextArea textAreaContent) {
		this.textAreaContent = textAreaContent;
	}


	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}


	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}


	// Constructor
	public EditNote(Note note) {
		this.note = note;
		editNoteController = new EditNoteController(EditNote.this);
		
		setResizable(false);
		setSize(630, 470);
		setLocationRelativeTo(null);
		setTitle("Task List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel background = new JPanel();
		background.setBackground(new Color(128, 0, 128));
		getContentPane().add(background, BorderLayout.CENTER);
		background.setLayout(null);
		
		
		JPanel panelButtons = new JPanel();
		panelButtons.setOpaque(false);
		panelButtons.setBounds(10, 364, 594, 56);
		panelButtons.setLayout(new GridLayout(0, 2, 200, 5));
		background.add(panelButtons);

		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitle.setForeground(new Color(255, 255, 128));
		lblTitle.setBounds(10, 11, 87, 26);
		background.add(lblTitle);
		
		
		JLabel lblPosition = new JLabel("Position number (ex.: 1) :");
		lblPosition.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosition.setForeground(new Color(255, 255, 128));
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPosition.setBounds(10, 69, 241, 26);
		background.add(lblPosition);
		
		
		JLabel lblContent = new JLabel("Content:");
		lblContent.setHorizontalAlignment(SwingConstants.LEFT);
		lblContent.setForeground(new Color(255, 255, 128));
		lblContent.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContent.setBounds(10, 127, 87, 26);
		background.add(lblContent);
		
		

		textFieldTitle.setBounds(11, 38, 593, 26);
		textFieldTitle.setColumns(10);
		background.add(textFieldTitle);
		

		textFieldPosition.setColumns(10);
		textFieldPosition.setBounds(10, 95, 87, 26);
		background.add(textFieldPosition);
		
		JScrollPane scrollPaneContent = new JScrollPane();
		scrollPaneContent.setBounds(10, 156, 594, 197);
		background.add(scrollPaneContent);
		
		
		textAreaContent.setLineWrap(true);
		scrollPaneContent.setViewportView(textAreaContent);

		
		panelButtons.add(btnSave);
		panelButtons.add(btnCancel);


	}
	
}