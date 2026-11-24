package com.nuvio.app.features.settings

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DiagnosticsConsentPolicyTest {

    /**
     * Privacy-first default: an untouched install sends nothing. A build that reports crashes and
     * usage before the user has made a choice is the wrong posture for a media app; diagnostics
     * that are off by default still exist as soon as the user opts in.
     */
    @Test
    fun `an untouched install stays silent until the user opts in`() {
        assertFalse(resolveDiagnosticsEnabled(stored = null))
    }

    /** An explicit no is a decision, and survives the change of default. */
    @Test
    fun `an explicit opt-out is preserved`() {
        assertFalse(resolveDiagnosticsEnabled(stored = false))
    }

    @Test
    fun `an explicit opt-in is preserved`() {
        assertTrue(resolveDiagnosticsEnabled(stored = true))
    }

    /** Only an absent value may be defaulted; a stored value is authoritative either way. */
    @Test
    fun `a stored value always wins over the default`() {
        assertEquals(false, resolveDiagnosticsEnabled(stored = false))
        assertEquals(true, resolveDiagnosticsEnabled(stored = true))
    }
}
