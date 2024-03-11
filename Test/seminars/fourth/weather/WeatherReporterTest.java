package seminars.fourth.weather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class WeatherReporterTest {

    @Test
    public void testWeather (){
        WeatherService mockWeatherServise = mock(WeatherService.class);

        when(mockWeatherServise.getCurrentTemperature()).thenReturn(30);

        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherServise);

        String report = weatherReporter.generateReport();

        assertEquals("Текущая температура: 30 градусов.", report);
    }



}