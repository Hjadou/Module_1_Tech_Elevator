package com.techelevator;

public class Exercises {

	/*
	 1. The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on
	 vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
	 sleepIn(false, false) → true
	 sleepIn(true, false) → false
	 sleepIn(false, true) → true
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		boolean sleptIn = false;
		if (!weekday || vacation) {
			sleptIn = true;
		}
		return sleptIn;
	}
	/*
	 2. We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
	 We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
	 are in trouble.
	 monkeyTrouble(true, true) → true
	 monkeyTrouble(false, false) → true
	 monkeyTrouble(true, false) → false
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile==true&&bSmile==true || aSmile==false&&bSmile==false)?true:false;
	}

	/*
	 3. Given two int values, return their sum. Unless the two values are the same, then return double their sum.
	 sumDouble(1, 2) → 3
	 sumDouble(3, 2) → 5
	 sumDouble(2, 2) → 8
	 */
	public int sumDouble(int a, int b) {
		return (a == b)?((a+b)*2):a+b;
	}

	/*
	 4. Given an int n, return the absolute difference between n and 21, except return double the absolute
	 difference if n is over 21.
	 diff21(19) → 2
	 diff21(10) → 11
	 diff21(21) → 0
	 diff21(22) → 2
	 diff21(-10) → 31
	 */
	public int diff21(int n) {
		return (n>21)?Math.abs((n-21)*2):Math.abs(n-21);
	}

	/*
	 5. We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
	 We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if
	 we are in trouble.
	 parrotTrouble(true, 6) → true
	 parrotTrouble(true, 7) → false
	 parrotTrouble(false, 6) → false
	 */
	public boolean parrotTrouble(boolean talking, int hour) {
		return (talking==true&&(hour<7||hour>20))?true:false;
	}

	/*
	 6. Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
	 makes10(9, 10) → true
	 makes10(9, 9) → false
	 makes10(1, 9) → true
	 */
	public boolean makes10(int a, int b) {
		return ((a+b)==10||(a==10||b==10))?true:false;
	}

	/*
	 7. Given 2 int values, return true if one is negative and one is positive. Except if the parameter
	 "negative" is true, then return true only if both are negative.
	 posNeg(1, -1, false) → true
	 posNeg(-1, 1, false) → true
	 posNeg(-4, -5, true) → true
	 */
	public boolean posNeg(int a, int b, boolean negative) {
		boolean placeHolder = false;
		if (negative&&a<0&&b<0) {
			placeHolder = true;
		}
		else if (!negative && (a < 0 && b > 0 || a > 0 && b < 0)){
			placeHolder = true;
		}
		return placeHolder;
	}

	/*
	 8. Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	 (Hint: Think "mod".)
	 or35(3) → true
	 or35(10) → true
	 or35(8) → false
	 */
	public boolean or35(int n) {
		return (n%3 == 0 || n%5==0)?true:false;
	}

	/*
	 9. Given two temperatures, return true if one is less than 0 and the other is greater than 100.
	 icyHot(120, -1) → true
	 icyHot(-1, 120) → true
	 icyHot(2, 120) → false
	 */
	public boolean icyHot(int temp1, int temp2) {
		return ((temp1<0 && temp2>100)||(temp1>100 && temp2<0))?true:false;
	}

	/*
	 10. Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	 in1020(12, 99) → true
	 in1020(21, 12) → true
	 in1020(8, 99) → false
	 */
	public boolean in1020(int a, int b) {
		return ((a>=10&&a<=20)||(b>=10)&&(b<=20))?true:false;
	}

	/*
	 11. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
	 return true if 1 or more of them are teen.
	 hasTeen(13, 20, 10) → true
	 hasTeen(20, 19, 10) → true
	 hasTeen(20, 10, 13) → true
	 */
	public boolean hasTeen(int a, int b, int c) {
		return ((a>=13&&a<=19)||(b>=13&&b<=19)||(c>=13&&c<=19))?true:false;
	}

	/*
	 12. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
	 return true if one or the other is teen, but not both.
	 loneTeen(13, 99) → true
	 loneTeen(21, 19) → true
	 loneTeen(13, 13) → false
	 */
	public boolean loneTeen(int a, int b) {
		return ((a>=13&&a<=19)&&(b>=13&&b<=19))?false:((a>=13&&a<=19)||(b>=13&&b<=19))?true:false;
	}

