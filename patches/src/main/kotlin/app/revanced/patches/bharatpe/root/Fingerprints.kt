package app.revanced.patches.bharatpe.root

import app.revanced.patcher.fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal val bFingerprint = fingerprint {
    accessFlags(AccessFlags.PUBLIC)
    returns("V")
    strings("this\$0")
    
    custom { method, _ ->
        method.name == "run" && method.definingClass == "Lcom/postpe/app/appUseCases/common/b;"
    }
}
