package mainPackage;
import ObserverObject.CurrentConditionsDisplay;
import ObserverObject.ForecastDisplay;
import ObserverObject.StatisticsDisplay;
import implementObject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastdisplay = new ForecastDisplay(weatherData);

		// setMeasurements
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