	/*
	 13. Given three int values, a b c, return the largest.
	 intMax(1, 2, 3) → 3
	 intMax(1, 3, 2) → 3
	 intMax(3, 2, 1) → 3
	 */
	public int intMax(int a, int b, int c) {
		int maxValue = Math.max(a, b);
		int maxValueTwo = Math.max(maxValue, c);
		return maxValueTwo;
	}

	/*
	 14. Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both
	 in the range 40..50 inclusive.
	 in3050(30, 31) → true
	 in3050(30, 41) → false
	 in3050(40, 50) → true
	 */
	public boolean in3050(int a, int b) {
		return (((a >= 30 && a <= 40) && (b >= 30 && b <= 40))) || (((a >= 40 && a <= 50) && (b >= 40 && b <= 50)))?true:false;
	}

	/*
	 15. Given 2 int values, return the larger value that is in the range 10..20 inclusive,
	 or return 0 if neither is in that range.
	 max1020(11, 19) → 19
	 max1020(19, 11) → 19
	 max1020(11, 9) → 11
	 */
	public int max1020(int a, int b) {
		if (b > a) {
			int currentValue = a;
			a = b;
			b = currentValue;
		}
		if (a >= 10 && a <= 20) return a;
		if (b >= 10 && b <= 20) return b;
		return 0;
	}
	/*
	 16. When squirrels get together for a party, they like to have cigars. A squirrel party is successful
	 when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
	 there is no upper bound on the number of cigars. Return true if the party with the given values is
	 successful, or false otherwise.
	 cigarParty(30, false) → false
	 cigarParty(50, false) → true
	 cigarParty(70, true) → true
	 */
	public boolean cigarParty(int cigars, boolean isWeekend) {
		boolean partyTime = false;
		if ((isWeekend == false)&&(cigars>=40&&cigars<=60)){
			partyTime= true;
		} else if ((isWeekend == true)&&(cigars>=40)){
			partyTime = true;
		}
		return partyTime;
	}

	/*
	 17. You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
	 of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
	 returned will be 0 if you did not get the table, 1 if you might get the table, and 2 if you did get
	 the table. If you or your date is very stylish (8 or more), then the result is 2 (yes). With the
	 exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the
	 result is 1 (maybe).
	 dateFashion(5, 10) → 2
	 dateFashion(5, 2) → 0
	 dateFashion(5, 5) → 1
	 */
	public int dateFashion(int you, int date) {
		int tableReceived = 1;
		if ((you<=2)||(date<=2)){
			tableReceived = 0;
		} else if ((you>=8)||(date>=8)){
			tableReceived = 2;
		}
		return tableReceived;
	}

	/*
	 18. The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature
	 is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given
	 an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
	 squirrelPlay(70, false) → true
	 squirrelPlay(95, false) → false
	 squirrelPlay(95, true) → true
	 */
	public boolean squirrelPlay(int temp, boolean isSummer) {
		boolean squirrelsPlaying = false;
		if ((isSummer==false)&&(temp>=60&&temp<=90)){
			squirrelsPlaying = true;
		} else if ((isSummer==true)&&(temp>=60&&temp<=100)){
			squirrelsPlaying = true;
		}
		return squirrelsPlaying;
	}

    /*
     19. Dessert Island Diner believes a meal isn't a meal without dessert. All meals come with
     a free dessert.

     There are three categories of free desserts: "standard", "special", and "ginormous".
     The meal amount determines the dessert category: <= $10 (standard), <= $15 (special),
     > $15 (ginormous). Unless it is your birthday -- on that day, an additional $5 is added
     when calculating the category to potentially bump you up to the next delicious category.

     For instance, if the amount of the meal was $7, and it is your birthday, $5 is added to
     $7 when determining the dessert category, which means you would qualify for a "special".

     yourCakeAndEatItToo(4.99, false) → "standard"
     yourCakeAndEatItToo(4.99, true) → "standard"
     yourCakeAndEatItToo(7.00, false) → "standard"
     yourCakeAndEatItToo(7.00, true) → "special"
     yourCakeAndEatItToo(10.00, false) → "standard"
     yourCakeAndEatItToo(10.00, true) → "special"
     yourCakeAndEatItToo(11.00, false) → "special"
     */
    public String yourCakeAndEatItToo(double mealAmount, boolean isBirthday) {
    	double totalMealAmount = mealAmount;
    	String typeOfDessert = "";
    	if(isBirthday==true){
    		mealAmount += 5;
    		totalMealAmount = mealAmount;
		}
    	if (totalMealAmount <= 10){
    		typeOfDessert = "standard";
		}
    	if (totalMealAmount <= 15 && totalMealAmount >10){
    		typeOfDessert = "special";
		}
    	if (totalMealAmount > 15){
    		typeOfDessert = "ginormous";
		}
        return typeOfDessert;
    }

