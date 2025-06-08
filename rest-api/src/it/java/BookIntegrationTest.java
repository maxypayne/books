import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("it") // Active application-it.yml
public class BookIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    private String baseUrl() {
        return "http://localhost:" + port + "/books";
    }

    @Test
    void shouldSaveBookAndGetAllBooks() throws Exception {
        // Arrange
        Map<String, Object> request = Map.of(
            "isbn", "978-9999999999",
            "title", "Integration Test Book",
            "author", "Test Author"
        );

        // Act: POST
        ResponseEntity<Integer> postResponse = restTemplate.postForEntity(
            baseUrl() + "/save",
            request,
            Integer.class
        );

        // Assert: status and returned ID
        assertThat(postResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(postResponse.getBody()).isNotNull();

        // Act: GET
        ResponseEntity<List> getResponse = restTemplate.getForEntity(baseUrl(), List.class);

        // Assert: should contain at least one book
        assertThat(getResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(getResponse.getBody()).isNotNull();

        // Optional: check if our book is in the response
        boolean containsOurBook = getResponse.getBody().stream()
            .anyMatch(book -> ((Map<?, ?>) book).get("title").equals("Integration Test Book"));

        assertThat(containsOurBook).isTrue();
    }
}
