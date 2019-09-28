####Best Praticies

Thymeleaf > https://www.baeldung.com/spring-boot-crud-thymeleaf
    SpringTemplateEngine
    
 @RestController -> @RequestMaping
                    @Controller
                    @ResponseBody
                    @Configuration


@ControllerAdvice -> Exception

Faker https://www.baeldung.com/java-faker


life cycle

1 - CONTROLLER(rest) @Autowired do interface of SERVICE or @Autowired Repository / 
2 - SERVICE (old business) ->  @Autowired Repository (!!!!!!!!caution -------- circle reference to other SERVICE)
3 - REPOSITORY(old DAO) - Spring DATA (JPA, HIBERNATE)

