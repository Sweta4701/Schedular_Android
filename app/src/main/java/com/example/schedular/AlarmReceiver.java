package com.example.schedular;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Display a notification or perform any action when the alarm triggers
        Toast.makeText(context, "Alarm triggered!", Toast.LENGTH_SHORT).show();

        // Get the default ringtone
        Uri defaultRingtoneUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

        // Play the default ringtone
        Ringtone ringtone = RingtoneManager.getRingtone(context, defaultRingtoneUri);
        if (ringtone != null) {
            ringtone.play();
        }
    }
}
