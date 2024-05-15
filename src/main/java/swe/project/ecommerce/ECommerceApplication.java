package swe.project.ecommerce;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import swe.project.ecommerce.model.Address;
import swe.project.ecommerce.model.Review;
import swe.project.ecommerce.model.User;
import swe.project.ecommerce.repository.AddressRepository;
import swe.project.ecommerce.repository.ReviewRepository;
import swe.project.ecommerce.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

//	@Bean
	CommandLineRunner commandLineRunner(ReviewRepository reviewRepository,
										AddressRepository addressRepository,
										UserRepository userRepository) {
		return args -> {
			Faker faker = new Faker();

			var list = new ArrayList<Address>();
			var item = Address.builder()
					.title("Miami")
					.city("Alex")
					.country("Egypt")
					.phoneNumber("0123546")
					.postalCode("32132")
					.build();

			list.add(item);

			addressRepository.save(item);

			var user = User.builder()
					.profile_pic(new byte[]{})
					.first_name(faker.name().firstName())
					.last_name(faker.name().lastName())
					.username(faker.name().username())
					.email(faker.internet().emailAddress())
					.password(faker.internet().password())
					.userCreationDate(LocalDateTime.now())
					.emailVerified(true)
					.addressList(list)
					.build();
			userRepository.save(user);

			var review = Review.builder()
					.title("First Review")
					.body("This is a Review, bla bla")
					.user(user)
					.build();

			reviewRepository.save(review);
		};
	}
}
