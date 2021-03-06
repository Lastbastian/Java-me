public class StringProcessor {
	private static String string;
	
	public StringProcessor(String s)
	{
		string = s;	
	}
	
	void setString(String s)
	{
		string = s;
	}
	
	String getString()
	{
		return string;
	}
	
	int wordCount()
	{
		char[] array;
		array = string.toCharArray();
		int whitespaces = 0;
		
		for (int index = 0; index < array.length; index++)
		{
			if (Character.isWhitespace(array[index])){
				whitespaces++;
			}
		}
		
		return whitespaces + 1;
	}
	
	int uppercaseCount(){
		int upperCount = 0;
		char[] array;
		array = string.toCharArray();
		
		for (int index = 0; index < array.length; index++){
			if (Character.isUpperCase(array[index]))
				upperCount++;
		}
		
		return upperCount;
	}
	
	int digitCount(){
		int digits = 0;
		char[] array = string.toCharArray();
	
		for (int index = 0; index < array.length; index++){
			if (Character.isUpperCase(array[index]))
				digits++;
		}
	
		return digits;
	}
	
	int digitWordCount(){
		int digitWords = 0;
		String[] parts = string.split(" ");
		
		for (int index = 0; index < parts.length; index++){
			if (parts[index].equals("one") ||
					parts[index].equalsIgnoreCase("two") ||
					parts[index].equalsIgnoreCase("three") ||
					parts[index].equalsIgnoreCase("four") ||
					parts[index].equalsIgnoreCase("five") ||
					parts[index].equalsIgnoreCase("six") ||
					parts[index].equalsIgnoreCase("seven") ||
					parts[index].equalsIgnoreCase("eight") ||
					parts[index].equalsIgnoreCase("nine")
				)
				digitWords++;
		}
		
		return digitWords;
	}
	
	String getNoSpaceString(){
		String newString = string.replace(" ", "");
		
		return newString;
	}
	
	String getNoVowelString(){
		String newString = string.replaceAll("[AaEeIiOoUu]", "-");
		
		return newString;
	}
	
	String getNoDigitWordString(){
		String[] parts = string.split("");
		
		StringBuilder strBuilder = new StringBuilder();
		
		for(int index = 0; index < parts.length; index++)
		{
			if (parts[index].equals("1")) {
				strBuilder.append("one");
			} else if (parts[index].equals("2")) {
				strBuilder.append("two");
			} else if (parts[index].equals("3")) {
				strBuilder.append("three");
			} else if (parts[index].equals("4")) {
				strBuilder.append("four");
			} else if (parts[index].equals("5")) {
				strBuilder.append("five");
			} else if (parts[index].equals("6")){
				strBuilder.append("six");
			} else if (parts[index].equals("7")) {
				strBuilder.append("seven");
			} else if (parts[index].equals("8")) {
				strBuilder.append("eight");
			} else if (parts[index].equals("9")) {
				strBuilder.append("nine");
			} else {
				strBuilder.append(parts[index]);
			}
		}
			
		String newString = strBuilder.toString();
		
		return newString;
	}
}