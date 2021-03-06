package org.rust.lang.core.stubs.index

import com.intellij.psi.stubs.StringStubIndexExtension
import com.intellij.psi.stubs.StubIndexKey
import org.rust.lang.core.RustFileElementType
import org.rust.lang.core.psi.RustNamedElement

class RustGotoClassIndex : StringStubIndexExtension<RustNamedElement>() {
    companion object {
        val KEY: StubIndexKey<String, RustNamedElement> = StubIndexKey.createIndexKey("org.rust.lang.core.stubs.index.RustGotoClassIndex")
    }

    override fun getVersion(): Int = RustFileElementType.stubVersion

    override fun getKey(): StubIndexKey<String, RustNamedElement> = KEY
}
