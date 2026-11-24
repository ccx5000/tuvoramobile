package com.nuvio.app.core.build

actual object AppFeaturePolicy {
    actual val buildFlavor: String = "full"
    actual val pluginsEnabled: Boolean = true
    actual val addonsEnabled: Boolean = true
    actual val debridEnabled: Boolean = true
    actual val addonStreamSourcesEnabled: Boolean = true
    actual val supportersContributorsPageEnabled: Boolean = false
    actual val accountDeletionEnabled: Boolean = false
    actual val personalMediaAddonCopyEnabled: Boolean = false
    actual val p2pEnabled: Boolean = true
    actual val trailerPlaybackMode: TrailerPlaybackMode = TrailerPlaybackMode.IN_APP
    actual val heroTrailerPlaybackSupported: Boolean = true
    actual val inAppUpdaterEnabled: Boolean = true
    actual val imdbRatingLogoEnabled: Boolean = true
    actual val debugBackendSwitcherEnabled: Boolean = AppBuildConfig.IS_DEBUG_BUILD
    actual val mediaPlaybackForegroundServiceEnabled: Boolean = true
    // Donations stay fork-owned (DONATIONS_DONATE_URL), but the built-in
    // custom-server UI is on: it is the self-hosted sync backend entry point.
    actual val donationActionsEnabled: Boolean = false
    actual val donationProgressEnabled: Boolean = false
    actual val customServerConnectionsEnabled: Boolean = true
    actual val downloadForegroundServiceEnabled: Boolean = true
}
