package des;

import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class Main {
	public static void main(String[] args) {
            try{
                System.out.print("Masukkan plaintext: ");
                Scanner sc = new Scanner(System.in);
                String plainText = sc.nextLine();
                String k = "12345678";
                System.out.println("Key: " + k);
                System.out.println("Plaintext: "+plainText);
                System.out.println("Plaintext hex: "+ DatatypeConverter.printHexBinary(plainText.getBytes()));
                // encrypt  
                System.out.println("------------------");
                byte[] enc = DES.encrypt(plainText.getBytes(), k.getBytes());
                System.out.println("Ciphertext binary: "+ new String(enc));
                System.out.println("Ciphertext hex: " + DatatypeConverter.printHexBinary(enc));
                System.out.println("Ciphertext base64: " + DatatypeConverter.printBase64Binary(enc));
                System.out.println("------------------");
                // decrypt
                byte[] dec = DES.decrypt(enc, k.getBytes());
                System.out.println("Decripted Ciphertext: "+new String(dec));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
}