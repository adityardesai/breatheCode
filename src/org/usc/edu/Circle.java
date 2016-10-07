package org.usc.edu;

import java.awt.Color;
import java.util.List;

//Given
class Circle {

	void SetColor(Color color) {
		// Possible values: Color.Red, Color.Blue
	}

	Boolean Intersect(Circle other) {
		// Test intersection with another circle
		return null;
	}

	// Color all the circles to either:
	// - Color.Red if it's intersecting any other circle
	// - Color.Blue if it's a lone circle
	void ColorizeCircles(List<Circle> circles) {
		Boolean foundRED = Boolean.FALSE;
		// Implement here
		if (circles.size() == 0 || circles.size() == 1) {
			System.out.println("LOGGER MESSAGE: Please check the List<Circle> either its empty or has only one circle");
			return;
		}

		for (int i = 0; i < circles.size() - 1; i++) {
			foundRED = Boolean.FALSE;
			for (int j = i + 1; j < circles.size(); j++) {
				if (circles.get(i).Intersect(circles.get(j))) {
					circles.get(i).SetColor(Color.RED);
					foundRED = Boolean.TRUE;
				}
			}
			if (!foundRED) {
				circles.get(i).SetColor(Color.BLUE);
			}
		}
	}
}