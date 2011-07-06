package org.elektro.formcontrol.client;

import com.google.gwt.appengine.channel.client.Channel;
import com.google.gwt.appengine.channel.client.ChannelFactory.ChannelCreatedCallback;
import com.google.gwt.appengine.channel.client.SocketError;
import com.google.gwt.appengine.channel.client.SocketListener;
import com.google.gwt.user.client.Window;

public class Pasarela implements ChannelCreatedCallback,SocketListener
{
@Override
public void onChannelCreated(Channel channel)
	{
	channel.open(this);
	}

@Override
public void onOpen()
	{
	 Window.alert("Channel opened!");
	}

@Override
public void onMessage(String message)
	{
	 Window.alert("Received: " + message);
	}

@Override
public void onError(SocketError error)
	{
	Window.alert("Error: " + error.getDescription());
	}

@Override
public void onClose() 
	{
	Window.alert("Channel closed!");
	}
}
