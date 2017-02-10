package com.example;

public class MyClass {

    public static void main (String args[])
    {

        char message[] = { 'H', 'i', ' ',  'I' , 'a' , 'm', ' ', 'g' , 'r', 'e' , 'a' , 't'};

        for (int i = 0; i < message.length; i++)
        {
            char temp;

            if (i == 0)
            {
                temp = '\u0048';
                message[i] = temp;
            }
            else if (i == 1)
            {
                temp = '\u0065';
                message[i] = temp;
            }
            else if (i == 2)
            {
                temp = '\u006c';
                message[i] = temp;
            }
            else if (i == 3)
            {
                temp = '\u0070';
                message[i] = temp;
            }
            else if (i == 4)
            {
                temp = '\u0020';
                message[i] = temp;
            }
            else if (i == 5)
            {
                temp = '\u006d';
                message[i] = temp;
            }
            else if (i == 6)
            {
                temp = '\u0065';
                message[i] = temp;
            }
            else if (i == 7)
            {
                temp = '\u0020';
                message[i] = temp;
            }
            else if (i == 8)
            {
                temp = '\u0053';
                message[i] = temp;
            }
            else if (i == 9)
            {
                temp = '\u004f';
                message[i] = temp;
            }
            else if (i == 10)
            {
                temp = '\u0053';
                message[i] = temp;
            }
            else if (i == 11)
            {
                temp = '\u2262';
                message[i] = temp;
            } // end if


        } //end for

        System.out.println("Message incoming....");
        System.out.println("Hi, I am great");
        System.out.println("Unicode numbers received in addition: 48, 65, 6c, 70, 20, 6d, 60 20, 53, 4f, 53, 2262");
        System.out.println("Proceed to decode.....");
        System.out.println("Message decoded, transmitting message:");

        for (int j = 0; j < message.length; j++) {

            System.out.print(message[j]);

        }


    }


}
