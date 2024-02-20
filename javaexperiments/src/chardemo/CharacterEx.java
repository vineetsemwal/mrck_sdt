package chardemo;

public class CharacterEx {
    public static void main(String[] args) {
        // char-1 byte -- 8 bits ,2^8= 256
        //2 byte-16 bits, 2^16= 64*1,024
        char char1 = 'A';
        int charCode1 = char1;
        System.out.println("char is =" + char1 + " code is " + charCode1);

        int charCode2 = 98;
        char char2 = (char) charCode2;
        System.out.println("character for charcode=" + charCode2 + " is " + char2);

        Integer num=10;//autoboxing
        Character character='a';//autoboxing

        for (int i = 0; i < (64 * 1024); i++) {
            System.out.print((char) i);
            if ((i % 100) == 0) {
                System.out.println((char) i);
            }
        }
    }
}
