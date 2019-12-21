package com.alex.tarasik;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

public class RSA {

    public RSA() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        Cipher cipher = Cipher.getInstance("RSA");

        KeyPairGenerator pairgen = KeyPairGenerator.getInstance ("RSA");
        KeyPair keyPair = pairgen.generateKeyPair();
        Key publicKey = keyPair.getPublic();
        Key privateKey = keyPair.getPrivate();

        System.out.println("\n");
        System.out.println(publicKey+"\n");
        System.out.println(privateKey+"\n");

//        Тестирование шифрования на примере строки

        /*String s = "hello world";

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] bytes = cipher.doFinal(s.getBytes());
        for(byte b : bytes){
            System.out.print(b);
        }
        System.out.println("\n");

        Cipher decryptCipher = Cipher.getInstance("RSA");
        decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decriptedBytes = decryptCipher.doFinal(bytes);

        for(byte b : decriptedBytes){
            System.out.print((char)b);
        }*/

    }
}
