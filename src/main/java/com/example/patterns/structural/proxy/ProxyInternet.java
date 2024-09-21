package com.example.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	private final Internet internet = new RealInternet();
	private static final List<String> BANNED_SITES = new ArrayList<>();

	static {
		BANNED_SITES.add("abc.com");
		BANNED_SITES.add("def.com");
		BANNED_SITES.add("ijk.com");
		BANNED_SITES.add("lnm.com");
	}

	@Override
	public void connectTo(String serverHost) throws Exception {
		if (BANNED_SITES.contains(serverHost.toLowerCase())) {
			throw new Exception("Access to " + serverHost + " Denied");
		}
		internet.connectTo(serverHost);
	}
}
