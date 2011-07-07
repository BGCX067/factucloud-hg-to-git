package org.elektro.channel.server;

import org.elektro.channel.client.ChannelService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ChannelServiceImpl extends RemoteServiceServlet implements	ChannelService
{
private static final long serialVersionUID = 1L;

@Override
public String getToken()
	{
	return null;
	}
}
