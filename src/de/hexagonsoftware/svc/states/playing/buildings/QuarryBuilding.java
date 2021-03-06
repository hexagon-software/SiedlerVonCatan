package de.hexagonsoftware.svc.states.playing.buildings;

import de.hexagonsoftware.svc.icons.IIcon;
import de.hexagonsoftware.svc.icons.Icons;
import de.hexagonsoftware.svc.states.playing.resources.PlayerResources;

public class QuarryBuilding implements IBuilding {
	private int[] coordinates;
	
	public QuarryBuilding(int x, int y) {
		this.coordinates = new int[] {x, y};
	}
	
	@Override
	public String getName() {
		return "Quarry";
	}

	@Override
	public IIcon getIcon() {
		return Icons.QUARRY;
	}

	@Override
	public int[] getCoordinates() { return this.coordinates; }

	@Override
	public void cost(PlayerResources pRes) {
		pRes.reduceResource("WOOD", 1);
		pRes.reduceResource("STONE", 1);
	}
	
}
