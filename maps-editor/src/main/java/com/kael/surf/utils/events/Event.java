/*******************************************************************************
 * Copyright 2013 See AUTHORS File
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.kael.surf.utils.events;

public class Event {
	
	private boolean bubble = true;
	private boolean stopped = false;
	private boolean canceled = false;

	public boolean getBubble() {
		return bubble;
	}
	
	public void setBubble(boolean bubble) {
		this.bubble = bubble;
	}
	
	public boolean getStopped() {
		return stopped;
	}
	
	public void setStopped(boolean stopped) {
		this.stopped = stopped;
	}
	
	public boolean getCanceled() {
		return canceled;
	}
	
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}

}
