import java.util.Scanner;
import java.awt.Color;

public class Project3Tester {
	
public static void main(String [] args) {
	
String userChoice;
Color arrayOfColor[][] = null;

Scanner input = new Scanner(System.in);

System.out.println("Hello, im a bot that can do several different image alterations\n");

System.out.println("Which image effect would you like me to do?");
System.out.println("Please enter the integer for the effect you'd like to have done\n");
System.out.println("1: Color Search");
System.out.println("2: Change Sky Color");
System.out.println("3: Change Carrot Color");
System.out.println("4: Change Street Sign Color");
System.out.println("5: Change Street Color");

userChoice=input.nextLine();

ImageUtils imageUtility = new ImageUtils();

arrayOfColor=imageUtility.loadImage("src/GeorgeCarrot.png");
imageUtility.addImage(arrayOfColor, "Original Image");
imageUtility.display();

if (userChoice.equals("1")) {
	
int row=0;
int col=0;
	
System.out.println("Please enter the row and column for the color that you'd like to find between the picture bounds (512x512)");
System.out.println("Ex: 215 123\n");

row=input.nextInt();
col=input.nextInt();

if (row>0 && row<512 && col>0 && col<512) {

imageUtility.addImage(Project3.ImageEffect1(arrayOfColor,row, col),"Color Search");
imageUtility.display();

System.out.println("The point that you selected is denoted by the white square in the updated picture");
}

else {
	System.out.println("Please enter a valid integer inside of the limits of the picture (512x512)");
}

}


else if (userChoice.equals("2")) {
System.out.println("Please enter the RGB integer values for the color that you would like to use for the sky");
System.out.println("Ex: 12 34 45");

int redContent=input.nextInt();
int greenContent=input.nextInt();
int blueContent=input.nextInt();

if (blueContent>0 && redContent>0 && greenContent>0 && blueContent<=255 && redContent<=255 && greenContent<=255){

	imageUtility.addImage(Project3.ImageEffect2(arrayOfColor, redContent, greenContent, blueContent), "Sky Color Swap");
	imageUtility.display();
	
}

else {
	System.out.println("Please enter an integer for the red, green, and blue content between 0 and 255");
}

}

else if (userChoice.equals("3")) {
System.out.println("Please enter the RGB integer values for the color that you would like to use for the carrot");
System.out.println("Ex: 12 34 45");

int redContent=input.nextInt();
int greenContent=input.nextInt();
int blueContent=input.nextInt();

if (blueContent>0 && redContent>0 && greenContent>0 && blueContent<=255 && redContent<=255 && greenContent<=255){
	
	imageUtility.addImage(Project3.ImageEffect3(arrayOfColor, redContent, greenContent, blueContent), "Carrot Color Swap");
	imageUtility.display();
	
}

else {
	System.out.println("Please enter an integer for the red, green, and blue content between 0 and 255");
}

}

else if (userChoice.equals("4")) {
	System.out.println("Please enter the RGB integer values for the color that you would like to use for the street sign");
	System.out.println("Ex: 12 34 45");

	int redContent=input.nextInt();
	int greenContent=input.nextInt();
	int blueContent=input.nextInt();
	
if (blueContent>0 && redContent>0 && greenContent>0 && blueContent<=255 && redContent<=255 && greenContent<=255){
	
	imageUtility.addImage(Project3.ImageEffect4(arrayOfColor, redContent, greenContent, blueContent), "Street Sign Color Swap");
	imageUtility.display();
	
}

else {
	System.out.println("Please enter an integer for the red, green, and blue content between 0 and 255");
}

}

else if (userChoice.equals("5")) {
	System.out.println("Please enter the RGB values for the color that you would like to use for the street");
	System.out.println("Ex: 12 34 45");

	int redContent=input.nextInt();
	int greenContent=input.nextInt();
	int blueContent=input.nextInt();
	
if (blueContent>0 && redContent>0 && greenContent>0 && blueContent<=255 && redContent<=255 && greenContent<=255){
		imageUtility.addImage(Project3.ImageEffect5(arrayOfColor, redContent, greenContent, blueContent), "Street Color Swap");
		imageUtility.display();
}

else {
	System.out.println("Please enter an integer for the red, green, and blue content between 0 and 255");
}

}

else {
	System.out.println("Please enter a valid integer between 1 and 5");
}

System.out.println("Thanks for running the program! If you'd like to try another filter please re-run the program");
}

}