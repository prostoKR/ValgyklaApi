package lt.vtmc.valgykla;

import javax.management.relation.Role;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lt.vtmc.valgykla.models.ERole;
import lt.vtmc.valgykla.repository.RoleRepository;

@SpringBootApplication
public class ValgyklaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValgyklaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initialData(RoleRepository roleRepo) {
		return args -> {
			if (roleRepo.findByName(ERole.ROLE_USER).isEmpty()) {
				roleRepo.save(new Role(ERole.ROLE_USER));
			}
			if (roleRepo.findByName(ERole.ROLE_ADMIN).isEmpty()) {
				roleRepo.save(new Role(ERole.ROLE_ADMIN));
			}
		};
	}

}
