package games.strategy.triplea.ui;

import java.awt.Image;

import games.strategy.triplea.ui.mapdata.MapData;
import games.strategy.ui.ImageScrollModel;
import games.strategy.ui.ImageScrollerSmallView;

public class MapPanelSmallView extends ImageScrollerSmallView {
  private static final long serialVersionUID = 8706930659664327612L;

  public MapPanelSmallView(final Image img, final ImageScrollModel model, final MapData mapData) {
    super(img, model, mapData);
  }
}
