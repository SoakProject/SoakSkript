package org.soak.internal.skript;

import com.google.inject.Inject;
import org.apache.logging.log4j.Logger;
import org.soak.plugin.AbstractSpongePluginMain;
import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.builtin.jvm.Plugin;

@Plugin("skript")
public class SkriptSoakLaunch extends AbstractSpongePluginMain {

    @Inject
    public SkriptSoakLaunch(Logger logger, PluginContainer container) {
        super(AbstractSpongePluginMain.fromName("ch.njol.skript.Skript"), logger, container, "Skript.jar");
    }
}
