package com.example;

import com.example.entities.Client;
import com.example.entities.Produit;
import com.example.entities.User;
import com.example.repositories.ClientRepository;
import com.example.repositories.ProduitRepository;
import com.example.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	CommandLineRunner start(UserRepository userRepository, ClientRepository clientRepository, ProduitRepository produitRepository)
	{
		return args -> {
			userRepository.saveAll(List.of(
					new User(null,"Taha","taha","ADMIN"),
					new User(null,"Yassine","taha","USER"),
					new User(null,"Toto","taha","USER"),
					new User(null,"Ma","taha","USER"),
					new User(null,"Sal","taha","ADMIN")
			));
			clientRepository.saveAll(List.of(
					new Client(null,"Taha","EL MANIARI","0684684455","Ain Sebaa"),
					new Client(null,"Yassine","EL MANIARI","06846865","Casa"),
					new Client(null,"Hisham","EL MANIARI","06478485875","Rabat")
			));
			produitRepository.saveAll(List.of(
					new Produit(null,"Produit 1",10,450.00,"Mon Produit Description"),
					new Produit(null,"Produit 10",15,440.00,"Mon Produit 10 Description"),
					new Produit(null,"Produit 100",20,470.00,"Mon Produit 100 Description")
			));
			produitRepository.findAll().forEach(p ->
			{
				System.out.println(p.getTitre() + " , description : "+p.getDescription());
			});
		};
	}
}
