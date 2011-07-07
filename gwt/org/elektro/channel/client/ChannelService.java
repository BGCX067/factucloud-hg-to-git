package org.elektro.channel.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("channel")
public interface ChannelService extends RemoteService
{
public String getToken();
}
