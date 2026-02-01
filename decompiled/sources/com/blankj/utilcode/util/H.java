package com.blankj.utilcode.util;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private static Camera f24773a;

    /* renamed from: b, reason: collision with root package name */
    private static SurfaceTexture f24774b;

    private H() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void a() {
        Camera camera = f24773a;
        if (camera == null) {
            return;
        }
        camera.release();
        f24774b = null;
        f24773a = null;
    }

    private static boolean b() {
        if (f24773a == null) {
            try {
                f24773a = Camera.open(0);
                f24774b = new SurfaceTexture(0);
            } catch (Throwable th) {
                Log.e("FlashlightUtils", "init failed: ", th);
                return false;
            }
        }
        if (f24773a == null) {
            Log.e("FlashlightUtils", "init failed.");
            return false;
        }
        return true;
    }

    public static boolean c() {
        return E0.a().getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    public static boolean d() {
        if (!b()) {
            return false;
        }
        return "torch".equals(f24773a.getParameters().getFlashMode());
    }

    public static void e(boolean z3) {
        if (!b()) {
            return;
        }
        Camera.Parameters parameters = f24773a.getParameters();
        if (z3) {
            if (!"torch".equals(parameters.getFlashMode())) {
                try {
                    f24773a.setPreviewTexture(f24774b);
                    f24773a.startPreview();
                    parameters.setFlashMode("torch");
                    f24773a.setParameters(parameters);
                    return;
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return;
                }
            }
            return;
        }
        if (!"off".equals(parameters.getFlashMode())) {
            parameters.setFlashMode("off");
            f24773a.setParameters(parameters);
        }
    }
}
