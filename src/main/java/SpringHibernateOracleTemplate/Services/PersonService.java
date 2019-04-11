package SpringHibernateOracleTemplate.Services;

import SpringHibernateOracleTemplate.Models.Person;
import SpringHibernateOracleTemplate.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Optional<Person> getById(int id) {
        return this.personRepository.findById(id);
    }

    public List<Person> getAll() {
        return this.personRepository.findAll();
    }

    public void addPerson(Person person) {
        this.personRepository.save(person);
    }

    public void deletePerson(Person person) {
        this.personRepository.delete(person);
    }

    public void deletePersonById(int id) {
        this.personRepository.deleteById(id);
    }
}
