import java.util.Scanner;
class h1soal2 {
	public static void main(String [] args){
		String nama,alamat;
		int umur;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan nama anda : ");
		nama= input.nextLine();
		System.out.print("masukkan alamat anda : ");
		alamat= input.nextLine();
		System.out.print("masukkan umur anda : ");
		umur = input.nextInt();
		
		
		System.out.println("Saudara : "+ nama);
		System.out.println("Tinggal di : "+ alamat);
		System.out.println("Berumur : "+ umur +" " +"tahun");
	
	
	
		
	}
}