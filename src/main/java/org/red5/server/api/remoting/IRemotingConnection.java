/*
 * RED5 Open Source Flash Server - http://code.google.com/p/red5/
 * 
 * Copyright 2006-2013 by respective authors (see below). All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.red5.server.api.remoting;

import java.util.Collection;

import org.red5.server.api.IConnection;

/**
 * Connection coming from Remoting clients.
 * 
 * @author The Red5 Project
 * @author Joachim Bauch (jojo@struktur.de)
 */
public interface IRemotingConnection extends IConnection {

	/**
	 * Tell the client to add a header with all further requests. This is
	 * returned to the client as response for the next request received.
	 * 
	 * @param name name of the header to add
	 * @param value value of the header to add
	 */
	public void addHeader(String name, Object value);

	/**
	 * Tell the client to add a header with all further requests. This is
	 * returned to the client as response for the next request received.
	 *  
	 * @param name name of the header to add
	 * @param value value of the header to add
	 * @param mustUnderstand a boolean flag specifying if the server must pocess this header
	 * 				before handling following headers or messages
	 */
	public void addHeader(String name, Object value, boolean mustUnderstand);
	
	/**
	 * Tell the client to no longer send a header with all further requests.
	 * This is returned to the client as response for the next request
	 * received.
	 * 
	 * @param name name of the header to remove
	 */
	public void removeHeader(String name);

	/**
	 * Return headers to send.
	 * 
	 * @return headers to send
	 */
	public Collection<IRemotingHeader> getHeaders();
	
}