import java.util.Scanner;

class CaeserCipher
{
    public static void main(String ar[])
    {
        Scanner obj = new Scanner(System.in);
        int key, i, j, ch;
        String message, enc = "";
        
        System.out.print("Enter a message: ");
        message = obj.nextLine();
        System.out.print("Enter a key value: ");
        key = obj.nextInt();
        key = key % 26;
        
        for (i = 0; i < message.length(); i++)
        {
            ch = message.charAt(i);
            if (Character.isLetter(ch))
            {
                if (Character.isUpperCase(ch))
                {
                    if (ch + key > 'Z')
                        ch = ch + key - 26;
                    else
                        ch = ch + key;
                }
                else
                {
                    if (ch + key > 'z')
                        ch = message.charAt(i) + key - 26;
                    else
                        ch = message.charAt(i) + key;
                }
            }
            enc = enc + (char)(ch);
        }
        System.out.println("The Ciphered message is: " + enc);
    }
}
