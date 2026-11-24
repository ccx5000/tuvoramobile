package com.nuvio.app.features.settings

/**
 * Whether this device reports diagnostics, given what the user has previously chosen.
 *
 * This drives PostHog's opt-out, so it governs every event the app sends — crashes, ANRs, screens,
 * playback, abnormal exits — not only the crash reports the setting is named after.
 *
 * The default is OFF: privacy-friendly build posture — no crash, usage, or diagnostic event leaves
 * the device unless the user explicitly opts in via the "Crash & usage reports" switch. A stored
 * value always wins. Someone who has turned this on has made a decision, and changing the default
 * must never quietly reverse it.
 */
internal fun resolveDiagnosticsEnabled(stored: Boolean?): Boolean = stored ?: DIAGNOSTICS_DEFAULT_ENABLED

internal const val DIAGNOSTICS_DEFAULT_ENABLED = false
