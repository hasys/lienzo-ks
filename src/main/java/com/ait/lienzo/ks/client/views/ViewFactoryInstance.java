/*
   Copyright (c) 2014,2015,2016 Ahome' Innovation Technologies. All rights reserved.

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

package com.ait.lienzo.ks.client.views;

import com.ait.lienzo.ks.client.views.components.*;

import java.util.HashMap;

public final class ViewFactoryInstance implements KSViewNames
{
    private static final ViewFactoryInstance    INSTANCE    = new ViewFactoryInstance();

    private final HashMap<String, IViewFactory> m_factories = new HashMap<String, IViewFactory>();

    public final static ViewFactoryInstance get()
    {
        return INSTANCE;
    }

    private ViewFactoryInstance()
    {
        put(WELCOME, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new WelcomeViewComponent());
            }
        });
        /*
        put(PIE_CHART, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new PieChartViewComponent());
            }
        });
        put(BAR_CHART, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new BarChartViewComponent());
            }
        });
        put(LINE_CHART, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new LineChartViewComponent());
            }
        });
        */
        put(IMAGE_EVENTS, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new ImageEventsViewComponent());
            }
        });
        put(PICTURE_FILTERS, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new PictureFiltersViewComponent());
            }
        });
        put(TIGER, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new TigerViewComponent());
            }
        });
        put(LION, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new LionViewComponent());
            }
        });
        put(PLAYPEN, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new AnimateViewComponent());
            }
        });
        put(ATTRIBUTES_BATCHED, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new AttributesChangedBatcherViewComponent());
            }
        });
        put(ALIGN_DISTRIBUTE, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new AlignDistributeViewComponent());
            }
        });
        put(SPRITES, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new SpritesViewComponent());
            }
        });
        put(POLYLINES, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new PolyLinesViewComponent());
            }
        });
        put(CORNER_RADIUS, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new CornerRadiusViewComponent());
            }
        });
        put(MULTIPATH_RESIZE, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new MultiPathResizeViewComponent());
            }
        });
        put(SVG_BOUNDING, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new SVGBoundsViewComponent());
            }
        });
        put(BEZIER_BOUNDING, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new BezierCurveBoundsViewComponent());
            }
        });
        put(QUADRATIC_BOUNDING, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new QuadraticCurveBoundsViewComponent());
            }
        });
        put(SPLINE_BOUNDING, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new SplineBoundsViewComponent());
            }
        });
        put(TEXT_BOUNDING, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new TextBoundsViewComponent());
            }
        });
        put(MULTIPATH_BOUNDING, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new MultiPathBoundsViewComponent());
            }
        });
        put(CARDINAL_INTERSECT, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new CardinalIntersectViewComponent());
            }
        });
        put(MOVIE_FILTERS, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new MovieFiltersViewComponent());
            }
        });
        put(GREEN_SCREEN, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new GreenScreenViewComponent());
            }
        });
        put(RECTANGLE_CLICK_TEST, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new RectangleClickViewComponent());
            }
        });
        put(WIRES_SQUARES, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new WiresSquaresViewComponent());
            }
        });
        put(WIRES_RESIZE, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new WiresResizeViewComponent());
            }
        });
        put(WIRES_DOCKING, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new WiresDockingViewComponent());
            }
        });
        put(WIRES_ARROWS, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new WiresArrowsViewComponent());
            }
        });
        put(MANDELBROT, new IViewFactory()
        {
            @Override
            public void make(IViewFactoryCallback callback)
            {
                callback.accept(new MandelbrotComponent());
            }
        });
    }

    private final void put(String link, IViewFactory fact)
    {
        m_factories.put(link, fact);
    }

    public final void make(String link, IViewFactoryCallback callback)
    {
        IViewFactory factory = m_factories.get(link);

        if (null != factory)
        {
            factory.make(callback);
        }
        else
        {
            callback.accept(new WelcomeViewComponent());
        }
    }

    public final boolean isDefined(String link)
    {
        return m_factories.containsKey(link);
    }
}
