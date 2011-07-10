package org.elektro.channel.client;

import com.google.gwt.appengine.channel.client.Channel;
import com.google.gwt.appengine.channel.client.ChannelFactory;
import com.google.gwt.appengine.channel.client.ChannelFactory.ChannelCreatedCallback;
import com.google.gwt.appengine.channel.client.SocketError;
import com.google.gwt.appengine.channel.client.SocketListener;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class Enlace implements EntryPoint
{
private String clientid;
private ChannelCallBack callback;
private Socket socket;
private Escuchador escuchador;
@Override
public void onModuleLoad()
	{
	clientid=Integer.valueOf(Random.nextInt()).toString();
	callback=new ChannelCallBack();
	socket=new Socket();
	ChannelServiceAsync s=GWT.create(ChannelService.class);
	s.getToken(clientid, callback);
	}
private class ChannelCallBack implements AsyncCallback<String>
	{
	@Override
	public void onFailure(Throwable caught)
		{
		}

	@Override
	public void onSuccess(String token)
		{
		ChannelFactory.createChannel(token,socket);
		}
	}
private class Socket implements ChannelCreatedCallback
	{
	@Override
	public void onChannelCreated(Channel channel) 
		{
		channel.open(escuchador);
		}
	}
private class Escuchador implements SocketListener
	{
	public boolean cerrado=false;
	@Override
	public void onOpen()
		{
		}

	@Override
	public void onMessage(String message)
		{
		}

	@Override
	public void onError(SocketError error)
		{
		}

	@Override
	public void onClose()
		{
		if(!cerrado)
			{
			ChannelServiceAsync s=GWT.create(ChannelService.class);
			s.getToken(clientid, callback);
			}	
		}
	}
}
