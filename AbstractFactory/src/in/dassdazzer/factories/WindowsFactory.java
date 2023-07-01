package in.dassdazzer.factories;

import in.dassdazzer.button.Button;
import in.dassdazzer.button.WindowsButton;
import in.dassdazzer.checkboxes.Checkbox;
import in.dassdazzer.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements UIFactory {
	
	    @Override
	    public Button createButton() {
	        return new WindowsButton();
	    }

	    @Override
	    public Checkbox createCheckbox() {
	        return new WindowsCheckbox();
	    }
}
