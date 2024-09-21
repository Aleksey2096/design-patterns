package com.example.patterns.structural.facade;

public class Runner {
	public static void main(String[] args) {
		VideoConversionFacade converter = new VideoConversionFacade();
		converter.convertVideo("youtubevideo.ogg", "mp4");
	}
}
