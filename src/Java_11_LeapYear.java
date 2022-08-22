package JavaInterviewQuestions.src;

public class Java_11_LeapYear {

    public static void main(String[] args) {

        //Find Leap Year
		/*Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036 vb.
Ancak bu kuralın iki istisnası vardır:

1. 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1600 ve 2000 yılları artık yıldır ancak 1800 ve 1900 artık yıl değildir.
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni,
bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.

		 */
        int year = 1900;
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " Artik yil");
                } else {
                    System.out.println(year + " artik yil degil");
                }
            } else {
                System.out.println(year + " Artik yil ");
            }


        } else {
            System.out.println(year + " Artik yil degil");
        }


        //	int year = 1900;
        //	boolean leap = false;
        //
        //	if(year % 4 == 0) {//
        //		if(year % 100 == 0) {
        //			if(year % 400 == 0) {
        //				leap = true;
        //			}else {
        //				leap = false;
        //			}
        //		}else {
        //			leap = true;
        //		}
        //	} else {
        //		leap = false;
        //	}
        //
        //	if(leap) {
        //		System.out.println(year + " is a leap year");
        //	}
        //	else {
        //		System.out.println(year + " is not a leap year");
        //	}

    }

}
