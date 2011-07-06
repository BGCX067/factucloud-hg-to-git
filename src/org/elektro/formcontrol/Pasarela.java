package org.elektro.formcontrol;

import com.google.appengine.api.channel.ChannelService;
import com.google.appengine.api.channel.ChannelServiceFactory;

public class Pasarela 
{
public String nuevoToken(String clientid)
	{
	ChannelService channelService = ChannelServiceFactory.getChannelService();
	return channelService.createChannel(clientid);
	}
}
