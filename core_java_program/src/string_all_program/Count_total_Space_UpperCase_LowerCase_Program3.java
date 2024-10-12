package string_all_program;

public class Count_total_Space_UpperCase_LowerCase_Program3 {

	public static void main(String[] args) {
		String s1 = "Faizan is here%((@!@%^@$";
		System.out.println(s1.length());
		spaceCountAndUpperCaseAndLowerCase(s1);

		// 32–47 / 58–64 / 91–96 / 123–126 special character range

	}

	public static void spaceCountAndUpperCaseAndLowerCase(String s) {
		int countSpace = 0;
		int countUpperCase = 0;
		int countLowerCase = 0;
		int spacialCharacter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				countSpace++;
			}
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				// System.out.println(s.charAt(i));
				countUpperCase++;
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				countLowerCase++;
			} else if ((s.charAt(i) >= 33 && s.charAt(i) <= 47) || (s.charAt(i) >= 58 && s.charAt(i) <= 64)
					|| (s.charAt(i) >= 123 && s.charAt(i) <= 126)) {
				spacialCharacter++;
			}
		}

		System.out.println("Total space " + countSpace);
		System.out.println("total upper Case character is " + countUpperCase);
		System.out.println("total lower Case character is " + countLowerCase);
		System.out.println("special character is "+spacialCharacter);
	}

}
