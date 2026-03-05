package app.botdrop.automation;

import android.content.pm.PackageManager;

public interface DroidBotAccessibilityService {
    PackageManager getPackageManager();
    String getActivePackageName();
    String getLastObservedPackageName();
}




