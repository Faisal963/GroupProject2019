package controller;

import model.PrIS;
import model.persoon.Student;
import server.Conversation;
import server.Handler;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class StudentController implements Handler {

    private PrIS informatieSysteem;

    public StudentController(PrIS informatieSysteem) {
        this.informatieSysteem = informatieSysteem;
    }

    public void handle(Conversation conversation) {
        if (conversation.getRequestedURI().startsWith("/student/studentInfo")) {
            studentInformatie(conversation);
        }
    }

    private void studentInformatie(Conversation conversation) {

        JsonObject jsonObjectIn = (JsonObject) conversation.getRequestBodyAsJSON();
        String gebruikersnaam = jsonObjectIn.getString("username");

        Student studentZelf = informatieSysteem.getStudent(gebruikersnaam);

        JsonObjectBuilder jsonObjectBuilderVoorStudent = Json.createObjectBuilder();
        jsonObjectBuilderVoorStudent.add("id", studentZelf.getStudentNummer())
                .add("firstName", studentZelf.getVoornaam())
                .add("tussenvoegsel", studentZelf.getTussenvoegsel())
                .add("lastName", studentZelf.getVolledigeAchternaam());

        String lJsonOutStr = jsonObjectBuilderVoorStudent.build().toString();
        conversation.sendJSONMessage(lJsonOutStr);
    }
}

