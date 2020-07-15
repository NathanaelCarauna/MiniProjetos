import java.util.Scanner;

public class AgendaPessoal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] agenda = new String[31][24];

		boolean sair = false;
		String entrada, compromisso = "Horário livre";
		int opcao, dia = -1, hora = -1;

		System.out.println("Bem vindo à sua Agenda Pessoal\n".toUpperCase());

		do {
			System.out.println("Digite o número correspondente à função que deseja selecionar:");
			System.out.println("[1] - Agendar compromisso");
			System.out.println("[2] - Consultar compromisso");
			System.out.println("[3] - Consultar dia");
			System.out.println("[4] - Mostrar agenda completa");
			System.out.println("[5] - Sair");

			entrada = scan.next();
			System.out.println();


			if(!(entrada.equals("1") || entrada.equals("2") || entrada.equals("3") || entrada.equals("4"))){

				System.out.println("Entrada inválida\n");

			}else {

				opcao = Integer.parseInt(entrada);

				if(opcao == 1) {  //Adicionar um compromisso

					System.out.println("Vamos agendar um compromisso.");

					while(true) {

						System.out.println("Qual é a dia?");
						dia = scan.nextInt();

						if(!(dia >31 || dia <1 )) {
							break;
						}else {
							System.out.println("Dia inválido. Por favor, digite novamente.");
						}
					}


					while(true) {

						System.out.println("Que horas?");
						hora = scan.nextInt();

						if(!(hora >23 || dia <0 )) {
							break;
						}else {
							System.out.println("Hora inválida.");
						}

					}

					System.out.println("Qual o compromisso?");
					compromisso = scan.next();
					dia--;
					agenda[dia][hora] = compromisso;

					
					System.out.println("Compromisso agendado com sucesso!");
					System.out.println("Dia " + (dia+1) + " às " + hora + " hora(s)," + "\""+ agenda[dia][hora]+"\"\n");

				}else if(opcao ==2) {  //Verificar um compromisso

					System.out.println("Vamos ver seus compromissos.");
					while(true) {

						System.out.println("Qual é a dia?");
						dia = scan.nextInt();

						if(!(dia >31 || dia <1 )) {
							break;
						}else {
							System.out.println("Dia inválido. Por favor, digite novamente.");
						}
					}


					while(true) {

						System.out.println("Que horas?");
						hora = scan.nextInt();

						if(!(hora >23 || dia <0 )) {
							break;
						}else {
							System.out.println("Hora inválida.");
						}

					}
					System.out.println("...");
					System.out.println("Dia " + dia + " às " + hora + " horas," + "\""+agenda[dia-1][hora-1]+"\"\n");

				}else if(opcao== 3) {  //Consultar dia

					while(true) {

						System.out.println("Qual dia você deseja exibir?");
						dia = scan.nextInt();

						if(!(dia >31 || dia <1 )) {
							break;
						}else {
							System.out.println("Dia inválido. Por favor, digite novamente.");
						}
					}
					
					System.out.println("Exibindo compromissos do dia " + dia+":");
					dia--;
					for(int i = 0; i< agenda[dia].length;i++) {

						System.out.println("\t"+ (i+1) + " hora(s)," + "\""+agenda[dia][i]+"\"");

					}
					System.out.println();

				}else if(opcao== 4) {  //Imprimir vetor agenda

					for(int i = 0; i< agenda.length;i++) {
						System.out.println("Dia " + (i+1) + " às: " );
						for(int j = 0; j< agenda[i].length; j++) {
							System.out.println("\t"+ (j+1) + " hora(s)," + "\""+agenda[i][j]+"\"");
						}
					}
					System.out.println();

				}else if(opcao == 5) {  //Sair do programa

					System.out.println("Saindo do programa!");
					System.out.println("...");
					sair = true;
				}
			}

		}while(!sair);
	}
}
