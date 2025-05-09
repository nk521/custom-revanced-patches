package app.revanced.patches.example

import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val examplePatch = bytecodePatch(
    name = "Example Patch",
    description = "This is an example patch to start with.",
) {
    compatibleWith("in.swiggy.android"("4.79.2"))

    // extendWith("extensions/extension.rve")

    execute {
        // TODO("Not yet implemented")
    }
}
