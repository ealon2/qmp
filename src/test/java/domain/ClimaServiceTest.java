package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.imp.ClimaServiceMock;

public class ClimaServiceTest {

    ClimaServiceMock climaService;

    @BeforeEach
    public void setup (){
        climaService = new ClimaServiceMock();
    }

    @Test
    public void obtenerClimaDelServicio(){
        climaService.getWeather("Buenos Aires");
    }
}
