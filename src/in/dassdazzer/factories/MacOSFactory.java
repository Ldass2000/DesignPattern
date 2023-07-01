package in.dassdazzer.factories;

import in.dassdazzer.button.Button;
import in.dassdazzer.button.MacOSButton;
import in.dassdazzer.checkboxes.Checkbox;
import in.dassdazzer.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory  implements UIFactory{
	
	    @Override
	    public Button createButton() {
	        return new MacOSButton();
	    }

	    @Override
	    public Checkbox createCheckbox() {
	        return new MacOSCheckbox();
	    }
}
