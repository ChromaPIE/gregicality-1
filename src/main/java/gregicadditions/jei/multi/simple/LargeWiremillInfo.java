package gregicadditions.jei.multi.simple;

import com.google.common.collect.Lists;
import gregicadditions.item.GAMetaBlocks;
import gregicadditions.machines.GATileEntities;
import gregicadditions.machines.multi.simple.TileEntityLargeWiremill;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.common.blocks.BlockWireCoil;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.integration.jei.multiblock.MultiblockInfoPage;
import gregtech.integration.jei.multiblock.MultiblockShapeInfo;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;

import java.util.ArrayList;
import java.util.List;

public class LargeWiremillInfo extends MultiblockInfoPage {
	@Override
	public MultiblockControllerBase getController() {
		return GATileEntities.LARGE_WIREMILL;
	}

	@Override
	public List<MultiblockShapeInfo> getMatchingShapes() {
		ArrayList<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
			shapeInfo.add(MultiblockShapeInfo.builder()
					.aisle("XXX", "XEX", "XXX")
					.aisle("XXX", "XXX", "XXX")
					.aisle("XXX", "XXX", "XXX")
					.aisle("XXX", "XXX", "XXX")
					.aisle("IMO", "MSM", "XMX")
					.where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.HV], EnumFacing.SOUTH)
					.where('S', GATileEntities.LARGE_WIREMILL, EnumFacing.SOUTH)
					.where('X', GAMetaBlocks.getMetalCasingBlockState(TileEntityLargeWiremill.casingMaterial))
					.where('#', Blocks.AIR.getDefaultState())
					.where('I', MetaTileEntities.ITEM_IMPORT_BUS[GTValues.LV], EnumFacing.SOUTH)
					.where('O', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.LV], EnumFacing.SOUTH)
					.where('M', GAMetaBlocks.MOTOR_CASING.getDefaultState())
					.build());


		return Lists.newArrayList(shapeInfo);
	}

	@Override
	public String[] getDescription() {
		return new String[]{};
	}
}
