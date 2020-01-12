package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/v0")
public class QuotesController {

    @Autowired
    private WebClient.Builder webclientBuilder;

    @GetMapping("/quotes")
    @ResponseBody
    public Mono<String> getQuotes(){
       return  webclientBuilder.build()
                .get()
                .uri("http://34.69.21.68/query/hello")
                .retrieve().bodyToMono(String.class);
    }

}
