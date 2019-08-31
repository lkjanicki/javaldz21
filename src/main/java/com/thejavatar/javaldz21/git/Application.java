package com.thejavatar.javaldz21.git;

import java.util.Scanner;

public class Application {

    public static void main( String[] args ) {
        Scanner myObj = new Scanner( System.in );
        System.out.println( "Wprowadz nazwe uzytkownika" );

        String userName = myObj.nextLine(); //
        System.out.println( "Uzytkownik wybral nazwe: "+userName);
    }

}
