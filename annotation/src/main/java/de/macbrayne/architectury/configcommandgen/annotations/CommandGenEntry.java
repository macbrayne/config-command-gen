package de.macbrayne.architectury.configcommandgen.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class CommandGenEntry {
    @Target(ElementType.FIELD)
    public @interface Ignore {
    }

    public @interface OverwriteCallback {
        String callback();
    }
}
