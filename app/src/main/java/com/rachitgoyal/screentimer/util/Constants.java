package com.rachitgoyal.screentimer.util;


import java.util.Arrays;
import java.util.List;

/**
 * Created by Rachit Goyal on 15/03/18
 */

public class Constants {

    public static final int TIME_BAR_ID = 11111;
    public static final String NOTIFICATION_CHANNEL_ID = "GAZE_AWAY";
    public static final String NOTIFICATION_CHANNEL_ID_REMINDER = "GAZE_AWAY_REMINDER";
    public static final String NOTIFICATION_CHANNEL_NAME = "Gaze Away";

    public static final List<String> timeOptions = Arrays.asList("15 minutes",
            "30 minutes",
            "45 minutes",
            "1 hour",
            "1.5 hours",
            "2 hours",
            "2.5 hours",
            "3 hours",
            "4 hours",
            "5 hours",
            "6 hours",
            "8 hours",
            "10 hours",
            "12 hours",
            "15 hours",
            "18 hours",
            "21 hours",
            "24 hours");

    public interface ACTION {
        String STARTFOREGROUND_ACTION = "com.rachitgoyal.foregroundservice.action.startforeground";
        String STOP_SERVICE = "com.rachitgoyal.stopservice";
        String UPDATE_TIMER = "com.rachitgoyal.updatetimer";
    }

    public interface NOTIFICATION_ID {
        int FOREGROUND_SERVICE = 101;
        int REMINDER = 102;
    }

    public interface PREFERENCES {
        String PREFS_NAME = "ScreenTimerPreferences";
        String MAX_TIME_OPTION = "MaxTimeOption";
        String PREFS_ALLOW_TRACKING = "AllowTracking";
        String PREFS_SHOW_TUTORIAL = "ShowTutorial";
        String PREFS_SHOW_NOTIFICATIONS = "ShowNotifications";
        String PREFS_RINGTONE = "Ringtone";
        String PREFS_VIBRATE = "Vibrate";
    }

    public interface EXTRAS {
        String START_TIMER = "StartTimer";
        String STOP_TIMER = "StopTimer";
        String TYPE_OF_WEBVIEW = "TypeOfWebView";
    }
}
