package com.example.frontend;

import jakarta.ws.rs.client.AsyncInvoker;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BatimentController {
    @FXML
    TextField t1;
    @FXML
    Button b1;
    Client client = ClientBuilder.newClient();

    WebTarget target = client.target("http://localhost:8081");
    @FXML
    public void add(ActionEvent event){


        Response response=target.path("batiment").path(t1.getText()).request(MediaType.APPLICATION_JSON_TYPE).method("POST");
    }


    }



