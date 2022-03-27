/*
Write an enum type Food, whose constants (APPLE, BANANA, CARROT) take two 
parameters - the type (vegetable or fruit), and number of calories. Write a program to test 
the Food enum so that it displays the enum names and their information.
*/

public enum Fruits {
	APPLE(53), 
	BANANA(119), 
	CARROT(32);

	int calories;

	Fruits (int calories){
		this.calories = calories;
	}
}
