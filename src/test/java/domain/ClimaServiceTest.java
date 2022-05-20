package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.imp.ClimaServiceMock;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ClimaServiceTest {

    ClimaServiceMock apiClima;
    List<Map<String, Object>> response;

    @BeforeEach
    public void setup (){
        apiClima = new ClimaServiceMock();
    }

    @Test
    public void obtenerClimaDeBuenosAires(){
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
        assertEquals(condicionesClimaticas.get(0).get("PrecipitationProbability"),0);
    }
}
