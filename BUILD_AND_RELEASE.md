
# Build & Release Guide for Nuxes Nova

This document explains how to build production-ready binaries for Android and iOS.

## Android (Play Store)
1. Open project in **Android Studio** (Arctic Fox or later).
2. Generate a release keystore (`keytool -genkey -v -keystore nuxes_nova.jks -keyalg RSA -keysize 2048 -validity 10000 -alias nuxesnova`).
3. In **gradle.properties**, add:
   ```
   MYAPP_RELEASE_STORE_FILE=nuxes_nova.jks
   MYAPP_RELEASE_KEY_ALIAS=nuxesnova
   MYAPP_RELEASE_STORE_PASSWORD=...
   MYAPP_RELEASE_KEY_PASSWORD=...
   ```
4. In Android Studio: **Build > Generate Signed Bundle/APK > Android App Bundle**.
5. Upload the `.aab` to Google Play Console.

## iOS (App Store)
1. Open `iosApp/` in **Xcode**.
2. Set the **Bundle Identifier** to your own under Signing & Capabilities.
3. Ensure **Info.plist** contains `CFBundleDisplayName = Nuxes Nova`.
4. Connect your Apple Developer account and select a valid team.
5. Product > Archive > Distribute App (App Store Connect).
6. Submit via **Transporter** app or directly from Xcode.

## Assets to Prepare
- Icon PNGs (512×512 for Play Store, 1024×1024 for App Store).
- Feature graphics (Play Store: 1024×500).
- 4–6 screenshots (1080×1920 for phones).
- Promo video (optional but recommended).

## Support Materials
- Privacy Policy (see `PRIVACY_POLICY.md`).
- Contact email for support.
- Marketing description (long & short).
