import com.google.gson.Gson;

import static spark.Spark.*;
public class main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        get("/hello", (req, res) -> "HelloWorld");
        post("/hello",(req,res)->
        {
            System.out.println(req.body());
            return "post ricevuta";
        });

        post("/prodotti", (req,res)->
        {
            Product p = gson.fromJson(req.body(), Product.class);
            System.out.println(p.toString());
            return "prodotto ricevuto";
        });

        put("/prodotti",((request, response) -> {
            String nome = request.queryMap().get("nome").value();
            String descrizione = request.queryMap().get("descrizione").value();
            return "prodotto inserito";
        }));
    }
}