	/*
	 20. Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
	 so in that case just return 20.
	 sortaSum(3, 4) → 7
	 sortaSum(9, 4) → 20
	 sortaSum(10, 11) → 21
	 */
	public int sortaSum(int a, int b) {
		int valueSum = (a+b);
		if ((a+b)>=10&&(a+b)<=19){
			valueSum = 20;
		}
		return valueSum;
	}

	/*
	 21. Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are
	 on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays,
	 the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then
	 on weekdays it should be "10:00" and weekends it should be "off".
	 alarmClock(1, false) → "7:00"
	 alarmClock(5, false) → "7:00"
	 alarmClock(0, false) → "10:00"
	 */
	public String alarmClock(int day, boolean vacation) {
		String alarmClockTime = "7:00";
		if ((day == 0 || day == 6) && (vacation == false)){
			alarmClockTime = "10:00";
		} else if ((day >=1 && day <= 5) && (vacation == true)){
			alarmClockTime = "10:00";
		} else if ((day == 0 || day == 6) && vacation == true){
			alarmClockTime = "off";
		}
		return alarmClockTime;
	}

	/*
	 22. Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true,
	 in which case return true if the number is less or equal to 1, or greater or equal to 10.
	 in1To10(5, false) → true
	 in1To10(11, false) → false
	 in1To10(11, true) → true
	 */
	public boolean in1To10(int n, boolean outsideMode) {
		boolean placeHolder = false;
		if ((outsideMode==true) && (n<=1 || n>=10)){
			placeHolder = true;
		} else if ((outsideMode==false) && (n>=1 && n<=10)){
			placeHolder = true;
		}
		return placeHolder;
	}

	/*
	 23. We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
	 Return true if the given non-negative number is special.
	 (Hint: Think "mod".)
	 specialEleven(22) → true
	 specialEleven(23) → true
	 specialEleven(24) → false
	 */
	public boolean specialEleven(int n) {
		boolean specialValue = false;
		if (n%11==0){
			specialValue = true;
		} else if (n%11==1){
			specialValue = true;
		}
		return specialValue;
	}

	/*
	 24. Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
	 (Hint: Think "mod".)
	 more20(20) → false
	 more20(21) → true
	 more20(22) → true
	 */
	public boolean more20(int n) {
		boolean placeHolderValue = false;
		if (n>=0 && (n % 20 == 1 || n % 20 == 2)){
			placeHolderValue = true;
		}
		return placeHolderValue;
	}

	/*
	 25. Return true if the given non-negative number is a multiple of 3 or 5, but not both.
	 (Hint: Think "mod".)
	 old35(3) → true
	 old35(10) → true
	 old35(15) → false
	 */
	public boolean old35(int n) {
		boolean specialHolderValue = false;
		if ((n>=0) && ((n % 3 == 0) || (n % 5 == 0))){
			specialHolderValue = true;
		}
		if (n%5==n%3){
			specialHolderValue = false;
		}
		return specialHolderValue;
	}

	/*
	 26. Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
	 and 39 return true, but 40 returns false.
	 (Hint: Think "mod".)
	 less20(18) → true
	 less20(19) → true
	 less20(20) → false
	 */
	public boolean less20(int n) {
		boolean specialValue = false;
		if((((n+1)%20)==0) || (((n+2)%20)==0)){
			specialValue = true;
		}
		return specialValue;
	}

	/*
	 27. Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b)
	 is the remainder of dividing a by b, so (7 % 5) is 2.
	 nearTen(12) → true
	 nearTen(17) → false
	 nearTen(19) → true
	 */
	public boolean nearTen(int num) {
		boolean specialValue = false;
		if ( (num >=0) && (num%10>=8)||(num%10<=2)){
			specialValue = true;
		}
		return specialValue;
	}

