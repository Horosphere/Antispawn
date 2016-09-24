package horosphere.antispawn

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = Antispawn.ModId, version = "0.0.1", modLanguage = "scala")
object Antispawn {
  final val ModId = "Antispawn"


  @Mod.EventHandler
  def onInitialisation(event: FMLInitializationEvent): Unit = {
    MinecraftForge.EVENT_BUS register EventHandler
  }

}
