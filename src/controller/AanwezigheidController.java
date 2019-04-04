package controller;

import model.PrIS;
import model.persoon.Student;
import server.Conversation;
import server.Handler;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

class AanwezigheidController implements Handler {
    private PrIS informatieSysteem;
    private JsonObject JsonObjIn;

    public AanwezigheidController(PrIS infoSys) {

        informatieSysteem = infoSys;
    }

    public void handle(Conversation conversation) {
        if (conversation.getRequestedURI().startsWith("/Docent/aanwezigheid")) {
            registreerAanwezigheid(conversation);
        }
    }

    private void registreerAanwezigheid(Conversation conversation) {

        JsonObject jsonObjIn = (JsonObject) conversation.getRequestBodyAsJSON();
        String gebruikersnaam = jsonObjIn.getString("username");

        boolean isAanwezig = aanwezigMelden(gebruikersnaam);

        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
        jsonObjectBuilder.add(gebruikersnaam, isAanwezig);// en teruggekregen gebruikersrol als JSON-object...

        String jsonOut = jsonObjectBuilder.build().toString();
        conversation.sendJSONMessage(jsonOut); // terugsturen naar de Polymer-GUI!
    }

    private boolean aanwezigMelden(String request) {

        String melding = "aanwezig";

        if (!melding.equals(request)) {
            return false;
        } else {
            return true;
        }
    }

    private void aanwezigheidOpslaan(Conversation conversation) {
        JsonObject jsonObjectIn = (JsonObject) conversation.getRequestBodyAsJSON();
        String username = jsonObjectIn.getString("username");
        Student student = informatieSysteem.getStudent(username);

//        JsonArray


    }


}