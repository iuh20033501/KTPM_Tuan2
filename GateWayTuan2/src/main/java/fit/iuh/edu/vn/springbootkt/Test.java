package fit.iuh.edu.vn.springbootkt;
import fit.iuh.edu.vn.springbootkt.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import fit.iuh.edu.vn.springbootkt.repositories.userRepositories;

@SpringBootApplication
public class Test {
    @Autowired
    private userRepositories userRepository;
    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            public void run(String... args) throws Exception {
//                List<User> users = new ArrayList<>();
//
//
//                users.add(new User(1,1,"hung","tram chim","092972"));
//                users.add(new User(2,2,"khai","adad","31231"));
//                users = userRepository.findAll();
//                System.out.println(users);
//                for(User user : users) {
//                    System.out.println(user.getUserId());
//                    System.out.println(user.getName());
//                    System.out.println(user.getAddress());
//                    System.out.println(user.getPhoneNumber());
//                }

                for(int i = 1; i <= 10; ++i) {
                    User user =  Test.this.userRepository.save(new User(i,"user"));
                    System.out.println("user with ID: " + user.getId() + " and Name: " + user.getName());

                }
//                for(int i = 1; i <= 5; ++i) {
//                    Waterbill waterbill =  Test.this.waterBillRepositories.save(new Waterbill(i,"waterbill"));
//                    System.out.println(" ID: " + waterbill.getBillID() + " meter: " + waterbill.getMeterReading());
//
//                }
            }
        };
    }
}
