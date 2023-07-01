package in.dassdazzer.factories;

import in.dassdazzer.button.Button;
import in.dassdazzer.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface UIFactory {
	 Button createButton();
	 Checkbox createCheckbox();
}
