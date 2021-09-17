package de.macbrayne.architectury.configcommandgen.testmod;

import de.macbrayne.architectury.configcommandgen.annotations.CommandGen;
import de.macbrayne.architectury.configcommandgen.annotations.CommandGenEntry;

@CommandGen
public class ModConfig {
    @CommandGenEntry.Ignore
    boolean test;

    String test2;
}
