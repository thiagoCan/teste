package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		List<Leitor> list = new ArrayList<>();
		
		String arq = "D:\\Backup_Thiago_linux\\Documentos\\API6\\teste\\leitura\\dados.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String nome = fields[0];
				double valor = Double.parseDouble(fields[1]);
				
				list.add(new Leitor(nome, valor));
				
				line = br.readLine();
			}
			
			for (Leitor leitor : list) {
				System.out.println(leitor);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}