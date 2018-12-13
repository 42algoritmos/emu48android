package com.regis.cosnier.emu48;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.ParcelFileDescriptor;
import android.view.View;

public class NativeLib {

    static {
        System.loadLibrary("native-lib");
    }

    public static native void start(AssetManager mgr, Bitmap bitmapMainScreen, MainActivity activity, MainScreenView view);
    public static native void stop();
    //public static native void resize(int width, int height);
    public static native void draw();
    public static native void buttonDown(int x, int y);
    public static native void buttonUp(int x, int y);
    public static native void keyDown(int virtKey);
    public static native void keyUp(int virtKey);


    //public static native String getCurrentFilename();
    public static native int getCurrentModel();

    public static native int onFileNew(String kmlFilename);
    public static native int onFileOpen(String filename);
    public static native int onFileSave();
    public static native int onFileSaveAs(String newFilename);
    public static native int onFileClose();
    public static native void onObjectLoad();
    public static native void onObjectSave();
    public static native void onViewCopy();
    public static native void onStackCopy();
    public static native void onStackPaste();
    public static native void onViewReset();
    public static native void onBackupSave();
    public static native void onBackupRestore();
    public static native void onBackupDelete();

    public static native void setConfiguration(int settingsRealspeed, int settingsGrayscale, int settingsAutosave,
                                               int settingsAutosaveonexit, int settingsObjectloadwarning, int settingsAlwaysdisplog,
                                               int settingsPort1en, int settingsPort1wr,
                                               int settingsPort2en, int settingsPort2wr, String settingsPort2load);
}