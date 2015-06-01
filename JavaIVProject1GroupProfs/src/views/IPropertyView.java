package views;

import java.util.Observer;

import javax.swing.JPanel;

public interface IPropertyView extends Observer {
	JPanel getPropertyView();
}
