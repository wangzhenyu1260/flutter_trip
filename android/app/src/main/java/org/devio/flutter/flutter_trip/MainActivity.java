package org.devio.flutter.flutter_trip;

import android.os.Bundle;

import org.devio.flutter.plugin.asr.AsrPlugin;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
    registerSelfPlugin();
  }

  private void registerSelfPlugin() {
    AsrPlugin.registerWith(registrarFor("org.devio.flutter.plugin.asr.AsrPlugin"));
  }
}
