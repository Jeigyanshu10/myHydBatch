package com.te.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.playerdto.Player;
import com.te.playerdto.PlayerResponse;
import com.te.playerservice.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService service;

	@PostMapping(path = "/add", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public PlayerResponse addPlayer(@RequestBody Player player) {

		PlayerResponse response = new PlayerResponse();

		if (service.addPlayer(player)) {
			response.setStatusCode(200);
			response.setMessage("Successfull");
			response.setDescription("Player : " + player.getName() + " added successfully");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("Player : " + player.getName() + " failed to add");
		}

		return response;
	}

	@PutMapping(path = "/update", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public PlayerResponse updateMyPlayer(@RequestBody Player player) {

		PlayerResponse response = new PlayerResponse();
		if (service.updateMyPlayer(player)) {
			response.setStatusCode(200);
			response.setMessage("Successfull");
			response.setDescription("Player with Jersey Number: " + player.getJerseyNumber() + " updated successfully");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("Player with Jersey Number: " + player.getJerseyNumber() + " failed to update");
		}
		return response;
	}

	@GetMapping(path = "/get/{jno}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public PlayerResponse fetchPlayer(@PathVariable("jno") int jerseyNumber) {
		PlayerResponse response = new PlayerResponse();
		Player myPlayer = service.getPlayer(jerseyNumber);
		if (myPlayer != null) {
			response.setStatusCode(200);
			response.setMessage("Successfull");
			response.setDescription("Below are the details of the player you are looking for:");
			response.setPlayer(myPlayer);
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("Unable to fetch the data of the player with Jersey number : " + jerseyNumber);
		}

		return response;
	}

	@DeleteMapping(path = "/delete/{jno}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public PlayerResponse deletePlayer(@PathVariable("jno") int jerseyNumber) {
		PlayerResponse response = new PlayerResponse();
		if (service.deletePlayer(jerseyNumber)) {
			response.setStatusCode(200);
			response.setMessage("Successfull");
			response.setDescription("Player with Jerysey Number : " + jerseyNumber + " was fired!!");

		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription(
					"Unable to delete the player with Jersey Number : " + jerseyNumber + ". Please try cheiu tarwata");
		}

		return response;
	}
}
