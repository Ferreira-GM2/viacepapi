

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Buscador {

    public void buscar(String cep) throws IOException, InterruptedException {

            String search = "https://viacep.com.br/ws/" + cep +"/json/";


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(search))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            FileWriter escrita = new FileWriter("base_dados.json", true);
            escrita.write(json + ",\n");
            escrita.close();

    }
}
