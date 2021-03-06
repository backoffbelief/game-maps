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

package com.kael.surf.maps.editor.events;

import com.kael.surf.maps.basic.MapLayer;
import com.kael.surf.maps.basic.MapLayers;

public class MapLayersChangeEvent extends ChangeEvent<MapLayers>{
	
	private MapLayer layer;

	public MapLayer getLayer() {
		return layer;
	}

	public void setLayer(MapLayer layer) {
		this.layer = layer;
	}

	public MapLayersChangeEvent() {
		super();
	}

	public MapLayersChangeEvent(MapLayers layers) {
		super(layers);
	}

	public MapLayersChangeEvent(MapLayers layers, MapLayer layer) {
		super(layers);
		this.layer = layer;
	}

	@Override
	public void reset() {
		super.reset();
		setLayer(null);
	}
	
}
