import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class PalindromeQueue{

    public static void main(String[] args) {

    	System.out.print("Masukkan kata apapun : "); //input untuk memasukan kata
        Scanner in=new Scanner(System.in);// instance object class scanner
        String inputString = in.nextLine();
        Queue queue = new LinkedList();

        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i)); // mengambil nilai dari string ketika dibalik
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove(); //perulangan proses input 
            //untuk menentukan kata itu palindrome atau tidak
        }
        if (inputString.equals(reverseString))
            System.out.println("Adalah palindrom."); //menampilkan hasil jika kata tersebut merupakan palindrome
        else
            System.out.println("Bukan palindrom."); //menampilkan hasil jika kata tersebut bukan palindrom

    }
}