package in.sp.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean    //("stdobj")
    public Student stdId1(){
        Student std = new Student();
        std.setName("Taran");
        std.setEmail("taranduggal2004@gmail.com");
        std.setRollno(100);
        return std;
    }
}
