package testingfolder;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class SystemIn {
	
	public static void main(String[] args) throws IOException {
/* ��� ��������� ���
������ � ���������� ����� � ���, ������� �� ����� ������:
����� �������� ��� ����� ������ ���. ��-��-��!
������: ���� �������� ��� ����� 8 ���. ��-��-��!

������������������ �������� ������ ����� ������� ��������.
*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader.readLine();
		String sAge = reader.readLine();

		
		
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.nextLine();
//		int age = scanner.nextInt();
//				
		System.out.println(name + " �������� ��� ����� " + sAge + " ���. ��-��-��!");
	}

}
