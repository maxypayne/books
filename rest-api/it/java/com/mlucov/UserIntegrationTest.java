package com.mlucov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UserIntegrationTest {
    Iboo
    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeAll
    void waitForPostgres() throws InterruptedException {
        boolean isUp = false;
        while (!isUp) {
            try (Socket socket = new Socket("localhost", 5432)) {
                isUp = true;
            } catch (IOException e) {
                System.out.println("Waiting for PostgreSQL...");
                Thread.sleep(2000);
            }
        }
    }

    @Test
    void shouldCreateUser() {
        var request = new UserDto("john@example.com");
        var response = restTemplate.postForEntity("/users", request, Void.class);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }
    }
}