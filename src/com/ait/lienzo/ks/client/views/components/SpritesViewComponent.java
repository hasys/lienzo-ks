/*
   Copyright (c) 2014 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ait.lienzo.ks.client.views.components;

import java.util.ArrayList;

import com.ait.lienzo.client.core.image.SpriteLoadedHandler;
import com.ait.lienzo.client.core.shape.Layer;
import com.ait.lienzo.client.core.shape.Sprite;
import com.ait.lienzo.client.core.types.BoundingBox;
import com.ait.lienzo.client.core.types.SpriteMap;
import com.ait.lienzo.client.widget.LienzoPanel;
import com.ait.lienzo.ks.client.views.AbstractViewComponent;
import com.ait.lienzo.shared.core.types.DragMode;

public class SpritesViewComponent extends AbstractViewComponent
{
    private final LienzoPanel m_lienzo = new LienzoPanel();

    public SpritesViewComponent()
    {
        Layer layer = new Layer();

        make(50, 50, layer);

        make(100, 200, layer);

        make(200, 50, layer);

        make(300, 300, layer);

        make(400, 100, layer);

        m_lienzo.add(layer);

        m_lienzo.setBackgroundLayer(new StandardBackgroundLayer());

        add(m_lienzo);
    }

    private final void make(int x, int y, final Layer layer)
    {
        ArrayList<BoundingBox> frames = new ArrayList<BoundingBox>();

        frames.add(new BoundingBox(0, 0, 50, 50));

        frames.add(new BoundingBox(50, 0, 50, 50));

        frames.add(new BoundingBox(100, 0, 50, 50));

        frames.add(new BoundingBox(150, 0, 50, 50));

        frames.add(new BoundingBox(200, 0, 50, 50));

        frames.add(new BoundingBox(250, 0, 50, 50));

        frames.add(new BoundingBox(300, 0, 50, 50));

        frames.add(new BoundingBox(350, 0, 50, 50));

        frames.add(new BoundingBox(400, 0, 50, 50));

        frames.add(new BoundingBox(450, 0, 50, 50));

        new Sprite("coinsprite.png", 10, new SpriteMap("coins", frames), "coins").setDraggable(true).setDragMode(DragMode.SAME_LAYER).setX(x).setY(y).onLoaded(new SpriteLoadedHandler()
        {
            @Override
            public void onSpriteLoaded(Sprite sprite)
            {
                layer.add(sprite);

                sprite.play();
            }
        });
    }

    @Override
    public LienzoPanel getLienzoPanel()
    {
        return m_lienzo;
    }
}
