import java.awt.Color;

public class Project3 {

public static Color[][] ImageEffect1(Color[][] arrayOfColor, int searchRow, int searchCol){

	int redContent=0;
	int greenContent=0;
	int blueContent=0;
	
	Color[][] tempArrayOfColor= ImageUtils.cloneArray(arrayOfColor);
	
	redContent=tempArrayOfColor[searchRow][searchCol].getRed();
	greenContent=tempArrayOfColor[searchRow][searchCol].getGreen();
	blueContent=tempArrayOfColor[searchRow][searchCol].getBlue();
	
	for (int row=searchRow-3; row<=searchRow+3; row++) {
		for (int col=searchCol-3; col<=searchCol+3; col++) {
		tempArrayOfColor[row][col]=Color.magenta;
		}
	}

	System.out.println("The red content for the array position that you selected is: "+ redContent +"");
	System.out.println("The green content for the array position that you selcted is: "+ greenContent +"");
	System.out.println("The blue content for the array position that you selected is: "+ blueContent +"\n");
	
	return tempArrayOfColor;
}

public static Color [][] ImageEffect2(Color[][] arrayOfColor, int red, int green, int blue){
	
	// Changes the color of the sky
	
Color[][] tempArrayOfColor= ImageUtils.cloneArray(arrayOfColor);

for (int row=0; row<arrayOfColor.length; row++) {
	for (int col=0; col<arrayOfColor[row].length; col++) {
		Color pixel=tempArrayOfColor[row][col];
		
		if (pixel.getBlue()>250 && pixel.getGreen()>250) {
			tempArrayOfColor[row][col]=new Color(red,green,blue);
		}
	}
}

return tempArrayOfColor;
}

public static Color[][] ImageEffect3(Color[][] arrayOfColor, int red, int green, int blue){
	
	Color[][] tempArrayOfColor= ImageUtils.cloneArray(arrayOfColor);
	
	for (int row=0; row<arrayOfColor.length; row++) {
		
		for (int col=0; col<arrayOfColor[row].length; col++) {
			
			Color pixel=tempArrayOfColor[row][col];
			
			if (pixel.getRed()>(pixel.getBlue()+140)) {
				
				if (row>215 && row<350 && col>171 && col<415) {
					
					tempArrayOfColor[row][col]= new Color(red,green,blue);
				}
			}
			
		}
	}
	
	return tempArrayOfColor;
}

public static Color[][] ImageEffect4(Color[][] arrayOfColor, int red, int green, int blue){
	
Color[][] tempArrayOfColor= ImageUtils.cloneArray(arrayOfColor);
	
	for (int row=0; row<arrayOfColor.length; row++) {
		
		for (int col=0; col<arrayOfColor[row].length; col++) {
			
			Color pixel=tempArrayOfColor[row][col];
			
			if (pixel.getGreen()<100 && pixel.getBlue()<60 && pixel.getRed()<30) {
				
				if (row>120 && row<223 && col>98 && col<130) {
					
					tempArrayOfColor[row][col]= new Color(red,green,blue);
				}
			}
		}
	}
	return tempArrayOfColor;
}

public static Color[][] ImageEffect5(Color[][] arrayOfColor, int red, int green, int blue){
	
	Color[][] tempArrayOfColor=ImageUtils.cloneArray(arrayOfColor);
	
		for (int row=0; row<arrayOfColor.length; row++) {
		
			for (int col=0; col<arrayOfColor[row].length; col++) {
			
				Color pixel=tempArrayOfColor[row][col];
				
				if (row<256 && col>225)
					if (pixel.getRed()>45 && pixel.getGreen()<(pixel.getBlue()+21) && pixel.getRed()<140 && pixel.getBlue()<140 && pixel.getGreen()<140) {
						tempArrayOfColor[row][col]=new Color(red,green,blue);
					}
				}
			}
	
	return tempArrayOfColor;
}

}
