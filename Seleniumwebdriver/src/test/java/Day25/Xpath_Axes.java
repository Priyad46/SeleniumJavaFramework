package Day25;

public class Xpath_Axes {

	public static void main(String[] args) {

		//Xpath Axes types
		/*Self
		Parent 
		Child
		Ancestor
		Descendent
		Following
		Precedent
		Following-sibling
		Preceding-sibing */
		
		//1. Locating the parent element
		//Examples: 
		//input[@id=’txtUsername’]/parent::form
		//input[@id=’txtUsername’]/parent::*
		//input[@id=’txtUsername’]/..
		
		//2. Locating the child element
		//Example : 
		//div[@id=’divUsername’]/child::input
		//div[@id=’divUsername’]/input

		//3. Locating Grand Chidren 
		//Example :
		//form/*/input
		//form/div/input

		//4. Locating ancestor for the known element
		//input[@id=’txusername’]/ancestor::form
		//input[@id=’txusername’]/ancestor::*

		//5. Locating descendants (Chid of child) of a known element
		//form[@id=frmlogin]/descendant::input
		//form[@id=frmlogin]//input

		//6. Locating Following elements
		//input[@id=txUsername]/following::input              
		//input[@id=txUsername]/following::*            
		//input[@id=txUsername]/following::input[last()]       => U can use 1st n last instead of index
		//input[@id=txUsername]/following::input[2]

		//7. Locating Preceding element
		//span[text( )=’Password’]/preceding::input

		//8. Following sibling
		//*[@id=’txtUsername’]/folowing-sibing::span
		//*[@id=’txtUsername’]/folowing-sibing::*

		//9. Preceding sibling
		//span[contains(text( ),’Username’)]/preceding-sibling::input
		//span[contains(text( ),’Username’)]/preceding-sibling::*




		
		
		
	}

}
