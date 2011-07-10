package org.elektro.channel.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ChannelServiceAsync
	{
	void getToken(String clientid,AsyncCallback<String> callback);
	}
