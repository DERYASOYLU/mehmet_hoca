package day41_errors_garbageCollector;

public class C02 {

	public static void main(String[] args) {
		
		System.out.println(C01_Final.pi);
		
		// C01_Final.pi=4.13; pi sayisini static olarak  tamimladik ki her yerden rahatlikla ulasabilelim
		// Final yaptik ki isteyen ulasabilsin ama kimse degerini degistiremesin
		
		System.out.println(C01_Final.pi);
	}

}
