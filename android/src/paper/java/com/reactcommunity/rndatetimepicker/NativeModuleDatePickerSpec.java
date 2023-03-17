
/**
 * This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * Then it was commited. It is here to support the old architecture.
 * If you use the new architecture, this file won't be included and instead will be generated by the codegen.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.reactcommunity.rndatetimepicker;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeModuleDatePickerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public NativeModuleDatePickerSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod
  @DoNotStrip
  public abstract void dismiss(Promise promise);

  @ReactMethod
  @DoNotStrip
  public abstract void open(ReadableMap params, Promise promise);
}
