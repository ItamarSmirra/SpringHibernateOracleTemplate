package SpringHibernateOracleTemplate.Controllers;

import SpringHibernateOracleTemplate.Models.Person;
import SpringHibernateOracleTemplate.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    // GET

    @GetMapping("")
    public List<Person> getAll() {
        return this.personService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> getById(@PathVariable int id) {
        return this.personService.getById(id);
    }

    // Post

    @PostMapping("")
    public void addPerson(@RequestBody Person person) {
        this.personService.addPerson(person);
    }

    // Delete

    @DeleteMapping("/{id}")
    public void deletePersonById(@PathVariable int id) {
        this.personService.deletePersonById(id);
    }

    @DeleteMapping("")
    public void deletePerson(@RequestBody Person person) {
        this.personService.deletePerson(person);
    }
}
