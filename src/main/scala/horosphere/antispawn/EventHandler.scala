package horosphere.antispawn

import net.minecraft.entity.monster.EntitySlime
import net.minecraftforge.event.entity.living.LivingSpawnEvent
import net.minecraftforge.fml.common.eventhandler.{Event, SubscribeEvent}

object EventHandler {

  @SubscribeEvent
  def onLivingSpawn(event: LivingSpawnEvent.CheckSpawn): Unit = {
    event.getEntity() match {
      case e: EntitySlime =>
        if (event.getY() < 40.0f) event.setResult(Event.Result.DENY)
      case _ =>
    }
  }

}
