package com.alcanl.app.stream.agent;

import java.net.SocketAddress;

public interface IStreamClientAgent {
	void connect(SocketAddress streamServerAddress);
	void stop();
}