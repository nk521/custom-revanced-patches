package app.revanced.patches.bharatpe.root

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions

@Suppress("unused")
val bharatpePatch = bytecodePatch(name = "Remove root checks") {
    compatibleWith("com.postpe.app")

    execute {
        bFingerprint.method.addInstructions(0, "return-void")
    }
}