	/*
	 28. Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are
	 extra lucky. So if either value is a teen, just return 19.
	 teenSum(3, 4) → 7
	 teenSum(10, 13) → 19
	 teenSum(13, 2) → 19
	 */
	public int teenSum(int a, int b) {
		int specialValue = (a+b);
		if (((a>= 13) && (a<=19)) || ((b>=13) && (b<=19))){
			specialValue = 19;
		}
		return specialValue;
	}

	/*
	 29. Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning
	 you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
	 answerCell(false, false, false) → true
	 answerCell(false, false, true) → false
	 answerCell(true, false, false) → false
	 */
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		boolean iNeedANewPhone = true;
		if (isAsleep == true){
			iNeedANewPhone = false;
		}
		if (isMorning == true && isMom == false){
			iNeedANewPhone = false;
		}
		return iNeedANewPhone;
	}

	/*
	 30. We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as
	 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if
	 either tea or candy is at least double the amount of the other one, the party is great (2). However,
	 in all cases, if either tea or candy is less than 5, the party is always bad (0).
	 teaParty(6, 8) → 1
	 teaParty(3, 8) → 0
	 teaParty(20, 6) → 2
	 */
	public int teaParty(int tea, int candy) {
		int howLitIsThisParty = 0;
		if (tea < 5 || candy < 5){
			howLitIsThisParty = 0;
		}
		else if (tea >= 5 && candy >= 5){
			howLitIsThisParty = 1;
			if((tea >= (2 * candy)) || (candy >= (2 * tea))){
				howLitIsThisParty = 2;
			}
		}
		return howLitIsThisParty;
	}

	/*
	 31. Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
	 twoAsOne(1, 2, 3) → true
	 twoAsOne(3, 1, 2) → true
	 twoAsOne(3, 2, 2) → false
	 */
	public boolean twoAsOne(int a, int b, int c) {
		return ((a+b==c)||(a+c==b)||(b+c==a))?true:false;
	}

	/*
	 32. Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with
	 the exception that if "bOk" is true, b does not need to be greater than a.
	 inOrder(1, 2, 4, false) → true
	 inOrder(1, 2, 1, false) → false
	 inOrder(1, 1, 2, true) → true
	 */
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		boolean howDoesThisWork = false;
		if ((b>a)&&(c>b)){
			howDoesThisWork = true;
		}
		if (bOk && c>b) {
			howDoesThisWork = true;
		}
		return howDoesThisWork;
	}

	/*
	 33. Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11,
	 or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality
	 is allowed, such as 5 5 7 or 5 5 5.
	 inOrderEqual(2, 5, 11, false) → true
	 inOrderEqual(5, 7, 6, false) → false
	 inOrderEqual(5, 5, 7, true) → true
	 */
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		boolean thisIsFun = false;
		if ((equalOk) && (a <= b) && (b <= c)) {
			thisIsFun = true;
		} else if ((a<b)&&(b<c)) {
			thisIsFun = true;
		}
		return thisIsFun;
	}

	/*
	 34. Given 3 int values, a b c, return their sum. However, if one of the values is the same as another
	 of the values, it does not count towards the sum.
	 loneSum(1, 2, 3) → 6
	 loneSum(3, 2, 3) → 2
	 loneSum(3, 3, 3) → 0
	 */
	public int loneSum(int a, int b, int c) {
		if ((a==b) && (a!=c)){
			return c;
		} if ((a==c) && (a!=b)){
			return b;
		} if ((b==c) && (b!=a)){
			return a;
		} if (a==b && a==c){
			return 0;
		}
			return a + b + c;
	}

	/*
	 35. Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not
	 count towards the sum and values to its immediate right do not count. So for example, if b is 13, then both
	 b and c do not count.
	 luckySum(1, 2, 3) → 6
	 luckySum(1, 2, 13) → 3
	 luckySum(1, 13, 3) → 1
	 luckySum(13, 1, 3) → 3
	 luckySum(13, 13, 3) → 0
	 */
	public int luckySum(int a, int b, int c) {
		if (a==13 && b==13){
			return 0;
		} else if (b==13){
			return a;
		} else if (a==13){
			return c;
		} else if (c==13){
			return a + b;
		}
			return a + b + c;
	}
}