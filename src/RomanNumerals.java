
public class RomanNumerals {
	
	public int convertToInteger(String romanNum) {
		int sum = CheckLetter(romanNum);
		System.out.println("Return: " + sum);
		return sum;
	}
	
	public int CheckLetter (String romanNum) {
		int numerial = 0;
		int i = 0;
		int letterNum1 = 0;
		int letterNum2 = 0;
		int helpnumber = 0;
		int leng = romanNum.length();
		if (leng >1) {
			if (CalculateLetters(romanNum) == -1) {
				numerial = 0;
			}
			
			else {
				if(CheckRow(romanNum) == 0){
					while(i+1 < leng) {
						letterNum1 = allLettersAndNumbers(romanNum.charAt(i));
						letterNum2 = allLettersAndNumbers(romanNum.charAt(i+1));
						
						if(letterNum1 < letterNum2) {
							if (letterNum1 == 5 || letterNum1 == 50  || letterNum1 == 500) {
								System.out.println("Invalid syntax");
								return numerial=0;
							}
							else {
								numerial = numerial + (letterNum2 - letterNum1);
								i = i+2;
							}
						}
					
						else {
							if(letterNum1 == letterNum2) {
								helpnumber = allLettersAndNumbers(romanNum.charAt(i+2));
								if(letterNum2 < helpnumber) {
									System.out.println("Not valid String!");
									return 0;
								}
								else if(letterNum2 == helpnumber) {
									numerial = numerial + (letterNum1 * 3);
									i = i+2;
								}
								else {
									numerial = numerial + letterNum1;
									i = i+1;
								}
							}
							else {
								numerial = numerial + letterNum1;
								i = i+1;
							}
							
						}
					
					}
			}
				
				
			}
		}
		else if (leng == 1) {
			numerial = allLettersAndNumbers(romanNum.charAt(i));
		}
		return numerial;
	}
	
	public int allLettersAndNumbers(char letter) {
		if (letter == 'M'){
			return 1000;	
		}
		if (letter == 'D'){
			return 500;	
		}
		if (letter == 'C'){
			return 100;	
		}
		if (letter == 'L'){
			return 50;	
		}
		if (letter == 'X'){
			return 10;	
		}
		if (letter == 'V'){
			return 5;	
		}
		if (letter == 'I'){
			return 1;	
		}
		
		return 0;
	}
	
	public int CalculateLetters(String romanNum) {
		int count = 0;
		int countV = 0;
		int j = 0;
		int y = 0;
		for (int i=1; i < romanNum.length(); i++) {
			if(romanNum.charAt(j) == romanNum.charAt(i)) {
				count = count+1;
				
				if(romanNum.charAt(i)=='M' && count > 3|| romanNum.charAt(i)=='C' && count > 3|| romanNum.charAt(i)=='X' && count > 3|| romanNum.charAt(i)=='I' && count > 3 ) {
					System.out.println("Letter " + romanNum.charAt(i) + " is more than 3 time in row " + count);
					return -1;
				}
			}
			else {
				count = 0;
			}
			j = j+1;
			
			
		}
		
		for (int x=1; x < romanNum.length(); x++) {
			if(romanNum.charAt(y) == romanNum.charAt(x)) {
				countV = countV+1;
			}
			if(romanNum.charAt(y)=='V' && countV >= 1 || romanNum.charAt(y)=='L' && countV >= 1 || romanNum.charAt(y)=='D'&& countV >= 1 ) {
				System.out.println("Letter " + romanNum.charAt(y) + " is more than 1 time in row");
				return -1;
			}
		}
		return 0;
	}
	
	public int CheckRow(String romanNum) {
		int i = 0;
		int j = 1;
		while(j < romanNum.length()) {
			if(romanNum.charAt(i) == 'I') {
				if(romanNum.charAt(j) =='I' || romanNum.charAt(j) =='V' || romanNum.charAt(j) =='X') return 0;
				else return -1;
			}
			
			if(romanNum.charAt(i) == 'X') {
				 if(romanNum.charAt(j) == 'X' || romanNum.charAt(j) == 'I' || romanNum.charAt(j) == 'L') return 0;
				 else return -1;
			}
			
			if(romanNum.charAt(i) == 'C') {
				if(romanNum.charAt(j) == 'C' || romanNum.charAt(j) == 'D' || romanNum.charAt(j) == 'M') return 0;
				else return -1;
			}
			i = i+1;
			j = j+1;
		}
		return 0;
	}
	

}
