package br.com.desafiosantander.desafioSantander;

import br.com.desafiosantander.desafioSantander.dto.TheaterRoomDTO;
import br.com.desafiosantander.desafioSantander.entities.CepResponse;
import br.com.desafiosantander.desafioSantander.entities.Customer;
import br.com.desafiosantander.desafioSantander.entities.TheaterRoom;
import br.com.desafiosantander.desafioSantander.services.CepResponseService;
import br.com.desafiosantander.desafioSantander.services.TheaterRoomService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class DesafioSantanderApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSantanderApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		try {
//
//			// Busca o CEP usando o serviço de CEP
//			CepResponse endereco = CepResponseService.buscarCep("04297-000");
//
//			System.out.println(endereco);
//
//		} catch (IOException | InterruptedException e) {
//			System.out.println("Erro ao buscar o CEP: " + e.getMessage());
//		}
//
//
//		//  ------ cinema
//		Scanner scan = new Scanner(System.in);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//		System.out.println("System of register - CINEMA");
//		System.out.println("choice [1] - in");
//		System.out.println("choice [2] - out");
//		int numberAcess = scan.nextInt();
//
//		if (numberAcess < 1 || numberAcess > 2) {
//			System.out.println("Invalid number - choice [1] in / or [2] out");
//			numberAcess = scan.nextInt();
//		}
//
//
//		TheaterRoom room = new TheaterRoom();
//		//Movie movie = new Movie();
//		//Session session = new Session();
//
//		do {
//
//			System.out.println("Movie theater registration system");
//			System.out.println("Choose an option:");
//			System.out.println("[1] register a theater room");
//			System.out.println("[2] register a movie");
//			System.out.println("[3] register a session");
//			int number = scan.nextInt();
//
//			switch (number) {
//				case 1:
//
//					System.out.println("***Theater Room***");
//					System.out.print("id: ");
//					Long id = scan.nextLong();
//
//					System.out.print("Screen Type: ");
//					String screen = scan.next()+scan.nextLine();
//
//					System.out.print("Name room: ");
//					String nameRoom = scan.next()+scan.nextLine();
//
//					System.out.println("ROOM LAYOUT");
//					System.out.println("In the alphabet inform how many numbers from 1 to 26");
//					System.out.println("A[1] - B[2] - C[3] - D[4] - E[5] - F[6] - G[7] - H[8] - I[9] - J[10] - K[11] - L[12] - M[13] - N[14] - ");
//					System.out.println("O[15] - P[16] - Q[17] - R[18] - S[19] - T[20] - U[21] - V[22] - W[23] - X[24] - Y[25] - Z[26]");
//					int line = scan.nextInt();
//					if (line > 25) {
//						System.out.print("Quantity ranks permition = 26. Try again:");
//						line = scan.nextInt();
//					}
//
//					System.out.print("Column quantity:");
//					int column = scan.nextInt();
//					if (column > 9) {
//						System.out.println("Quantity armchairs permition = 10. Try again:");
//						column = scan.nextInt();
//					}
//
//					System.out.print("Enter the zip code:");
//					String zipCode = scan.next();
//
//					// constructor room
//					room = new TheaterRoom(id, screen, nameRoom, CepResponseService.buscarCep(zipCode));
//					TheaterRoomDTO dto = new TheaterRoomDTO(room);
//					TheaterRoomService service = new TheaterRoomService();
//					TheaterRoomDTO insert = service.insert(dto);
//					System.out.println(insert);
//
//
//					//roomRegister(room);
//					break;
//
//				case 2:
//					System.out.println("***Movie***");
//					System.out.print("Name:");
//					String name = scan.next()+scan.nextLine();
//					System.out.print("Duration:");
//					int duration = scan.nextInt();
//					System.out.print("Launch date");
//					Date date = sdf.parse(scan.next());
//					System.out.print("Gender movie:");
//					String gender = scan.next()+scan.nextLine();
//					System.out.print("Director: ");
//					String director = scan.next()+scan.nextLine();
//					System.out.print("Movie Type: ");
//					String movieType = scan.next()+scan.nextLine();
//
//					//movie = new Movie(name, duration, date, gender, director, movieType);
//
//					//movieRegister(movie);
//					break;
//
//				case 3:
//					System.out.println("***Session***");
//					System.out.print("Date session:");
//					date = sdf.parse(scan.next());
//
//					//session = new Session(date, movie, room);
//					break;
//
//				default: System.out.println("THE END");
//					break;
//			}
//
//			System.out.print("\nDo want continue? [1] register a new option - or - [2] out");
//			numberAcess = scan.nextInt();
//		} while (numberAcess == 1);
//
//
//		System.out.println(room);
//		scan.close();
//
//
//	}


}
